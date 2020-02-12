package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMap_Stream {

	public static void main(String[] args) {


		List<Integer> listA = Arrays.asList(1, 2, 3);
		List<Integer> listB = Arrays.asList(11, 12, 13);
		List<Integer> listC = Arrays.asList(7, 8);
		
		Stream<Integer> streamAB = Stream.concat(listA.stream(), listB.stream());
		Stream.concat(streamAB, listC.stream())
		.forEach(System.out::println);
		System.out.println("concat --------------------");
		Stream.concat(Stream.concat(listA.stream(), listB.stream()),listC.stream()).forEach(System.out::println);
		System.out.println("flatMap -------------");
		
		
		Function<List<Integer>, Stream<Integer>> mapper1 = list-> list.stream();
		Function<List<Integer>, Stream<Integer>> mapper = List ::stream;
		Stream.of(listA, listB, listC)
		.flatMap(mapper )
		.forEach(System.out::println);

		
		


	}

}
