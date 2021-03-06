package aufgaben;

import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Locale_Stream_count_min_max {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
	
		
	 //findMaxName(locales);
	//	getContries(locales);
	//	getLanguages(locales);
		getSpecialCountry(locales,"t");
	//	sortAsLangauges(locales);
	//	sortAsCountries(locales);
	//	displayCountries(locales);
	}
	private static void displayCountries(Locale[] locales) {
		
        
	
	Comparator<? super Locale> comp = Comparator.comparing(Locale::getDisplayCountry);
	
	Optional<Locale> s =	Arrays.stream(locales)
			.max(comp );
	
		//.sorted()
		
		
	
		
System.out.println(s.get().getDisplayCountry());
		
		
	}
	

	private static void sortAsCountries(Locale[] locales) {
		Comparator<Locale> cmp = (loc1, loc2) -> 
        loc1.getDisplayCountry().compareTo(loc2.getDisplayCountry());
       
		System.out.println("Sorted as Languages ---------------------------------------");
		
		Consumer<Locale> action =  x -> {
        	System.out.printf("%-40s %s%n", x.getDisplayCountry(), x.getDisplayLanguage());
        };
        
		Arrays.stream(locales)
		.distinct()
		.sorted(cmp)
		.filter(x -> x.getDisplayCountry() != ""   )
				.forEach(action );
		
	}

	static void sortAsLangauges(Locale[] locales) {
		Comparator<Locale> cmp = (loc1, loc2) -> 
        loc1.getDisplayLanguage().compareTo(loc2.getDisplayLanguage());
       
		System.out.println("Sorted as Languages ---------------------------------------");
		
		Consumer<Locale> action =  x -> {
        	System.out.printf("%-40s %s%n", x.getDisplayCountry(), x.getDisplayLanguage());
        };
		Arrays.stream(locales)
		.filter(s -> s.getDisplayCountry() != "")
		.sorted(cmp)
		.distinct()
		.filter(x -> x.getLanguage().equals("de"))
		.forEach(action );
		
		long count = Stream.of(locales)
				.filter(s -> s.getDisplayCountry() != "")
				.map(Locale::getLanguage) // Stream<String>
				.filter(s -> s.equals("de"))
				.count();
		System.out.println("Locales mit de: " + count);
	}

	static void getSpecialCountry(Locale[] locales, String s) {
		System.out.println("A3 ---------------------------------------");
		Arrays.stream(locales)
		.map(x -> x. getDisplayCountry())
		.distinct()
		.sorted()
		.filter(x -> x.contains(s))
		.forEach(System.out::println);
		
		long count =Arrays.stream(locales)
		.map(x -> x. getDisplayCountry())
		//.distinct()
		.sorted()
		.filter(x -> x.contains(s))
		.count();
		
		System.out.println("count = " + count);
	}
	
	static void getLanguages(Locale[] locales) {
		System.out.println("A2 ---------------------------------------");
		Arrays.stream(locales)
		.map(Locale::getLanguage)
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}
	
static void getContries(Locale[] locales) {
	System.out.println("All Countries ---------------------------------------");
	Arrays.stream(locales)
	.map(Locale::getDisplayCountry)
	.distinct()
	.sorted()
	.forEach(System.out::println);
	}
	
	
	
	
	static void findMaxName(Locale[] locales) {
		System.out.println("A1 ---------------------------------------");
		Optional<String> max = Arrays.stream(locales)
		//.map(x -> x. getDisplayCountry())
		.map(Locale::getDisplayCountry)
		.distinct()
		.max((String s1, String s2) -> s1.length()-s2.length());
		
		System.out.println(max);
	}
	static void fetDateAndFormat(){
		 Date today = new Date(0);
		    Locale[] locales = { Locale.US, Locale.UK, Locale.GERMANY, Locale.FRANCE };
		    
		    int[] styles = { DateFormat.FULL, DateFormat.LONG, DateFormat.MEDIUM,
		        DateFormat.SHORT };
		        
		    DateFormat fmt;
		    String[] styleText = { "FULL", "LONG", "MEDIUM", "SHORT" };

		    // Output the date for each local in four styles
		    for (int i = 0; i < locales.length; i++) {
		      System.out.println("\nThe Date for " + locales[i].getDisplayCountry()
		          + ":");
		     
		      for (int j = 0; j < styles.length; j++) {
		        fmt = DateFormat.getDateInstance(styles[j], locales[i]);
		        System.out.println("\tIn " + styleText[j] + " is " + fmt.format(today));
		      }
		    }
	}
}
