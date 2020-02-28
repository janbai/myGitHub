package exam;

import java.util.Locale;
import java.util.ResourceBundle;

public class B06_ResourceBundle {

	public static void main(String[] args) {
		
		Locale defaultLocale = Locale.getDefault();
		System.out.println("default Locale: " + defaultLocale); // de_DE
		
		
		/*
		 * baseName kann sowohl eine .properties Datei als auch eine .class Datei beschreiben,
		 * daher beinhaltet baseName keinen Pfad: die Angaben sind 'symbolisch' und beschreiben eine Resource im Classpath.
		 * 
		 *  Suffixe wie '_de' oder 'en_GB' gehören nicht zum baseName.
		 */
		String baseName = "res.Strings"; // wie ein Klassenname
		
		/*
		 * Ressourcen für default-Locale
		 */
		ResourceBundle bundle = ResourceBundle.getBundle(baseName); 
		
		/*
		 * String getString(String key)
		 */
		String greeting = bundle.getString("text.greeting");
		System.out.println(greeting); // Guten Tag!

		/*
		 * ResourceBundle kann auch für ein extra-Locale erstellt werden		
		 */
		bundle = ResourceBundle.getBundle(baseName, Locale.CHINA);
		
		greeting = bundle.getString("text.greeting"); // da es keine Lokalisierung für 'chinesisch, China' gibt, wird die Lokalisierung für default-Locale eingesetzt  
		System.out.println(greeting); // Guten Tag!
	
		
		/*
		 * Object getObject(String key) gibt es auch
		 */
		Object result = bundle.getObject("text.greeting");
		System.out.println(result); // Guten Tag!
	}

}
