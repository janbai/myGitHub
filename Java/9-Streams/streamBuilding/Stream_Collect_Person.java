package streamBuilding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Person implements Comparable<Person>{
	private String name;
	private int geburtsjahr;
	public Person(String name, int geburtsjahr)  {
		this.name = name;
		this.geburtsjahr = geburtsjahr;
	}
	@Override
	public String toString() {
		return  name + ", " + geburtsjahr;
	}
	public String getName() {
		return name;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	
	@Override
	public int compareTo(Person p) {
		
		return geburtsjahr- p.geburtsjahr;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + geburtsjahr;
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Person b2 = (Person) obj;
		return geburtsjahr == b2.geburtsjahr;
	}
	
	
	
	
}

public class Stream_Collect_Person{

	public static void main(String[] args) {

		String[] namen = {"Tom", "Jerry", "Mickey", "Mini", "Tim", "Donald"};

		Integer[] geburtsjahren = { 1960, 1972, 2001, 1930, 1980, 1972};

		System.out.println("**** ArrayList----");
		List<Person> list = Stream.iterate( 0, i-> i < namen.length, i -> ++i)
									.map(i -> new Person(namen[i], geburtsjahren[i]))
									.collect(Collectors.toList());
		
		list.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getGeburtsjahr() ));
								
		System.out.println("**** TreeSet----");
		
		TreeSet<Person> set = Stream.iterate( 0, i-> i < namen.length, i -> ++i)
									.map(i -> new Person(namen[i], geburtsjahren[i]))
									.collect(Collectors.toCollection(TreeSet::new));
		
		set.forEach(p -> System.out.printf("%-10s %s%n", p.getName(), p.getGeburtsjahr() ));
		
		System.out.println("**** HashMap----");
		Map<String, Integer> map = Stream.iterate( 0, i-> i < namen.length, i -> ++i)
								.map(i -> new Person(namen[i], geburtsjahren[i]))
										.collect(Collectors.toMap(Person::getName, Person::getGeburtsjahr));
									//.collect(Collectors.toMap(Person::getName, Person::getGeburtsjahr, Math::addExact,TreeMap::new));
									// Math::max, Math::min, Math::
		map.entrySet().forEach(entry->{
		    System.out.printf("%-10s %s%n", entry.getKey() , entry.getValue());  
		 });
		
	}

	
	
	
}
