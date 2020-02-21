package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B05_ResultSet {

	public static void main(String[] args) throws SQLException {
		
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		
		/*
 		 *  - ResultSet ist eine Ressource (AutoClosable). Bitte schliessen.
		 * 
		 */

		
		
		/*
		 * Achtung!
		 * 
		 *  - Wird Statement (oder Connection) geschlossen, wird dabei auch ResultSet geschlossen
		 */

		try {
			Connection c = MySqlUtils.getConnection();
			Statement stm = c.createStatement();
					
			ResultSet res = stm.executeQuery("select * from tiere");
			
			stm.close(); // Statement wurde geschlossen -> ResultSet auch geschlossen
			res.next(); // <- SQLException
		} catch (SQLException e) {
			System.out.println("Fehler 1: ResultSet ist geschlossen");
		}
		
		
		/*
		 * Achtung!
		 * 
		 * - Ein Statement kann nur ein ResultSet unterstützen. Altes ResultSet wird automatisch geschlossen,
		 *   wenn ein neues ResultSet erzeugt wird
		 * 
		 */
		
		try {
			Connection c = MySqlUtils.getConnection();
			Statement stm = c.createStatement();
					
			ResultSet res = stm.executeQuery("select * from tiere"); // ResultSet Nr. 1
			
			stm.executeQuery("select * from tiere"); // neues ResultSet (Nr. 2), dabei wird ResultSet Nr. 1 geschlossen
			
			res.next(); // SQLException
			
		} catch (SQLException e) {
			System.out.println("Fehler 2: ResultSet ist geschlossen");
		}		
		

	}

}
