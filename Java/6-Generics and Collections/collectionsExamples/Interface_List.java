package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.ListIterator;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Interface_List {
static void Override_ImmutableList(List<Integer> list) {


list.add(0, 15);
System.out.println(list);

}
	public static void main(String[] args) {


		List<Integer> immutableList = Arrays.asList(11, 23, -7, 14, 77, -97, 14, 23, 100);

		System.out.print("try to add element to collection from Arrays.asList: ");
		try {
			immutableList.remove(11);
		} catch (Exception e) {
			System.out.println(e.toString()); //java.lang.UnsupportedOperationException
		}
		
		List<Integer> list = new ArrayList <>(immutableList) ;
		
		Integer element = 98;
		int index = 0;
		list.add(index , element);
		System.out.println(list);
		
		UnaryOperator<Integer> operator = x -> (x%2 !=0)? x +1 : x;
		list.replaceAll(operator );
		System.out.println(list);
		
		Comparator<? super Integer> comparator = (a , b) -> a - b;
		list.sort(comparator );
		System.out.println(list);
		 List<Integer> list1;
		 list1 = list;
		System.out.println(list.equals(list1));
		System.out.println(list.hashCode() == list1.hashCode());
		System.out.println(list.get(3));
		System.out.println();
		System.out.println(list.set(3,33) == list.get(3));//false
		System.out.println(list);
		
		
		System.out.println(list + ".add(69) " +list.add(69) +  " = " + list);
		System.out.print(list);
		list.add(0,5); //void Method
		System.out.println(".add(0,5) " +  " = " + list);
		
		list.remove(1);
		System.out.println(list);
		System.out.println("indexOf(100) = " + list.indexOf(100));
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		System.out.println("Forward Direction Iteration:");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());			
		}	
		
		// Traversing elements, the iterator is at the end at this point
		System.out.println("Backward Direction Iteration:");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());			
		}
		
		System.out.println(list.listIterator(3).next());
		
		System.out.println(list.indexOf(24) + ", " +list.lastIndexOf(24));
		
		List<Integer>list2 = list.subList(2, 6);
		System.out.println(list2);
		
		list2 = List.of(); // ImmutableCollections.emptyList();
		System.out.println(list2);
		list2= List.of(1, 2, 3, 4, 5);
		
		System.out.println(list2);
		List<Integer> list3 =List.copyOf(list2);
		list3.forEach(System.out::println);


		List<String> listA = new ArrayList<>(); 
        listA.add("Geeks"); 
  
        // Create ImmutableList from List using copyOf() 
        List<String> iList = Collections.unmodifiableList(listA); 
  
        // We change List and the changes reflect in iList. 
        listA.add("For"); 
        listA.add("Geeks"); 
  
        System.out.println(iList); 
        
       
	}

}
