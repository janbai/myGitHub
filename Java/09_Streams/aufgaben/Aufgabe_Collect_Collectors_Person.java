package aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
	public String toString() 		{ return name + ", " + beruf;}
	public String getName() 		{ return name;}
	public String getBeruf() 		{ return beruf;}
	
	@Override
	public int compareTo(Person p2) 	{
		int erg = name.compareTo(p2.name);
			if(erg == 0) {
				erg = beruf.compareTo(p2.beruf);
			}
		return erg;
		}
	
}

public class Aufgabe_Collect_Collectors_Person {
	static <T> void printGroup(Map<?, ? extends Collection<T>> map) {
		map.entrySet().forEach(entry->{ System.out.printf("%-30s %s%n", "Groupen ID: " + entry.getKey() , "elements : " + entry.getValue());	} );
	}
	public static void main(String[] args) {
		Person[] personen = {
				new Person("Tom", "Bauarbeiter(in)"),	
				new Person("Jerry", "Lehrer(in)"),	
				new Person("Peter", "Metzger(in)"),	
				new Person("Paul", "Bauarbeiter(in)"),	
				new Person("Mary", "Lehrer(in)")
				};

		System.out.println("**** partitioningBy----");		
		

		Map<Boolean, List<Person>> map5 = Stream.of(personen).collect(Collectors.partitioningBy(  p -> p.getBeruf().equals("Bauarbeiter(in)")));
		
		printGroup(map5);	
		
		
System.out.println("**** groupingBy----");
Function<String, Integer> classifier = str -> str.length();
		
	
		
		Map<String, List<Person>> map4 = Stream.of(personen).collect(Collectors.groupingBy(Person::getBeruf));
	
	printGroup(map4);	
		
		
		
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
System.out.println("**** Set----");		
		Set<Person> set1 = Arrays.stream(personen)
							.collect(Collectors.toSet() );
		System.out.println("Set Size: " + set1.size());
		set1.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getBeruf() ));

System.out.println();	
System.out.println("**** TreeSet2----");			
		TreeSet<Person> set2 = Arrays.stream(personen)
				.collect(Collectors.toCollection(TreeSet::new)  );		

		set2.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getBeruf() ));	
		
System.out.println();
System.out.println("**** HashMap----");
		Map<String, String> map = Stream.of(personen)
								.collect(Collectors.toMap(Person::getName, Person::getBeruf));
					//.collect(Collectors.toMap(Person::getName, Person::getGeburtsjahr, Math::addExact,TreeMap::new));
					// Math::max, Math::min, Math::
		
		
		map.entrySet().forEach(entry->{ System.out.printf("%-10s %s%n", entry.getKey() , entry.getValue());	} );
System.out.println();
System.out.println("**** Map2----");
			
	Map<String, Person> map2 = Arrays.stream(personen)
						.collect(Collectors.toMap(p -> p.getName(), p ->p));
			//.collect(Collectors.toMap(Person::getName, Person::getGeburtsjahr, Math::addExact,TreeMap::new));
			// Math::max, Math::min, Math::
			
			
			//map2.entrySet().forEach(entry->{ System.out.printf("%-10s %s%n", entry.getKey() , entry.getValue());	} );
		
			map2.forEach( (name,person) -> System.out.println(name + " " + person) );
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
				.collect(Collectors.mapping(Person::getBeruf,Collectors.toList()))
				.toArray(String[]::new);
      
        for(String s : array) System.out.println(s);
        
System.out.println();
System.out.println("**** mapping die beruf in array 2----");     
        Object[] array1 =Stream.of(personen)
				.collect(Collectors.mapping(Person::getName,downstream))
				.toArray();
                
        for(Object s : array1) System.out.println(s);
 

        
	}//End of main
}
