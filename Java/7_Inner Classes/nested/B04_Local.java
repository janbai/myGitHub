package nested;

public class B04_Local {

	public static void main(String[] args) {
		
//		Fahrzeug f; // Compilerfehler
		
		class Fahrzeug {
			void fahren() {
				System.out.println("Fahrzeug fährt...");
			}
		} // Klasse Fahrzeug gültig ab hier bis zum Ende der main-Methode

		
		new Fahrzeug().fahren();
		
	} // end of main

	
	static void tesd() {
//		Fahrzeug f; // Compilerfehler
		
	}
	
}
