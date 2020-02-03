package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;


public class Interface_Iterable {


	public static void main(String[] args) {
		
		Integer [] array = {1, 2, 3};
		
		System.out.println("array: " + Arrays.toString(array));	
		//convert array to Iterable:
		Iterable<Integer> iterable = Arrays.asList(array);
		iterable.forEach(System.out::println);
				
		Collection<Integer> coll = new ArrayList<>();
		coll.add(10);
		coll.add(11);
		coll.add(12);
		coll.add(13);
		coll.add(14);
		coll.add(15);
		coll.add(16);
		coll.add(17);
		coll.add(18);
			
		// convert Collection to Iterable:
		Iterable<Integer> iterable2 =  coll;
		
		iterable2.forEach(System.out::println);
		
		System.out.println("Consumer ***************");
		AtomicInteger counter = new AtomicInteger();
		//int i = 0;
		Consumer<Integer> after = entry -> System.out.println("--------"); 
		Consumer<Integer> action = entry -> { 	
				if(entry%2 == 0) {
				System.out.println("x" + counter.incrementAndGet() + ": " + entry);
				after.accept(entry);
				}
				
		};
		iterable2.forEach( action );
		Consumer<Integer> action1 = entry -> System.out.print("(" + entry + ".2) = ");
		Consumer<Integer> after1 = entry -> System.out.println("<" + entry*2 + ">");
		
		
		
		
		
		System.out.println("Iterator -------------");
		coll.iterator().forEachRemaining(action1.andThen(after1));
		
		System.out.println("---------");
		coll.forEach(action);
	}

}
