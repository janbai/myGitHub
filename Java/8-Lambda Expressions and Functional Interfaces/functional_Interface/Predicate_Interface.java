package functional_Interface;

import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {

		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
			
				if (t == null || t.isEmpty()) 
				{
					return false;
				}
				else 
					return true;
				}
		};
		
		System.out.printf("%s %s %s%n",p1.test(""), p1.test(null), p1.test("Hallo"));
		
		
	}

}