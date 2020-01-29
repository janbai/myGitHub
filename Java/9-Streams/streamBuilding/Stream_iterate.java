package streamBuilding;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Stream_iterate {

	public static void main(String[] args) {

		System.out.println("Stream.iterate ----------------------");
		
		
		UnaryOperator<Integer> operator = i -> ++i;
		Integer seed = 1;
		Stream.iterate(seed , operator)
				.limit(3)
				.forEach(System.out::println);
		
		System.out.println("Fibonacci Numbers with limit");
		
		Stream.iterate(new int[]{0, 0, 1}, n -> new int[]{n[0] + 1 ,n[2], n[1] + n[2]})
		.limit(10)
		.map(n-> new int[] {n[0],n[2]})
		.forEach(e -> System.out.printf("%-5s %s%n", e[0],e[1]));
		
		System.out.println("Fibonacci Numbers with next, hasNext if <100 without limit:");
		Integer[] seed2 = new Integer[]{0, 0, 1};
		UnaryOperator<Integer[]> next2 = n -> new Integer[] {n[0] + 1 , n[2], n[1] + n[2]};
		Predicate<Integer[]> hasNext2 = n -> n[2] < 100;
		Function<Integer[], Integer[]> mapper = n-> new Integer[] {n[0],n[2]};
		Stream.iterate(seed2, hasNext2, next2)
		//.limit(10)
		.map(mapper )
		.forEach(e -> System.out.printf("%-5s %s%n", e[0],e[1]));
		
		System.out.println("Sum all the Fibonacci values:");
		
		int sum = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[1]) // Stream<Integer>
                .mapToInt(n -> n)
                .sum();
		System.out.println("Fibonacci 10 sum : " + sum);	
		
		System.out.println("Stop the stream iteration if n<=10:");
		
		Integer seed1 = 1;
		UnaryOperator<Integer> next = i -> ++i;
		Predicate<Integer> hasNext = i -> i <= 10 ;
		Stream.iterate(seed1 , hasNext  , next)
        .forEach(x -> System.out.println(x));
	}

}
