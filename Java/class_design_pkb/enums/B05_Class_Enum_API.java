package enums;

import java.util.Arrays;




enum Color { 
		RED, GREEN, BLUE;
	}

public class B05_Class_Enum_API {

	public static void main(String[] args) {

		System.out.println("*** Jede enum-Klasse erbt von der Klasse java.lang.Enum: ");
		System.out.println(Color.RED instanceof Enum); // true

		System.out.println("*** Jede enum-Klasse implementiert Comparable");
		System.out.println(Color.RED instanceof Comparable); // true
		System.out.println( Color.RED.compareTo(Color.GREEN) < 0 ); // true
		
		System.out.println("*** Alle Konstruktoren einer enum-Klasse sind private");
		// new Color();
		
		System.out.println("*** statische methode values() liefert das Array mit allen Konstanten");
		System.out.println( Color.values() instanceof Color[] ); 
		System.out.println("values(): " + Arrays.toString(Color.values())); // [RED, GREEN, BLUE]
		
		System.out.println("*** statische Methode valueOf(String)");
		Color c = Color.valueOf("BLUE");
		System.out.println("Color.valueOf(\"BLUE\"): " + c);
		
		System.out.println("*** Die enum-Konstanten sind statisch");
		System.out.println("Color.RED: " + Color.RED);
		
		System.out.println("*** Die enum-Klasse überschreibt die toString");
		System.out.println("Color.RED: " + Color.RED);
		
		System.out.println("*** Jede enum-Klasse hat die final-Methode name()");
		System.out.println("Color.RED.name(): " + Color.RED.name()); // RED

		System.out.println("*** Jede enum-Klasse hat die final-Methode ordinal()");
		System.out.println("Color.RED.ordinal(): " + Color.RED.ordinal()); // 0 
		System.out.println("Color.GREEN.ordinal(): " + Color.GREEN.ordinal()); // 1
		System.out.println("Color.BLUE.ordinal(): " + Color.BLUE.ordinal()); // 2

		System.out.println(Color.BLUE.getDeclaringClass());
	}

}
