package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class MySqlUtilsTest {

	public static void main(String[] args) throws SQLException {
		
		/*
		 * A1. 
		 * 
		 * MySqlUtils.getConnection() entwickeln, die die Verbindung 
		 * zu einer Standarddatenbank mit Standardzugangsdaten erstellt
		 *  
		 * 
		 */
		
		try( Connection c = MySqlUtils.getConnection() ) {
			System.out.println("Connection steht");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Keine Connection mehr");
		
		/*
		 * A2.
		 * 
		 * MySqlUtils.buildTableTiere() entwickeln, die die neue Tabelle 'tiere' in der
		 * Standarddatenbank erzeugt. Die Tabele hat folgende Inhalte:
		 * 
		 * (bitte kein Autogenerieren/Autoinkermentieren von id)
		 * 
		 *  | id | name   | alter |
		 *  |  1 | Tom    |    3  |
		 *  |  2 | Jerry  |    5  |
		 *  |  3 | Lassie |    4  |
		 *  
		 *  A3.
		 *   
		 *  MySqlUtils.removeTableTiere(), die die Tabele tiere entfernt
		 *  
		 *  
		 *  A4.
		 *   
		 *  MySqlUtils.printTableTiere(), die die Tabele tiere formatiert ausgibt
		 *  
		 *  | id | name   | alter |
		 *  |  1 | Tom    |    3  |
		 *  |  2 | Jerry  |    5  |
		 *  |  3 | Lassie |    4  |
		 *  
		 */
		
		MySqlUtils.removeTableTiere();
		
		MySqlUtils.buildTableTiere();
		
		MySqlUtils.printTableTiere();

	}

}
