package localization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.Properties;

/*
 * Properties:
 * 
 * 	1. abstrakter Begriff: Schlüssel-Wert-Paare, die die (evtl. konfigurierbaren) Eigenschaften einer Anwendung (Bibliothek) beschreiben
 *  2. Java-Format zum speichern der Schlüssel-Wert-Paare (name=value)
 *  3. Properties ist eine Klasse, die Properties aus 1 und/oder 2 unterstützt.
 *  		java.util.Properties implements Map<Object, Object>
 * 
 */
public class B01_Properties {

	public static void main(String[] args) {

		Properties props = new Properties(); // im Arbeitsspeicher
		
		/*
		 * String getProperty(String)
		 */
		String propertyName = "app.version"; 
		String propertyValue = props.getProperty(propertyName);
		
		System.out.println(propertyName + " = " + propertyValue); // null

		
		/*
		 * String getProperty(String key, String defaultValue)
		 */
		propertyValue = props.getProperty(propertyName, "1.0.0");
		System.out.println(propertyName + " = " + propertyValue); // 1.0.0
		
		
		/*
		 * setProperty(String key, String value)
		 */
		String value = Paths.get(".").toAbsolutePath().normalize().toString();
		props.setProperty("app.dir", value);
		
		
		/*
		 * nicht in der Prüfung:
		 */
		
		String comments = "my comment";
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("myapp.properties"))) {
			props.store(writer, comments);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		testLoad();
		propertiesFile();
	}
	
	static void testLoad() {
		System.out.println("*** load");
		
		Properties props = new Properties();
		
		try(Reader reader = new BufferedReader(new FileReader("myapp.properties"))) {
			props.load(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		String appDir = props.getProperty("app.dir");
		System.out.println("app.dir: " + appDir);
	}

	static void propertiesFile() {
		System.out.println("*** inhalten testen***");
		Properties props = new Properties();
		try(Reader reader = new BufferedReader(new FileReader("myapp.properties"))) {
			props.load(reader);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String appDir = props.getProperty("app.dir");
		System.out.println("app.dir: " + appDir);
		System.out.println("name1 " + props.getProperty("name1"));
	}
	
	
	
}
