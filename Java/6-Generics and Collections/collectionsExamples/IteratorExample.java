package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;


public class IteratorExample {

	

	public static void main(String[] args) {


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
		
		// iterator()
		Iterator<Integer> iterator = coll.iterator();
		
		
		
		iterator.next();										// next() read x = 10
		iterator.remove();							//remove 10  the last reading next()
		//hasNext()
		System.out.println("print Iterator < 13 :");
		while( iterator.hasNext()) { 	
			Integer x = iterator.next();// read next 11, 12, 13
			if (x < 13 ) {
				System.out.println("x  : " + x);	// print only x: 11, x : 12						
			}else break;
		}
		
		iterator.remove();				// remove 13 the last reading element after forEachRemaining
		int nextIterator = iterator.next();							// read 14
		System.out.println("next Iterator= " + nextIterator);	// print 14
		iterator.remove();	//remove 14  the last reading next()											
		//iterator.forEachRemaining(System.out::println);			// print 15
		iterator.forEachRemaining((n) -> System.out.println("the remaining elements: " + n));
			
		try {
			iterator.next();			// no next element
		} catch (NoSuchElementException e) {
			System.out.println("Fehler! Es gibt keine weiteren Elemente zum Iterieren");
		}
		
		iterator.forEachRemaining(System.out::println); // nothing Remaining
		
		//you can use foreach  print 11, 12, 15 (10, 13, 14 removed)
		for (Integer x : coll) {
			System.out.println("x = " + x);
		}
		System.out.println("Iterable ***");
		Iterable<Integer> iterable = coll;
		//MyIterable<Integer> myList = new MyIterable<>(coll);
		iterable.forEach(System.out::println);
		
	}

}
