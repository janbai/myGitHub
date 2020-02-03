package utilitiesExamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

public class Class_Arrays {

	public static void main(String[] args) {
		
		Integer [] array1 = {1, 12, 36, -6, 100, 60, 77};
		System.out.println(array1.length);
		Collection<Integer> coll = Arrays.asList(array1);
		List<Integer> list = Arrays.asList(array1);
		
		System.out.println(coll);
		
		Arrays.sort(array1); //sortieren nur array

		for (Integer a : array1) { System.out.print(a + " ");}
		System.out.println();
		
		Integer key = 100;
		System.out.println("search(" + key  + "): " + Arrays.binarySearch(array1, key));
		
		Integer[] array2; // 0
		
		array2 = null;
		System.out.println(Arrays.compare(array1, array2)); // 1
		System.out.println(Arrays.equals(array1, array2)); //false
		
		array2 = array1;
		System.out.println(Arrays.compare(array1, array2)); // 0
		System.out.println(Arrays.equals(array1, array2)); // ture
		System.out.println(Arrays.hashCode(array1)==Arrays.hashCode(array2));// true
		
		Integer [] array3 =  {-6, 12, 36, 60, 121, 77, -6};
		System.out.println(Arrays.compare(array1, array3)); // -1
		System.out.println(Arrays.equals(array1, array3)); // false
		
		Integer[] array4 = Arrays.copyOf(array1, 10);
		for (Integer a : array4) { System.out.print(a + " ");} // -6 1 12 36 60 77 100 null null null 
		System.out.println();
		
		Integer[] array5 = Arrays.copyOfRange(array4, 2, 5); // 12 36 60 
		for (Integer a : array5) { System.out.print(a + " ");}
		System.out.println();
		
		System.out.println(Arrays.equals(array1, 2, 4, array3, 1, 3)); // true
		
		System.out.println("using Comparator interface ********************");
		Integer [] array6 =  {-6, 1, 12, 36, 60, 121, 77, -3};
		Comparator<Integer> cmp  = (Integer a, Integer b) -> a - b;
		System.out.println(Arrays.mismatch(array1, 0, 6, array6, 0, 6, cmp));//5
		//Note in compare: aToIndex the index (exclusive) of the last element in thefirst array to be compared
		System.out.println(Arrays.compare(array1, 0, 5, array6, 0, 5, cmp));//0  the first mismatch index is 6
		System.out.println(Arrays.compare(array1, 0, 7, array6, 0, 7, cmp));//-44 = 121-77 the index 6  
		
		try {
			Arrays.compare(array1, 0, 10, array6, 0, 10, cmp);
		} catch (Exception e) {
		System.err.println(e.toString());//ArrayIndexOutOfBoundsException: Array index out of range: 10
		}
		
		try {
			Arrays.compare(array1, 3, 2, array6, 3, 2, cmp);
		} catch (Exception e) {
		System.err.println(e.toString());//IllegalArgumentException: fromIndex(3) > toIndex(2)
		}
		
		
		Integer [] array7 = null;
		try {
			System.out.println(Arrays.compare(array1, 0, 6, array7, 0, 6, cmp));
		} catch (Exception e) {
		System.err.println(e.toString());//NullPointerException
		}
		System.out.println();
			
		
		Arrays.fill(array6, 100);
		for (Integer a : array6) { System.out.print(a + " ");} // 100 100 100 100 100 100 100 100
		System.out.println();
	
		try {
			Arrays.fill(array7, 100);
		} catch (Exception e) {
		System.err.println(e.toString());//array7 = null <-- NullPointerException
		}
	
		try {
			Arrays.fill(array6, 10.10);
		} catch (Exception e) {
		System.err.println(e.toString());// ArrayStoreException: java.lang.Double
		}
		
		for (Integer a : array6) { System.out.print(a + " ");} // 100 100 100 100 100 100 100 100 
		System.out.println();
		
		Integer[] array8 = new Integer[10];
		IntFunction<Integer> generator = a -> a ;
		Arrays.setAll(array8, generator);
		for (Integer a : array8) { System.out.print(a + " ");} // 0 1 2 3 4 5 6 7 8 9 
		System.out.println();

		 Arrays.setAll(array6, i -> array6[i]*2);
		 for (Integer a : array6) { System.out.print(a + " ");} // 200 200 200 200 200 200 200 200 
			System.out.println();
			
			
		Arrays.sort(array8, (Integer a, Integer b) -> b - a);
		 for (Integer a : array8) { System.out.print(a + " ");} // 9 8 7 6 5 4 3 2 1 0 
			System.out.println();
		
			String[] array9 = {"f", "e", "c","a","d","b"};
		Arrays.sort(array9, (String x, String y) -> x.compareTo(y));
			 for (String a : array9) { System.out.print(a + " ");} // a b c d e f 
				System.out.println();

		Arrays.sort(array8, 3, 10, (Integer a, Integer b)-> a - b );
		for (Integer a : array8) { System.out.print(a + " ");} // 9 8 7 0 1 2 3 4 5 6
		System.out.println();

			Arrays.stream(array8).forEach((n) -> System.out.print(n + " "));//convert to Stream : 9 8 7 0 1 2 3 4 5 6 
			System.out.println();
		Arrays.stream(array8, 3, 7).forEach((n) -> System.out.print(n + " "));//0 1 2 3 
		System.out.println();
		try {
			Arrays.stream(array8, 11, 15);
		} catch (Exception e) {
		System.err.println(e.toString());//  ArrayIndexOutOfBoundsException
		}
		
		try {
			Arrays.stream(array8, -9, 1);
		} catch (Exception e) {
		System.err.println(e.toString());//  ArrayIndexOutOfBoundsException
		}
		
		
		System.out.println(Arrays.asList(array8).toString());// convert to List: [9, 8, 7, 0, 1, 2, 3, 4, 5, 6]
		
		
	}
}
