package practice;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B19_Collectors_groupingBy {


	public static void main(String[] args) {
		
		
	kleineAufgabe1();
	System.out.println();
	kleineAufgabe2();
	System.out.println();
	kleineAufgabe3();
	System.out.println();
	kleineAufgabe4();
	
	System.out.println();
	kleineAufgabe5();
	
	System.out.println();
	kleineAufgabe6();
	
	
	
	
	
	}
static void kleineAufgabe6() {
		
		
		Supplier<Map<String, TreeSet<String>>> mapFactory = TreeMap::new;
		Function<Integer, String> classifier = x -> x<0? "negative": x==0 ? "zero": "positive";
		
		Collector<Integer, ?, TreeSet<Integer>> downstream = Collectors.toCollection(TreeSet::new);
		
		Collector<Integer, ?, Map<String, TreeSet<Integer>>> c1 = Collectors.groupingBy(classifier, TreeMap::new,downstream);
		
		
		Integer[] array = {12, -22, 0, 77, 0, -5, -5, 33, 6};
		
		
		Map<String, TreeSet<Integer>> map = Stream.of(array)
						
						.collect(c1);
		
		printGroup(map);
	}
	
static  void kleineAufgabe5() {
	Supplier<Map<Integer, HashSet<String>>> mapFactory = LinkedHashMap::new;			
	Function<String, Integer> classifier = String::length;
	
	Collector<String, ?, HashSet<String>> downstream = Collectors.toCollection(HashSet::new);
	
	Collector<String, ?, Map<Integer, HashSet<String>>> c1 = Collectors.groupingBy(classifier, mapFactory, downstream);
	
	Map<Integer, HashSet<String>> groups = Stream.of("abc", "hallo", "fff", "xy", "welt", "123", "CC").collect(c1);
	
	printGroup(groups);
	}
	
static void kleineAufgabe3() {
	Function<String, Integer> classifier = String::length;
			
	Collector<String, ?, HashSet<String>> downstream = Collectors.toCollection(HashSet::new);
	
	Collector<String, ?, Map<Integer, HashSet<String>>> c1 = Collectors.groupingBy(classifier, downstream);
	
	Map<Integer, HashSet<String>> map = Stream.of("abc", "hallo", "fff", "xy", "welt", "123", "CC").collect(c1);

	printGroup(map);	
			
		}
	
	static void kleineAufgabe4() {
		
		Function<Integer, String> classifier = x -> x<0? "negative": x==0 ? "zero": "positive";
		
		Collector<Integer, ?, TreeSet<Integer>> downstream = Collectors.toCollection(TreeSet::new);
		
		Collector<Integer, ?, Map<String, TreeSet<Integer>>> c1 = Collectors.groupingBy(classifier, downstream);
		
		
		Integer[] array = {12, -22, 0, 77, 0, -5, -5, 33, 6};
		
		
		Map<String, TreeSet<Integer>> map = Stream.of(array)
						
						.collect(c1);
		
		printGroup(map);
	}
	
	
	static void kleineAufgabe1() {
Function<String, Integer> classifier = str -> str.length();
		
		Collector<String, ?, Map<Integer, List<String>>> c1 = Collectors.groupingBy(classifier);
		
		Map<Integer, List<String>> map = Stream.of("abc", "hallo", "fff", "xy", "welt", "123", "CC").collect(c1);
	
	printGroup(map);	
		
	}
	static void kleineAufgabe2() {
		Integer[] array = {12, -22, 0, 77, 0, -5, -5, 33, 6};
		
		Map<Object, List<Integer>> map = Stream.of(array)
						.collect(Collectors.groupingBy(i -> i<0? "negative": i==0 ? "zero":"positive"));
		
		printGroup(map);
	}
	
static <T> void printGroup(Map<?, ? extends Collection<T>> map) {
	map.entrySet().forEach(entry->{ System.out.printf("%-24s %s%n", "Groupen ID: " + entry.getKey() , "elements : " + entry.getValue());	} );
}

}
