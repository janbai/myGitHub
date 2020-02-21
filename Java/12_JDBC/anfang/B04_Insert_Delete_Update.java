package anfang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class B04_Insert_Delete_Update {

	public static void main(String... args) {
		String url = "jdbc:mysql://localhost?serverTimezone=UTC";
		try( Connection connection = DriverManager.getConnection(url, "root", "1234") ) {
			
			try( Statement stm = connection.createStatement() ) {

				/*
				 * INSERT
				 */
				String sql = "INSERT INTO java_test_db.personen VALUES (10,'Hanan', 'Janbai', '1982')";
				stm.executeUpdate(sql);
				System.out.println("George H. hinzugefügt");
				
			} // <- stm.close()
			
			
		} // <- c.close() 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
