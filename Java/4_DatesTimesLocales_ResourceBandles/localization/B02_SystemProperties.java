package localization;

import java.util.Properties;
import java.util.Set;

public class B02_SystemProperties {

	public static void main(String[] args) {

		/*
		 * Properties getProperties()
		 */
		Properties props = System.getProperties();
		
		Set<Object> allKeys = props.keySet();
		
		for(Object key : allKeys) {
			Object value = props.get(key);
			System.out.printf("%-30s = %s %n", key, value);
		}
		
		
		System.out.println("*** getProperty: ");
		
		/*
		 * String getProperty(String)
		 */
		String userHome = System.getProperty("user.home");
		System.out.println("user.home: " + userHome);
		
		System.out.println("user.home: " + props.getProperty("user.home"));
		
		/*
		 * String getProperty(String key, String defaultValue)
		 */
		String valueForBadKey = System.getProperty("badkey", "Kein Wert für badkey");
		System.out.println("value for bad key: " + valueForBadKey);
		
		
		
		System.out.println("*** setProperty ");
		
		System.out.println( System.getProperty("mykey") ); // null

		/*
		 * String setProperty(String key, String value)
		 */
		System.setProperty("mykey", "myvalue");
		
		System.out.println( System.getProperty("mykey") ); // myvalue

		
		/*
		 * Eigene Property mit Option -D für die VM:
		 * 
		 * 		java -Dbenutzer="Max Müller" exam.B02_SystemProperties
		 * 
		 */
		System.out.println("*** test mit key = benutzer");
		
		System.out.println("benutzer: " + System.getProperty("benutzer"));
		
		
	} // eind of main

}
