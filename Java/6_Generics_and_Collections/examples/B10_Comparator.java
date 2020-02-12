package examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;


final class OS implements Comparable<OS> {
	public static final OS LAST_WINDOWS = new OS("Windows", 2010, 12);
	public static final OS LAST_LINUX = new OS("Linux", 3, 9);
	
	private String name;
	private int major, minor;
	
	public OS(String name, int major, int minor) {
		this.name = name;
		this.major = major;
		this.minor = minor;
	}
	
	public OS(String name, int major) {
		this(name, major, 0);
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + major + "." + minor;
	}
	
	@Override
	public int compareTo(OS os2) {
		int res = name.compareTo(os2.name);
		
		if(res==0) {
			res = major - os2.major;
		}
		
		if(res==0) {
			res = minor - os2.minor;
		}
		
		return res;
	}
}

public class B10_Comparator {

	public static void main(String[] args) {

		/*
		 * int compare(T e1, T e2)
		 */
		Comparator<Integer> c1 = new Comparator<Integer> () {
			public int compare(Integer i1, Integer i2) { 
				return i1-i2; 
			}
		};
		
		// aus der Klasse Collections:
		Comparator<Integer> c2 = Collections.reverseOrder();
		Comparator<Integer> c3 = Collections.reverseOrder(c1);

		System.out.println( "test c3: " + c3.compare(5, 7) ); // 2
		
		/*
		 * 
		 * statische Methoden
		 *  
		 */
		
		/*
		 * <T extends Comparable<? super T>> Comparator<T> naturalOrder()
		 */
		Comparator<OS> c4 = Comparator.naturalOrder();
		System.out.println("test c4: " + c4.compare(OS.LAST_LINUX, OS.LAST_WINDOWS));
		
		
		/*
		 * Comparator reverseOrder
		 */
		Comparator<Integer> c5 = Comparator.reverseOrder();
		
		
		/*
		 *  <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor)
		 */
		Function<OS, String> keyExtractor = os -> os.getName();
		Comparator<OS> c6 = Comparator.comparing(keyExtractor);
		
		OS tmp = new OS("Linux", 2);
		System.out.println("Linux vs. Windows: " + c6.compare(tmp, OS.LAST_WINDOWS)); // negativ (erste OS ist kleiner)
		System.out.println("Linux vs. Linux: " + c6.compare(tmp, OS.LAST_LINUX));  // 0 (die OS sind gleich)
		System.out.println("------------------------------");
		Comparator<String> keyComparator = Comparator.reverseOrder();
		Comparator<OS> c7 = Comparator.comparing(keyExtractor, keyComparator);
		System.out.println(c7.compare(tmp, OS.LAST_WINDOWS));
		System.out.println(c7.compare(tmp, OS.LAST_LINUX));
		
		ToDoubleFunction<String> toDoubleFunction = s -> Double.parseDouble(s);
		Comparator<String> c8 = Comparator.comparingDouble(toDoubleFunction);
		System.out.println("22.3".compareTo("5.7"));
		
		System.out.println(c8.compare("22.3", "5.7"));
		
	}

}
