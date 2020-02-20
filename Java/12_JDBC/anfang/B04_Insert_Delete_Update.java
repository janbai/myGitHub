package anfang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B04_Insert_Delete_Update {

	public static void main(String... args) {
		String url = "jdbc:mysql://localhost?serverTimezone=UTC";
		try( Connection connection = DriverManager.getConnection(url, "root", "Janbai5143118") ) {
			
			try( Statement stm = connection.createStatement() ) {

				/*
				 * INSERT
				 */
				String sql = "INSERT INTO `java_test_db`.`personen` (`vorname`, `nachname`, `geburtsjahr`) VALUES ('George', 'H.', '1958')";
				stm.executeUpdate(sql);
				System.out.println("George H. hinzugefügt");
				
				/*
				 * UPDATE
				 */
				sql = "update `java_test_db`.`personen` set geburtsjahr = 1955 where vorname='George'" ;
				stm.executeUpdate(sql);
				System.out.println("Geburtsjahr von allen mit dem Vornamen George auf 1955 geändert");
			
				/*
				 * DELETE
				 */
				sql = "delete from `java_test_db`.`personen` where vorname='George'";
				stm.executeUpdate(sql);
				System.out.println("Allen mit dem Vornamen George entfernt");
				
			} // <- stm.close()
			
			
		} // <- c.close() 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
