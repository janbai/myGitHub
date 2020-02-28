package exam;

import java.util.ResourceBundle;

public class B07_ResourceBundle_mit_JavaKlasse {

	public static void main(String[] args) {
		
		
		String baseName = "res.Wochentage";
		
		ResourceBundle bundle = ResourceBundle.getBundle(baseName);

		String montag = bundle.getString("mo");
		System.out.println("1: " + montag); // Montag
		System.out.println("2: " + bundle.getString("di")); // Dienstag
		// System.out.println("3: " + bundle.getString("mi")); // Exception  
		
		/*
		 * s. die Klasse 'res.Wochentage':
		 * 
		 * 		- erbt von ListResourceBundle
		 * 		- überschreibt die Methode 'Object[][] getContents()'
		 */
		
		
		
	}

}
