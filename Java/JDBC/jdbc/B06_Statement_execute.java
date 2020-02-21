package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B06_Statement_execute {

	public static void main(String[] args) throws SQLException {
		
	//	MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		
		
		try( Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement() ) {
			
			/*
			 * 		int executeUpdate(String) 
			 */
			int result = stm.executeUpdate("INSERT INTO `tiere` (`id`, `name`, `alter`)	VALUES (4, 'Rex', 2)");
			
			
			/*
			 * 		ResultSet executeQuery(String)
			 */
			ResultSet res = stm.executeQuery("select * from tiere");
			res.close();

			/*
			 * 		boolean execute()  
			 */
			
			// Ändern mit execute:
			boolean ergebnis = stm.execute("INSERT INTO `tiere` (`id`, `name`, `alter`) VALUES (5, 'Flipper', 7)");
			
			MySqlUtils.printTableTiere();
			
			// Select mit execute:
			stm.execute("select * from tiere");
			
			ResultSet res2 = stm.getResultSet(); // nach select mit execute ist ResultSet im Statement zu finden
			
			System.out.println("Datensatz: " + res2.next());
			System.out.println("Name: " + res2.getString("name"));
			
		}

	}

}
