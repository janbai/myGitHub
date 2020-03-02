package nested;

public class B07_Contextaccess {
	
	static int nummer = 1;

	public static void main(String[] args) {

		b1();
		b2();
		b3();
		
	} // end of main

	static void b3() {
		int nummer = 3;
	
		System.out.println( new Object() {
			@Override
			public String toString() {
				// nummer = 5; // Compilerfehler
				
				return "Object " + nummer; // 3 (Geht nur wenn die lokale Variable nummer 'effectively final' ist)
			}
		} );
		
	//	nummer = 4; // CompilerFailer lokale Variable ändern
	}
	
	
	static void b2() {
		
		class Tier {
			int nummer = 2;
		}
		
		class Hund extends Tier {
			@Override
			public String toString() {
				return "Hund " + nummer; // 2
			}
		}
		
		System.out.println(new Hund()); 
	}
	
		
	static void b1() {
		
		class Katze {
			@Override
			public String toString() {
				return "Katze " + nummer; // 1
			}
		}
		
		System.out.println(new Katze());
		
		nummer = 100; // statische Variable ändern
	}
	
}
