package intermediate_operations;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class intermediate_limit_skip {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Numbers with limit");
		
		Integer[] seed = new Integer[]{0, 0, 1};
		UnaryOperator<Integer[]> operator = n -> new Integer[] {++n[0], n[2], n[1] + n[2]};
		long maxSize = 10;
		long toSkip = 3;
		Consumer<Integer[]> action = e -> System.out.printf("%-5s %s%n", e[0],e[1]);
		Function<Integer[], Integer[]> mapper = n-> new Integer[] {n[0],n[2]};
		ToIntFunction<Integer[]> mapperToInt = n -> n[2];
		
		Stream.iterate(seed, operator)
				.skip(toSkip )
				.limit(maxSize)
				.map(mapper)
				.forEach(action);
			
		
		Integer sum = Stream.iterate(seed, operator)
				.skip(toSkip )
				.limit(maxSize)
				.mapToInt(mapperToInt )
				.sum();
		System.out.println("The sum of " + maxSize + " Fibonacci numbers after " + toSkip + " = " + sum);	

		
		
	}

}
