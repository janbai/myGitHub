package practice;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collectors_mapping {

	public static void main(String[] args) {


		String[] array = {"aaaa", "bb", "cccc", "dd"};
		Collector<String, ?, List<String>> c0 = Collectors.toList();
		
		List<String> list0 = Arrays.stream(array).collect(c0);
		System.out.println(list0);
		List<Integer> list1 = Arrays.stream(array)
				.map(String::length)
				.collect(Collectors.toList());
		
		
		System.out.println(list1);
		Function<String, Integer> mapper = String::length;
		Collector<Integer, ?, List<Integer>> downstream =Collectors.toList() ;
		
		Collector<String, ?, List<Integer>> c2 = Collectors.mapping(mapper, downstream);
			
		List<Integer> list2 = Arrays.stream(array).collect(c2);
		
		System.out.println(list2);
		
		Integer[] zahlen = {101010, 22, 333, 4444};
		
		
		Function<Integer, String> mapper2 = String::valueOf;
		Collector<String, ?, TreeSet<String>> downstream2 =Collectors.toCollection(TreeSet::new) ;
		
		Collector<Integer, ?, TreeSet<String>> c3 = Collectors.mapping(mapper2, downstream2);
		
		TreeSet<String> list3 = Arrays.stream(zahlen).collect(c3);
		System.out.println(list3);
	}

}
