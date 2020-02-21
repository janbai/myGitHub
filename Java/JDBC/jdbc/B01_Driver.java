package jdbc;

public class B01_Driver {

	public static void main(String[] args) {
		
		/*
		 * Der Treiber muss im Classpath sein 
		 */
		
		
		/*
		 * 1. Automatisch kann der Driver geladen werden, der nach JDBC 4 gestaltet wurde:
		 * 
		 * 	driver.jar/
		 * 		|-META-INF/
		 * 		|	|-service/
		 * 		|		|-java.sql.Driver
		 * 		|
		 * 		|-package1
		 * 		|...
		 * 
		 */
		
		/*
		 * 2. Treiber manuell laden:
		 *
		 * 		Class.forName("com.mysql.jdbc.Driver");
		 */
		
		
		/*
		 * 3. Treiber finden lassen:
		 * 
		 * 	Beim System-Property 'jdbc.driver=com.mysql.jdbc.Driver' setzen
		 * 
		 */
		

	}

}
