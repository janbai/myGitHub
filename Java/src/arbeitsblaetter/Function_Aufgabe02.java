package arbeitsblaetter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class Astronaut  {
	private String name;

	public Astronaut(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Astonaut " + name ;
	}
	
	
	
}


public class Function_Aufgabe02 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A1-------------------------");
		List<String> namen =new ArrayList<>();
		
		namen.add("Tom");
		namen.add("Jerry");
		namen.add("Peter");
		namen.add("Paul");
		namen.add("Mary");
		namen.add("Ute");
		System.out.println("nomen: " + namen);
		
		List<Astronaut>listA = buildMannschaft(namen, n -> new Astronaut(n));
		
		  
		
		
	}

	
	static List<Astronaut> buildMannschaft(List<Astronaut> namen,  Astronaut n) {
		namen.add(n);
		       return namen;
		      }

}
