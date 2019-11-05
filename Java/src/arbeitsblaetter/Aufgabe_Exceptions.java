package arbeitsblaetter;

public class Aufgabe_Exceptions {

	static void m1() {
		System.out.println("a");
		System.out.println(5/0);
		System.out.println("b");
		
	}
	

	static void m2() {
		System.out.println("c");
		m1();
		System.out.println("d");
		
	}
	
	
	public static void main(String[] args) {
		
		try {
		System.out.println("m1");
		m2();
		System.out.println("m2");
		} catch(Exception e) {
			System.out.println("Exception thrown: " + e);
			
	}
		System.out.println("m3");
		
	}

}
