package anfang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B03_Select {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost?serverTimezone=UTC";
		try( Connection connection = DriverManager.getConnection(url, "root", "Janbai5143118") ) {
			
			try( Statement stm = connection.createStatement() ) {
			
				String sql = "SELECT * FROM java_test_db.personen";
				
				try( ResultSet res = stm.executeQuery(sql) ) {
					
					while( res.next() ) {
						
						int id = res.getInt(1); // mit dem Spalten-Index
						id = res.getInt("id"); // mit dem Spalten-Namen
						
						System.out.printf("id: %2d, vorname: %7s, nachname: %12s, geb.: %d %n", 
								id,
								res.getString("vorname"),
								res.getString("nachname"),
								res.getInt("geburtsjahr") );
						
					}
					
					
				} // <- res.close()
				
				
			} // <- stm.close()
			
			
			
		} // <- c.close() 
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
