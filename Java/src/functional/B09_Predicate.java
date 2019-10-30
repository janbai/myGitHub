package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Kreis {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis R=" + radius ;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
		
}

public class B09_Predicate {

static void	testPredicate() {
	
}
	
	public static void main(String[] args) {
		
		
		
	
		List<Kreis>list =Arrays.asList(new Kreis(3),new Kreis(3),new Kreis(3),new Kreis(3),new Kreis(3));
		

		 System.out.println("list: " + list);

		   
	        ArrayList<Kreis> listGr10 = filtern(list, kreis -> kreis.getRadius() > 10);
	        System.out.println("list: " + listGr10);
	        
	       
	}
	

	static ArrayList<Kreis> filtern(List<Kreis> list, Predicate<Kreis> filter) {
		   ArrayList<Kreis> back = new ArrayList<>();
		       
		   for (Kreis kreis : list) {
			     if(filter.test(kreis)){
			          back.add(kreis);
			       }
		       }
		       return back;
		      }
	
	// * Print Array
	public static void printArray(List[] kreis) {
		
		String fmt = "|%5s|%15s %n";
		
		System.out.printf(fmt, "Nr.", "Radius" );
		System.out.println("=======================================================================");
		for (int i = 0; i < kreis.length; i++) {
			List p = kreis[i];
			System.out.format(fmt, i+1, p);
		}
	}	
}
