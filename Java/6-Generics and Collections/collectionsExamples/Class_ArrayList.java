package collectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Class_ArrayList {

	public static void main(String[] args) {

		List<Integer> immutableList = Arrays.asList(11, 23, -7, 14, 77, -97, 14, 23, 100, 207, 160, 49);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(immutableList);
		System.out.println(arrayList);
		arrayList.add(50);
		
		Vector<Integer> vector = new Vector<>(immutableList);
				
		
		System.out.println("Enumeration -------------");
		
  
        // At beginning e(cursor) will point to 
        // index just before the first element in v 
        Enumeration e = vector.elements(); 
  
        // Checking the next element availability 
        while (e.hasMoreElements()) 
        { 
            // moving cursor to next element 
            int i = (Integer)e.nextElement(); 
  
            System.out.print(i + " "); 
        }
        
        System.out.println(vector.capacity());
		System.out.println(vector.size());
		
		System.out.println(vector);
		vector.setSize(15);
		System.out.println(vector.size());
		System.out.println(vector);
		System.out.println(Arrays.toString(vector));
	}

}
