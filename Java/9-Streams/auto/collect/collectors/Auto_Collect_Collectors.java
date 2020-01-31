package auto.collect.collectors;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Auto_Collect_Collectors {

	public static void main(String[] args) {
		

		List<Auto> autos = Arrays.asList(
				new Auto("VW", "Golf"),
				new Auto("VW", "Polo"),
				new Auto("Opel", "Corsa"),
				new Auto("Opel", "Astra")
			);

System.out.println("###### A1. mapping");
		Collector<String, ?, Set<String>> downstream = Collectors.toSet();
		Function<Auto, String> mapper = Auto::getHersteller;
		Collector<Auto, ?, Set<String>> collector = Collectors.mapping(mapper, downstream);
		Set<String> set1 = autos.stream().collect(collector);
		System.out.println(set1); // mögliche Ausgabe: [VW, Opel]
		set1.forEach(a -> System.out.println(a));
		
		
System.out.println();			
System.out.println("###### A2. groupingBy Hersteller:");			
		
		Function<Auto, String> classifier = Auto::getHersteller;
		Map<String, List<Auto>> map2 = autos.stream().collect(Collectors.groupingBy(classifier));
		System.out.println(map2); 
		// Ausgabe: {Opel=[Opel/Corsa, Opel/Astra], VW=[VW/Golf, VW/Polo]}
		
		printGroup(map2);	

		
System.out.println();			
System.out.println("###### A3. groupingBy Modell:");			
		Function<Auto, String> classifier3 = Auto::getModell;
		Map<String, List<Auto>> map3 = autos.stream().collect(Collectors.groupingBy(classifier3));
		System.out.println(map3); 
		// mögliche Ausgabe: {VW=[Golf, Polo], Opel=[Corsa, Astra]}

		printGroup(map3);
		
System.out.println();			
System.out.println("###### A4. groupingBy Modell:");			
				Function<Auto, String> classifier4 = Auto::getModell;
				Map<String, List<Auto>> map4 = autos.stream().collect(Collectors.groupingBy(classifier3));
				System.out.println(map3); 
				// Ausgabe: {Opel=[Opel/Corsa, Opel/Astra], VW=[VW/Golf, VW/Polo]}
				printGroup(map4);


System.out.println();
System.out.println("###### A5. partitioningBy contains 'o' :");			
			Map<Boolean, List<Auto>> map5 = autos.stream().collect(Collectors.partitioningBy(a -> a.getModell().contains("o")));
			System.out.println(map5);
			printGroup(map5);
			
	}
	static <T> void printGroup(Map<?, ? extends Collection<T>> map) {
		map.entrySet().forEach(entry->{ System.out.printf("%-40s %s%n", "Groupen ID (Hersteller): " + entry.getKey() , "elements (Modell): " + entry.getValue());	} );
	}
}
