package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import aufgaben.Kreis;
import aufgaben.streams.warenkorb.Bestellung;
import aufgaben.streams.warenkorb.Preise;
import aufgaben.streams.warenkorb.Produkt;

public class Collectors_toxxx {
static class Wochentag{
	String name;
	int nummer;
	
	
	public Wochentag(String name) {
		super();
		this.name = name;
	}

	public Wochentag(String name, int nummer) {
		super();
		this.name = name;
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	@Override
	public String toString() {
		return name + " " + nummer;
	}
	
	
	
}
	public static void main(String[] args) {

		
		Integer[] zahlen = {1, 2, 3, 4, 5, 6, 7};
		String[] name = {"mo", "di", "mi", "do", "fr", "sa", "so"};
		
		
		
		LinkedList<Wochentag> result = Stream.iterate(0, i -> i+1)
				.limit(7)
				.map(i -> new Wochentag(name[i], zahlen[i]))
				.collect(Collectors.toCollection(LinkedList::new) );
		
		result.forEach(System.out::println);
		

		
		
	}

}
