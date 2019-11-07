package arbeitsblaetter;

import java.util.Scanner;

class Foo {
	static {
		System.out.println(5/0); // ArithmetikException wird in ExceptionInInitializerError umgewandelt 
	}
}


public class B13_Exam_Fehlertypen {

	public static void main(String[] args) {
		
		/*
		 * Throwable - Kann geworfen/abgefangen/deklariert werden
		 */
		
		Throwable e1;
		
		/*
		 * Error (können nicht dynamisch korrigiert werden)
		 */
		try {
			testStackOverflowError();
			
		} catch (StackOverflowError e) {
			System.out.println("StackOverflowError abgefangen. Lässt sich nicht dynamisch korrigieren");
		}
			
		try {
			new Foo();
		} catch (ExceptionInInitializerError e) {
			System.out.println("ExceptionInInitializerError abgefangen");
		}
		
		//NoClassDefFoundError wäre denkbar, wenn eine Klasse gar nicht gefunden wird 
		NoClassDefFoundError e2;
		
//		try {
//			Class.forName("KlasseDieEsNichtGibt");
//			
//		} catch (ClassNotFoundException e) { 
//			System.out.println("ClassNotFoundException abgefangen");
//		}
		
		/*
		 * Exception
		 */

		
		Scanner sc = new Scanner("a b c");
		System.out.println(sc.next());
		sc.close();
		try {
			System.out.println(sc.next());
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException angefangen ");
		}

		
	}
	
	
	static void testStackOverflowError() {
		testStackOverflowError();
	}
	

}
