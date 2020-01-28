package terminal_collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect_Terminal {

	public static void main(String[] args) {

		a();
		a1();
		a2();
		

	}

	private static void a2() {
		BiConsumer<List<Integer>,Integer> accumulator = List::add;
		Supplier<List<Integer>>supplier =ArrayList::new ;
		BiConsumer<List<Integer>, List<Integer>> combiner = List::addAll;
		
		Collector<Integer, ?, List<Integer>> collector = Collectors.toList();
		List<Integer> result = Stream.of(1, 2, 3, 4, 5)
			.collect(collector);
		
		System.out.println(result);
		
	}

	

	private static void a1() {
		System.out.println("A2---------------------");
		BiConsumer<StringBuilder,String> accumulator = StringBuilder::append;
		Supplier<StringBuilder>supplier =StringBuilder::new ;
		BiConsumer<StringBuilder, StringBuilder> combiner = StringBuilder::append;
		
		StringBuilder result = Stream.of("a", "bb", "ccc")
				.collect(supplier, accumulator, combiner  );
		System.out.println(result);
		
	}

	private static void a() {
		BiConsumer<List<Integer>,Integer> accumulator = List::add;
		Supplier<List<Integer>>supplier =ArrayList::new ;
		BiConsumer<List<Integer>, List<Integer>> combiner = List::addAll;
		
		List<Integer> result = Stream.of(1, 2, 3, 4, 5)
			.collect(supplier, accumulator, combiner  );
		
		System.out.println(result);
		
	}	
}
