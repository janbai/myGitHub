package wrapper;

public class B01_API {
	
	public static void main(String[] args) {
//		konstruktoren();
//		boxingMethods();
//		unboxingMethods();
		parsingMethods();
		
	} // end of main

	static void parsingMethods() {
		/*
		 * Byte ... Double
		 * 
		 * valueOf(String)
		 */
		Short v1 = Short.valueOf("12");
		System.out.println(v1); // 12

		try {
			Short.valueOf("(byte)12");
		} catch (NumberFormatException e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
		/*
		 * Character hat keine valueOf(String)
		 */
		// Character.valueOf("a"); // Compilerfehler 
		
		
		/*
		 * Boolean.valueOf(String)
		 */
		Boolean v2 = Boolean.valueOf("true");
		
		
		/*
		 * Byte .... Double
		 * 
		 * parseXXX(String)
		 */
		int x1 = Integer.parseInt("12");
		
		float x2 = Float.parseFloat("12");
		System.out.println(x2); // 12.0
		
		/*
		 * Character hat keine parseCharacter Methode
		 */
		// Character.parseCharacter("a"); // Compilerfehler
		
		/*
		 * Boolean.parseBoolean(String)
		 */
		boolean x3 = Boolean.parseBoolean("true");
		
	}
	
	static void unboxingMethods() {
		
		/*
		 * Die Klassen Byte, Short, Integer, Long, Float und Double erben von Number
		 * und bekommen dadurch nicht nur ihre entsprechenden 'unboxing' Methode, sondern 
		 * auch die anderen (byteValue, shortValue .... doubleValue) 
		 */
		Integer v1 = 12;
		int x1 = v1.intValue(); // unboxing Method
		

		Character v2 = 'a';
		char x2 = v2.charValue(); // unboxing Method
		
		
		Boolean v3 = true;
		boolean x3 = v3.booleanValue(); // unboxing Method
		
	}
	
	static void boxingMethods() {
		
		Byte v1 = Byte.valueOf((byte)12);
		//...
		Float v2 = Float.valueOf(12F);
		//...
		
		Character v3 = Character.valueOf('a');
		
		Boolean v4 = Boolean.valueOf(true);
	}
	
	public static void konstruktoren() {

		/*
		 * Konstruktoren (Java SE 8)
		 * 
		 * Alle Wrapper haben einen Konstruktor mit entsprechendem primitiven Wert
		 */
		
		new Byte((byte)12);
		// new Byte(12);		// Compilerfehler
		
		new Short((short)12);
		new Integer(12);
		
		new Long(12L); 

		new Float(12F); // float
		new Float(12D); // double (Ausnahme)
		
		new Double(12D);

		new Character('a');
		
		new Boolean(true);
		
		/*
		 * Konstruktoren
		 * 
		 * Alle (außer Character) haben einen Konstruktor mit String-Parameter
		 * 
		 */
		
//		new Character("a"); // Compilerfehler
		
		Integer i = new Integer("22");
		System.out.println(i);
		
		try {
			new Integer("hello");
		} catch (NumberFormatException e) {
			System.out.println("Fehler: " + e.getMessage());
		}
		
	} // 

}
