package aufgaben;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AufgabeCollectorsPersonen {
	
	static class Person implements Comparable<Person> {
		private String name;
		private String beruf;
		
		public Person(String name, String beruf) {
			this.name = name;
			this.beruf = beruf;
		}
		// more methods here...
		public String toString() {
			return name + "(" + beruf + ")";
		}
		
		@Override
		public int compareTo(Person p2) {
			int erg = name.compareTo(p2.name);
			
			if(erg==0) {
				erg = beruf.compareTo(p2.beruf);
			}
			
			return erg;
		}
	}
	
	public static void main(String[] args) {

		Person[] personen = {
				new Person("Tom", "Bauarbeiter(in)"),	
				new Person("Jerry", "Lehrer(in)"),	
				new Person("Peter", "Metzger(in)"),	
				new Person("Paul", "Bauarbeiter(in)"),	
				new Person("Mary", "Lehrer(in)"),	
			};
		
		System.out.println("*** A1");
		
		Supplier<Set<Person>> supplier = TreeSet::new;
		Collector<Person, ?, Set<Person>> c1 = Collectors.toCollection(supplier);
		Set<Person> set1 = Arrays.stream(personen).collect(c1);
		set1.forEach(System.out::println);
		
		System.out.println("*** A2");
		
		Collector<Person, ?, Map<String, Person>> c2 = Collectors.toMap(p -> p.name,  p -> p);
		Map<String, Person> map2 = Arrays.stream(personen).collect(c2);
		map2.forEach( (name, person) -> System.out.println(name + " -> " + person) );
		
		System.out.println("*** A3");
		
		Collector<Person, ?, Set<String>> c3 = Collectors.mapping(p -> p.beruf, Collectors.toSet());
		Set<String> set3 = Arrays.stream(personen).collect(c3);
		set3.forEach(System.out::println);
	
		System.out.println("*** A4");
		
		Function<Person, String> classifier = p -> p.beruf;
		Collector<Person, ?, Map<String, List<Person>>> c4 = Collectors.groupingBy(classifier);
		Map<String, List<Person>> berufsgruppen = Arrays.stream(personen).collect(c4);
		
		for( Map.Entry<String, List<Person>> entry : berufsgruppen.entrySet() ) {
			String beruf = entry.getKey();
			List<Person> personenVomBeruf = entry.getValue();
			System.out.println("* Beruf: " + beruf);
			System.out.println("Personen: " + personenVomBeruf);
		}
		
		System.out.println("*** A5");
		
		Collector<Person, ?, Map<Boolean, List<Person>>> c5 = Collectors.partitioningBy( p -> p.beruf.equals("Bauarbeiter(in)") );
		Map<Boolean, List<Person>> gruppenBauarbeiterinOderNicht = Arrays.stream(personen).collect(c5);
		
		List<Person> gruppeBauarbeiter = gruppenBauarbeiterinOderNicht.get(true);
		System.out.println("Bauarbeiter(inen): " + gruppeBauarbeiter);
		
		List<Person> gruppeNichtBauarbeiter = gruppenBauarbeiterinOderNicht.get(false);
		System.out.println("Nicht-Bauarbeiter(inen): " + gruppeNichtBauarbeiter);
		
	} // end of main

}
