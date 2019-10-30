package functional;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import personen.Person;

interface IntOperation {
	int execute(int x, int y);
}


 class Sum implements IntOperation {
	@Override
	public int execute(int x, int y) {
		return x + y;
	}
} // end of Sum

 class Max implements IntOperation {
		@Override
		public int execute(int x, int y) {
			return x > y ? x : y;
		//	return Math.max(x , y);
		}
	} // end of Max

 class CPU {
	 private String hersteller;
	 private int anzahlKerne;
	 
	
	
	public CPU(String hersteller, int anzahlKerne) {
		super();
		this.hersteller = hersteller;
		this.anzahlKerne = anzahlKerne;
	}
	
	@Override
	public String toString() {
		return hersteller + ", " + anzahlKerne + " Kern(e)";
	}
	 
	
 }

 interface ListPair{
	 List<Integer> accept(List<Integer>list1,List<Integer> list2);
 }
 
 class Tmp implements ListPair{
	 public  List<Integer> accept(List<Integer>listA,List<Integer> listB){
	
		
		 return null;
	 }
 }
public class AufgabenLambdas_A1 {
	

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
		op2 =  (a, b) -> a > b ? a : b; // -> Math.max(a , b)
		System.out.println("Lambda: Max(" + x + " + " + y + ") = " + op2.execute(x, y) );
			
		
		System.out.println("A2 ------------------------");	
		List<String>vorlage = Arrays.asList("axy","mamba","abcdef","hallo welt");
		
		ArrayList<String> list = new ArrayList<>(vorlage);

		Collections.sort(list, (String s1, String s2) -> s1.length()-s2.length());  
	    System.out.println("list: " + list);
		
	    System.out.println("A3 ------------------------");		
	    List<CPU> list3 = Arrays.asList(new CPU("AMD",4),new CPU("Intel",2),new CPU("Samsung",6),new CPU("AMD",16));
		
	    list3.forEach((s)->System.out.println(s));
		
	    System.out.println("A4 ------------------------");	
	    
	    List<Integer> list4 = new ArrayList<>();
	    list4.add(2);
	    list4.add(3);
	    
	    List<Integer> list5 = new ArrayList<>();
	    list5.add(4);
	    list5.add(5);
	    
	    ListPair combiner = (listA,listB) -> {
	    	List<Integer> listBack = new ArrayList<>();
	    	listBack.addAll(list4);
	    	listBack.addAll(list5);
			return listBack;
	    	
	    };
	    
	List<Integer> list6 = combiner.accept(list4, list5);
	System.out.println(list6);
	    
	List<Integer> listTmp = new ArrayList<>();
	listTmp.add(-7);
	listTmp.add(-8);
	
		list6=combiner.accept(list4,listTmp);
	System.out.println(list6);
	    
	}//end of main
	
}
