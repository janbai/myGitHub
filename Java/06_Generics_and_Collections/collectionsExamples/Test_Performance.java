package collectionsExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test_Performance {

	static void testAdd(List<Integer> list){
		long startTime = System.nanoTime();
		
		for (Integer i = 0; i < 100000; i++) { list.add(i);	}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.printf("%-20s %20d%n", list.getClass().getSimpleName() + " add:" , duration);
	}
	
	static void testGet(List<Integer> list){
		long startTime = System.nanoTime();
		
		for (Integer i = 0; i < 100000; i++) { list.get(i);	}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.printf("%-20s %20d%n",list.getClass().getSimpleName() + " get:  " , duration);
	}
	
	static void testRemove(List<Integer> list){
		long startTime = System.nanoTime();
		
		for (Integer i = 0; i < 100000; i++) { list.remove(i);	}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.printf("%-20s %20d%n", list.getClass().getSimpleName() + " remove:  " , duration);
	}
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		LinkedList linkedList = new LinkedList();
Vector vector = new Vector();

		testAdd(arrayList);
		
		testAdd(linkedList);
		
		testAdd(vector);
		
		testGet(arrayList);
		
		testGet(linkedList);
		testGet(vector);
		testRemove(arrayList);
		
		testRemove(linkedList);


	}

}
