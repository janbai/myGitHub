package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

//die Klasse brauchen nicht static
interface Filter {
	public abstract boolean istOk(int value);
}

class FilterGerade implements Filter {
	@Override
	public boolean istOk(int value) {
		return value %2 == 0;
	}
}

class FilterPositive implements Filter {
	@Override
	public boolean istOk(int value) {
		return value > 0;
	}
}


class FilterStartMitEins implements Filter {
	@Override
	public boolean istOk(int value) {
		String valueAsString = String.valueOf( Math.abs(value) );
		
		return valueAsString.charAt(0) == '1';
	}
}



public class Aufgabe_Lambdas {
	
//die Klasse hier brauchen static	
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
        
        
        System.out.println("------------------------");
        ArrayList<Integer> intlist = new ArrayList<>();

        intlist.add(12);
        intlist.add(13);
        intlist.add(14);
        intlist.add(15);
        intlist.add(-4);
        intlist.add(77);

        System.out.println("list_Int: " + intlist);

   
        ArrayList<Integer> listGerade = filtern(intlist, (Integer z) ->  z> 0 && z%2==0);

        System.out.println("list_Int gerade & positive: " + listGerade); // 12, 14, -4
        
        FilterStartMitEins filter1 =new FilterStartMitEins() ;
        
        
        ArrayList<Integer> listGerade1 = filtern1(intlist, filter1);
		System.out.println("list_Int FilterStartMitEinse: " + listGerade1); // 12, 14, -4
		
		
	}//end of main 
	
	
	
	
	static ArrayList<Integer> filtern(ArrayList<Integer> list, Predicate<Integer> filter) {
		   ArrayList<Integer> back = new ArrayList<>();
		       
		   for (Integer value : list) {
			     if(filter.test(value)){
			          back.add(value);
			       }
		       }
		       return back;
		      }
	static ArrayList<Integer> filtern1(ArrayList<Integer> list, Filter filter) {
		ArrayList<Integer> back = new ArrayList<>();
		
		for (Integer value : list) {
			if( filter.istOk(value) ) {
				back.add(value);
			}
		}
		
		return back;
	}
}
