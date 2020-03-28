package wrapper;

public class B02_API_Boolean {

	public static void main(String[] args) {

		
		// Integer.parseInt("hallo"); // NumberFormatException
		// Integer.valueOf("hallo"); // NumberFormatException
		
		/*
		 * Boolean kann ALLE Strings in Boolean verwandeln.
		 * 
		 *  Die Zeichen "true" (egal klein oder groß) ergeben true, alle anderen Strings ergeben false.
		 */
		
		Boolean v1 = Boolean.valueOf("true");
		System.out.println("1: " + v1);			// true
		
		Boolean v2 = Boolean.valueOf("tRuE");
		System.out.println("2: " + v2);			// true

		System.out.println( Boolean.valueOf("wahr") ); // false
		
		String s = null;
		System.out.println( Boolean.parseBoolean(s) ); // false
	}

}
