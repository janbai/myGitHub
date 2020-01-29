package aufgaben;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rechteck implements Comparable<Rechteck> {

	private Integer breite, hoehe;
	
	
	public Rechteck(Integer breite, Integer hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	
	public Integer getBreite() {
		return breite;
	}


	public void setBreite(Integer breite) {
		this.breite = breite;
	}

	public Integer getHoehe() {
		return hoehe;
	}

	public void setHoehe(Integer hoehe) {
		this.hoehe = hoehe;
	}

	@Override
	public String toString() {
		return "(" + breite + ", " + hoehe + ")";
	}

public Integer getArea() {
	return this.breite*this.hoehe;
	
}

	public static void main(String[] args) {
		
		
		Rechteck r1 = new Rechteck(2, 4);
		Rechteck r2 = new Rechteck(12, 8);
		Rechteck r3 = new Rechteck(3, 7);
		Rechteck r4 = new Rechteck(9, 6);
		Rechteck r5 = new Rechteck(6, 18);
		
		
		
		
		System.out.println("using collct --------------------------");
		
		
		List<Rechteck> rechteck = Stream.of(r1, r2, r3, r4, r5)
			.collect(ArrayList::new, List::add, List::addAll  );
		
		System.out.println(rechteck);
		System.out.println("-------------------");
		System.out.println("A1");
		rechteck.stream()
		.map(Rechteck::getArea)
		.forEach(System.out::println);
		
		System.out.println("A2");
		BinaryOperator<Rechteck> accumulator = null;
		
		rechteck.stream()
		.map(Rechteck::getArea)
		.reduce(Integer::sum )
		.ifPresent(x -> System.out.println("Total Area= " + x));
	
					
				
		
		System.out.println();
		
		
		Predicate<? super Rechteck> predicate = r -> r.getBreite()>4 && r.getHoehe()>4;
		
		rechteck.stream().filter(predicate ).forEach(System.out::println);
		
		
		
		
		System.out.println("------sorted by area-----------------");
		Comparator<? super Rechteck> comparator = Comparator.comparing(Rechteck::getArea);
		Comparator<? super Rechteck> comparator1 = Comparator.comparingInt(Rechteck::getHoehe);
		rechteck.stream().sorted(comparator )
					  .forEach(System.out::println);
		
		
		
		System.out.println("-----------------");
		rechteck.stream().sorted(comparator1 )
		  .forEach(System.out::println);
		System.out.println("-----------------");
		rechteck.stream()
					.sorted(comparator.reversed())
					.forEach(System.out::println);
		System.out.println("-----------------");
		
		rechteck.stream()
		.sorted((p1, p2)-> p2.getBreite() - p1.getBreite())
		.forEach(System.out::println);
		System.out.println("----sorted by area-------------");
		rechteck.stream()
		.sorted((p1, p2)-> p1.compareTo(p2))
		.forEach(System.out::println);
		
		System.out.println("Stream sorted() with Map ");
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(2, 4);
		map.put(12, 8);
		map.put(3, 7);
		map.put(9, 6);
		map.put(6, 18);
		
		System.out.println("---Sort by Map Key (Breite)---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
        .forEach(e -> System.out.println("("+ e.getKey() +", "+ e.getValue()+ ")"));
		
		System.out.println("---Sort by Map Value (Hoehe)---");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
          .forEach(e -> System.out.println("("+ e.getKey() +", "+ e.getValue() + ")"));

	
		
	}


	

	@Override
	public int compareTo(Rechteck r2) {
		// TODO Auto-generated method stub
		return breite*hoehe - r2.breite*r2.hoehe;
	}

}
