package streamBuilding;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Stream_Collection {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList( 1, 2, 3 );
		List<Integer> list2 = Arrays.asList( 55, 77 );
				
		List<List<Integer>> list3 = Arrays.asList(list1, list2);
		System.out.println("ohne stream ...........");
		for(List<Integer> e : list3) {
		    System.out.println("size = " + e.size() + ". elements = " + e);
		}
		
		
		
		Consumer<List<Integer>> action = list -> {
			for (Integer item : list) {
				System.out.println(item);
			}
		};
		
		
		Consumer<List<Integer>> action1 = item -> {
			System.out.print("size= " + item.size() + ". elements = ");
			item.forEach( i -> System.out.print(i +" "));
			System.out.println();
		};
		System.out.println();
		System.out.println("mit Stream.of list1, list2  ..............");
		Stream.of(list1, list2)
		.forEach( e -> System.out.println("size = " + e.size() + ". elements = " + e) );
		System.out.println();
		
		Stream.of(list1, list2).forEach(action1);
		System.out.println();
		
		System.out.println("Stream.Builder<list>..........");
		Stream.Builder<List<Integer>> builder = Stream.builder(); 
		Stream<List<Integer>> stream = builder.add(list1) 
                                    .add(list2) 
                                    .build(); 
		stream.forEach(action1);
		System.out.println();
		
		System.out.println("Stream.Builder<list<List>>..........");
		
		Consumer<List<List<Integer>>> action2 = item -> {
			
			item.forEach( e -> System.out.println("size = " + e.size() + ". elements = " + e));
			System.out.println();
		};
		
		Stream.Builder<List<List<Integer>>> builder1 = Stream.builder(); 
		Stream<List<List<Integer>>> stream1 = builder1.add(list3).build();
		
		stream1.forEach(action2);
		
		System.out.println("Stream.of <list<List>>..........");
		Stream.of(list3).forEach(action2);
		System.out.println();
		
		
		
		
				
		
	}

}
