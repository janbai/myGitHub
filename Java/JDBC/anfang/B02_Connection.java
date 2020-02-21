package anfang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B02_Connection {

	public static void main(String[] args) {

		// url ohne eine Datenbank auswählen:
		String url = "jdbc:mysql://localhost?serverTimezone=UTC";
		String user = "root";
		String password = "1234";
		
		try( Connection connection = DriverManager.getConnection(url, user, password) ) {
			System.out.println("** Die Verbindung steht ");
			
			// mit der Verbindung arbeiten...
			
			System.out.println("** Die Verbindung wird geschlossen");
		// <- connection.close() mit AutoCloseable
		} catch (SQLException e) {
			System.out.println("** Fehler! Die Verbindung konnte nicht geöffnet werden!");
			
			e.printStackTrace();
		} 

		
		
	}


}
