package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Aufgabe_Lambdas {
	
	interface IntOperation {
		int execute(int x, int y);
	}
	
	
	static class Sum implements IntOperation {
		@Override
		public int execute(int x, int y) {
			return x + y;
		}
	} // end of Sum
	
	static class Max implements IntOperation {
		@Override
		public int execute(int x, int y) {
			return Math.max(x , y);
		}
	} // end of Max
	
	
	
	
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		System.out.println("A1 ------------------------");		
		IntOperation op1= new Sum();
		System.out.println("Sum (" + x + " + " + y + ") = " + op1.execute(x, y));
		
		op1=null;
		op1 =  (a, b) -> a - b;
		System.out.println("Lambda: Sum(" + x + " + " + y + ") = " + op1.execute(x, y) );
		
		System.out.println("------------------------");
		x = -6;
		y = 17;
		IntOperation op2= new Max();
		System.out.println("Max (" + x + " + " + y + ") = " + op2.execute(x, y));
		
		op2=null;
		op2 =  (a, b) -> Math.min(a, b);
		System.out.println("Lambda: Max(" + x + " + " + y + ") = " + op2.execute(x, y) );
		
		System.out.println("A2 ------------------------");	
		ArrayList<String> list = new ArrayList<>();

        list.add("pbc");
        list.add("f");
        list.add("ab");
        list.add("zbcdef");
        list.add("kbcd");
        list.add("jbcde");

        System.out.println("list: " + list);
       
        Collections.sort(list, (String s1, String s2) -> s1.compareTo(s2));   
        System.out.println("list: " + list);
        
        list.sort((String s1, String s2) -> s1.length()-s2.length()); 
        System.out.println("list: " + list);
        list.forEach((s)->System.out.println(s));
		
        Collections.sort(list, (String s1, String s2) -> s1.length()-s2.length());  
        System.out.println("------------------------");
        System.out.println("list: " + list);
	}
	
}
