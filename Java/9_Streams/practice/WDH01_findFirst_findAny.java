package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WDH01_findFirst_findAny {

	
	public static void main(String[] args) {

		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		BinaryOperator<Integer> accumulator1 = Integer::sum ;
				
		list.stream()
				.reduce(accumulator1 )
				.ifPresent(s -> System.out.println(s));
		
				Integer identity = 0;
				BinaryOperator<Integer> combiner = (x1, x2) ->{
					System.out.println("in compiner-apply...");
					return x1 + x2;
				};
				BiFunction<Integer, Integer, Integer> accumulator = (x1, x2) ->{
					System.out.println("x1=" + x1 + ", x2="+ x2);
					return x1 + x2;
				};
				Integer sum = list.stream()
						.parallel()
						.reduce(identity, accumulator , combiner);

	
			System.out.println("sum: " + sum);
			
			
			
			Integer sum1 =  Stream.of(5, 3, 2, 7, 3, 13, 7)
			 //.parallel()
			.reduce(1, (a, b) -> a + b, (x, y) -> x - y); 
			System.out.println("sum: " + sum1);
			
			
			List<Integer> intLst = Arrays.asList(1, 3, 5, 2, 9, 8, 15, 12);
			 
			int result = intLst.parallelStream()
					.parallel()
					.reduce(0, (subTotal, e) -> subTotal + e, Integer::sum);
			 
			System.out.println("result = " + result);
			
			Integer[] zahlen = {1, 2, 3, 4};
			
			Arrays.stream(zahlen)
						.reduce((x1, x2) -> x1 * x2)
						.ifPresent(x -> System.out.println(x));
			
			Integer produkt = Arrays.stream(zahlen)
							.reduce(1, (x1, x2) -> x1 * x2);
			System.out.println(produkt);
			
			BinaryOperator<Integer> combiner2 = (x1, x2) ->{
				System.out.println("in compiner-apply...");
				return x1 + x2;
			};
			BiFunction<Integer, Integer, Integer> accumulator2 = (x1, x2) ->{
				System.out.println("x1=" + x1 + ", x2="+ x2);
				return x1 * x2;
			};
			Integer produkt2 = Arrays.stream(zahlen)
					.parallel()
					.reduce(1, accumulator2 , combiner2);
				System.out.println("result: " + produkt2);
			
				
				Double[] zahlen1 = {1.3, -2000.77, 5.9, -33.1, 0.8};	
				
				System.out.println(Arrays.stream(zahlen1)
						.filter(x -> x<0)
						.count());
				System.out.println("-----------------");
				
				Arrays.stream(zahlen1)
							.map(Double::intValue  ) 
							.forEach(System.out::println);

				
				
				
	}
	 
}
