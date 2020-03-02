package lambdaExpressions;

import java.util.Comparator;
import java.util.function.Predicate;

@FunctionalInterface
interface I1{
	void m1();
	String toString();
}


public class B01_FunctionalInterface {

	public static void main(String[] args) {

		Comparable<String> cmp1 = new Comparable<String>() {
			
			public int compareTo(String o) {
				return 0;
			}
			
		};

			Comparator<String> cmp2 = new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					return 0;
				}
			};
		
			Predicate<String> p1 = new Predicate<String>() {
				@Override
				public boolean test(String s) {
					return false;
				}
				
			};
			
			

	}

}
