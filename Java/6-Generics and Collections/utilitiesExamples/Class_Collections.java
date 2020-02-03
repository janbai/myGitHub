package utilitiesExamples;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.List;



public class Class_Collections {

	public static void main(String[] args) {
		Integer [] array = {1, 12, 33, -6, 101, -60, 77, -8};
		
		List<Integer> list = Arrays.asList(array);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Comparator<Integer> cmp  = (Integer a, Integer b) -> b - a;
		Collections.sort(list, cmp );
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 101 ));
		Collections.sort(list, cmp );
		System.out.println(Collections.binarySearch(list, 101, cmp));
		
		
		System.out.println("copy-----------");
		List<Integer> dest = new ArrayList<>(Collections.nCopies(10,0));
		//List<Integer> dest = Arrays.asList(new Integer[10]);	
		System.out.println(Collections.nCopies(10, 0));	//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		Collections.copy(dest, list);
		System.out.println(dest);						// [101, 77, 33, 12, 1, -6, -8, -60, 0, 0]
		System.out.println("---------------");
		
		List<Integer> dest1= Arrays.asList(Arrays.copyOf(array, 10));
		System.out.println(dest1);						// [101, 77, 33, 12, 1, -6, -8, -60, null, null]

		Collections.fill(dest1, 100);
		System.out.println(dest1);
		
		Integer n = Collections.frequency(dest1, 100);
		System.out.println("Number of 100: " + n);
		
		Integer[] array1 = Arrays.copyOfRange(array, 2, 6); 
		List<Integer> target1= list.subList(2, 5);
		List<Integer> target2= list.subList(5, 8);
		int a = Collections.indexOfSubList(list, target1);
		int b = Collections.lastIndexOfSubList(list, target2);
		System.out.printf("%s%n%s%n", target1, target2);
		
		System.out.println(a + ", " + b);
		
		Integer max = Collections.max(list);
		Integer min = Collections.min(list);
		System.out.printf("%s  %s%n", max , min);
		
		List<Integer> list1 = Arrays.asList(array);
		
		Integer max1 = Collections.max(list1, (Integer c, Integer d) -> c - d);
		Integer min1 = Collections.max(list1, (Integer c, Integer d) -> d - c);
		System.out.printf("%s  %s%n", max1 , min1);
		
		
		List<Integer> list3 = Collections.nCopies(10, 10);// immutable list the resulting list should not be modifiable
		try {
			list3.set(1, 100);
		} catch (Exception e) {
			System.err.println(e.toString());
			System.out.println("immutable list the resulting list should not be modifiable: ");
		}
		
		System.out.println(list3);
		
		Collections.reverse(dest);
		System.out.println(dest);
		
		Collections.sort(dest,Collections.reverseOrder());
		System.out.println(dest);
		
		Collections.rotate(dest, -1);
		System.out.println(dest);
		
		Collections.shuffle(dest);
		System.out.println(dest);
		System.out.println(list);
		Collections.swap(list, 2, 6);
		System.out.println(list);
		
	}// End of main

	
}
