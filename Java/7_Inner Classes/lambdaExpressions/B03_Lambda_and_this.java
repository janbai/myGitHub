package lambdaExpressions;

import java.util.function.Predicate;

public class B03_Lambda_and_this {

	public static void main(String[] args) {

		Predicate<String> p1 = new Predicate<String>(){
			public boolean test(String s) {
				System.out.println("test von: " + this);
				return s != null;
				
			}
		};

		p1.test("Tom");
		System.out.println("Anonymous class: " + p1.getClass().getName());
		
		/*
		 * Achtung! Lambdas haben keine this-Referenz!
		 */
		
		Predicate<String> p2 = (String s)-> {
		//	System.out.println("test von: " + this);// Compilerfehler
			return s!=null;
		};
		
		System.out.println("Lambda Klasse: " + p2.getClass()); 
		
	}// end of main
	
	
}
