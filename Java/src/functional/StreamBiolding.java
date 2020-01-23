package functional;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;



public class StreamBiolding {
	public static void main(String[] args) {
		mitMethodenVonStream();
	}
	
	public static void mitMethodenVonStream() {
		Consumer<? super Object> action =System.out::println ;
		
		Stream.empty().forEach(System.out::println);
		
		Supplier<Integer> s = () -> 2;
		Stream.generate(s ).limit(5).forEach(action);
		System.out.println("----------");
		
		Integer seed = 10;
		UnaryOperator<Integer> operator =i -> i+1;
		Stream.iterate(seed, operator).limit(10).forEach(action);;
		System.out.println("----------");
		
		Integer[] arrInt = {2, 4, 6, 8};
		Stream.of(arrInt).forEach(action );
		System.out.println("----------");
		
		Stream.of(77).forEach(action);
		System.out.println("----------");
		
		Stream.<Integer[]>of(arrInt).forEach(action);
		
		
		
		
	}
	
	
}
