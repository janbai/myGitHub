package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class Interface_Collection {

	public static void main(String[] args) {
		
//interface Collection<E> extends Iterable<E>
		
		Collection<Integer> coll = Arrays.asList(11, 12, 13, 14, 15, 97, 100);
		
		System.out.println("test System.out.println Collection: " +coll);
		System.out.println("int size() = " + coll.size());
		System.out.println("boolean isEmpty() = " + coll.isEmpty());
		System.out.println("contains(Object) 13 = " + coll.contains(13));
		
			
		System.out.print("generate an array from a collection using toArray: ");
		
		IntFunction<Integer[]> generator = Integer[]::new;
		
		Integer[] generateArray = coll.toArray(generator );
		
		for (Integer integer : generateArray) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println(Arrays.asList(generateArray));
		
		System.out.print("try to add element to collection from Arrays.asList: ");
		
		try {
			coll.add(16);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.print("add element to new ArrayLis - ");
		Collection<Integer> coll2 = new ArrayList<>();
		
		System.out.println("boolean add(E e) 16 : " + coll2.add(16));
		
		System.out.print("try to remove element from collection that is Arrays.asList: ");
		
		try {
			coll.remove(11);
		} catch (Exception e) {
			System.out.println(e.toString()); //java.lang.UnsupportedOperationException
		}
		
		System.out.print("remove element to new ArrayLis - ");
				
		System.out.println("boolean remove(E e) 11 : " + coll2.add(11));
	
		System.out.println("boolean remove(E e) 16 : " + coll2.remove(11));
		Collection<Integer> coll3 = Arrays.asList(13, 14, 11);
		System.out.println(coll3);
		System.out.println(coll + " containsAll( " + coll3 + " ) = " + coll.containsAll(coll3));
		System.out.print(coll2 +" addAll " + coll3 +" = ");
		coll2.addAll(coll3);
		System.out.println(coll2);
		char ch = 97;
		System.out.println(ch + " " +coll.contains(ch));//false
		
		Character[] charArray = {'a', 'b', 100};
		Collection<Character> charColl = Arrays.asList(charArray);
		System.out.println(charColl.contains('d')); //true
		System.out.println(coll2.removeAll(coll3));
		System.out.println(coll2);
		
		Predicate<? super Integer> filter = i -> i%4 ==0;
		coll2.removeIf(filter );
		System.out.println(coll2.size());
		
		coll2.addAll(coll);
		coll2.remove(11);
		
		System.out.print(coll2 + " retainAll "+ coll3 + " = ");
		coll2.retainAll(coll3);
		System.out.println(coll2);
		
		System.out.print(coll2 + ".clear() = "); coll2.clear();
		System.out.println(coll2);
		
		coll.stream().forEach(System.out::println);
		
		
		
		
	}//End of main
	

}
