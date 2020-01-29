package aufgaben;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person implements Comparable<Person>{
	private String name;
	private String beruf;
	public Person(String name, String beruf) {
		this.name = name;
		this.beruf = beruf;
	}
	@Override
	public String toString() {
		return name + ", " + beruf;
	}
	public String getName() {
		return name;
	}
	public String getBeruf() {
		return beruf;
	}
	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}
	
	
	
}

public class Aufgabe_Collect_Collectors_Person {

	public static void main(String[] args) {
		Person[] personen = {
				new Person("Tom", "Bauarbeiter(in)"),	
				new Person("Jerry", "Lehrer(in)"),	
				new Person("Peter", "Metzger(in)"),	
				new Person("Paul", "Bauarbeiter(in)"),	
				new Person("Mary", "Lehrer(in)"),	
			};
		System.out.println("**** ArrayList----");
		List<Person> list = Stream.of(personen)
							.collect(ArrayList::new, List::add, List::addAll  );
		list.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getBeruf() ));
System.out.println();	
System.out.println("**** TreeSet----");
		TreeSet<Person> set = Stream.of(personen)
							.collect(TreeSet::new, TreeSet::add, TreeSet::addAll  );
		set.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getBeruf() ));
System.out.println();
System.out.println("**** HashMap----");
		
		Map<String, String> map = Stream.of(personen)
				
						.collect(Collectors.toMap(Person::getName, Person::getBeruf));
					//.collect(Collectors.toMap(Person::getName, Person::getGeburtsjahr, Math::addExact,TreeMap::new));
					// Math::max, Math::min, Math::
		
		
		map.entrySet().forEach(entry->{
		System.out.printf("%-10s %s%n", entry.getKey() , entry.getValue());  
		});
		
System.out.println();
System.out.println("**** mapping die beruf in list----");
	
		Function<Person, String> mapper = Person::getBeruf;
		Collector<String, ?, List<String>> downstream =Collectors.toList();
		List<String> beruf = Stream.of(personen)
				.collect(Collectors.mapping(mapper,downstream));

beruf.forEach(System.out::println);
System.out.println();
        System.out.println("**** mapping die beruf in array 1----");
       
        String[] array = Stream.of(personen)
				.collect(Collectors.mapping(mapper,downstream))
				.toArray(new String[personen.length]);
      
        for(String s : array) System.out.println(s);
        
        System.out.println();
        System.out.println("**** mapping die beruf in array 2----");     
        Object[] array1 =Stream.of(personen)
				.collect(Collectors.mapping(mapper,downstream))
				.toArray();
        
        
        for(Object s : array1) System.out.println(s);
        
        
        
	}

}
