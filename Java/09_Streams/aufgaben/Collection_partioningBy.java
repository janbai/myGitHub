package aufgaben;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection_partioningBy {

	public static void main(String[] args) {
		
		Stream.of(22, -3, 7, -55, 13, 44);
		Function<Integer, Boolean> classifier = x -> x%2 == 0;
	
		Collector<Integer, ?, Map<Boolean, List<Integer>>> c1 = Collectors.groupingBy(classifier);
		Map<Boolean, List<Integer>> map1 = Stream.of(22, -3, 7, -55, 13, 44).collect(c1);
		System.out.println(map1);
		
		Predicate<Integer> predicate = x -> x%2 ==0;
		Collector<Integer, ?, Map<Boolean, List<Integer>>> c2 = Collectors.partitioningBy(predicate);
		Map<Boolean, List<Integer>> map2 = Stream.of(22, -3, 7, -55, 13, 44).collect(c2);
		System.out.println(map2);
		
		
		Collector<Integer, ? , Set<Integer>> downstream = Collectors.toSet();
		Collector<Integer, ?, Map<Boolean, Set<Integer>>> c3 = Collectors.partitioningBy(predicate, downstream);
		Map<Boolean, Set<Integer>> map3 = Stream.of(22, -3, 7, -55, 13, 44).collect(c3);
		System.out.println(map3);
		
		
		
		
		
	}

}
