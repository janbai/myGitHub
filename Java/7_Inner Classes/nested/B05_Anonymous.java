package nested;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyStringCmp implements Comparator<String> {
//	MyStringCmp() {
//		super();
//	}
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class B05_Anonymous {

	public static void main(String[] args) {

		List<String> list = Arrays.asList( "bb", "aaa", "c" );

		/*
		 * Mit einer Toplevel-Klasse
		 */
		Comparator<String> c1 = new MyStringCmp();
		
		list.sort(c1);
		
		/*
		 * Mit einer anonymen Klasse
		 */
		Comparator<String> c2 = new Comparator<String> () {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		list.sort(c2);
		
		
		/*
		 * Mit einer anonymen Klasse ohne Zwischenvariable
		 */
		list.sort(new Comparator<String> () {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		System.out.println( list );
		
		/*
		 * Noch kompakter als mit einer anonymen Klasse: Lambdas
		 */
		list.sort( (s1, s2) -> s1.length()-s2.length() );
		
	}

}
