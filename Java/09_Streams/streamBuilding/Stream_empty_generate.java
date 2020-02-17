package streamBuilding;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Stream_empty_generate {

	public static void main(String[] args) {


		System.out.println("Stream.empty ----------------------");

		Stream.empty()
			.forEach(System.out::println);
		
		System.out.println("Stream.of ----------------------");
		Stream.of(1, 2, 3, 4)
			.forEach(System.out::println);
		
		System.out.println("Stream.generate Random----------------------");
		Supplier<Double> s = () -> Math.random();
		Stream.generate(s)
				.limit(10)
				.forEach(System.out::println);
				
		
		
		
	}

}
