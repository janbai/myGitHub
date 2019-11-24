package vererbung;


public class B05_instanceof {
	
	static class Auto {}
	static class PKW extends Auto {}
	static class Lastwagen extends Auto {}
	

	public static void main(String[] args) {

		Object var = new Auto(); 
		
		boolean erg = var instanceof Auto; // hat der Typ des Objektes hinter var IS-A-Beziehung zu der Klasse Auto?
		
		System.out.println("1. var instanceof Auto: " + erg); // true
		
		System.out.println("a. var instanceof PKW: " + (new PKW() instanceof PKW));
		System.out.println("b. PKW instanceof Auto: " + (new PKW() instanceof Auto));
		System.out.println("c. Lastwagen instanceof Auto: " + (new Lastwagen() instanceof Auto));
		System.out.println("d. PKW instanceof Lastwagen: " + (new Auto() instanceof PKW));
		
		var = "Bin kein Auto";
		
		erg = var instanceof Auto;
		System.out.println("2. var instanceof Auto: " + erg); // false
		
		var = null;
		
		erg = var instanceof Auto;
		System.out.println("3. var instanceof Auto: " + erg); // false
		
		
		var = new PKW();
		
		erg = var instanceof Auto;
		System.out.println("4. var instanceof Auto: " + erg); // true

		
		erg = var instanceof Object;
		System.out.println("5. var instanceof Object: " + erg); // true
		
		
		PKW pkw = new PKW();
		
		erg = pkw instanceof Auto;
		erg = pkw instanceof Object;
//		 erg = pkw instanceof Lastwagen; // Compilerfehler: PKW (Typ von pkw) und Lastwagen sind Geschwisterklassen
		
		
		
	} // end of main

}
