package aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Aufgabe_Collect_Number {

	public static void main(String[] args) {
		String[] arr = {
				"1,2,3,4,5",
				"7,6,5,4,3",
				"123,456",
			};
		
List<Integer> list;
		
		// A
		list = new ArrayList<>();
		for (String s : arr) {
			String[] stringNumbers = s.split(",");
			
			for (String sNum : stringNumbers) {
				Integer num = Integer.valueOf(sNum);
				list.add(num);
			}
		}
		
		System.out.println(list); // [1, 2, 3, 4, 5, 7, 6, 5, 4, 3, 123, 456]
		
		pipeLine(arr);
		sumGerade(arr);
		

	}

	private static void sumGerade(String[] arr) {
		System.out.println("*********** Pipe Line");
		
		Supplier<List<Integer>> supplier = ArrayList::new;
		BiConsumer<List<Integer>, Integer> accumulator = List::add;
		BiConsumer<List<Integer>, List<Integer>> combiner = List::addAll;
		
		List<Integer> list = Arrays.stream(arr)
				.map(str -> str.split(","))
				.flatMap(Arrays::stream)
				.map(Integer::valueOf)
				.filter(x -> x%2 == 0)
				.collect(ArrayList::new, List::add, List::addAll);
		
		System.out.println(list);
	
		
	}

	static void pipeLine(String[] arr) {
		System.out.println("*********** Pipe Line");
				
				Supplier<List<Integer>> supplier = ArrayList::new;
				BiConsumer<List<Integer>, Integer> accumulator = List::add;
				BiConsumer<List<Integer>, List<Integer>> combiner = List::addAll;
				
				List<Integer> list = Arrays.stream(arr)
						.map(str -> str.split(","))
						.flatMap(Arrays::stream)
						.map(Integer::valueOf)
						.collect(ArrayList::new, List::add, List::addAll);
				
				System.out.println(list);
			}
	
}
