package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class IterableExample {

	public static void main(String[] args) {


		Integer [] array = {1, 2, 3};
		
		
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
		iterable2.iterator().remove();
		
		
		
	}

}
