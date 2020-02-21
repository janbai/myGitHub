package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B10_updateRow {

	public static void main(String[] args) throws SQLException {
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
		
		int resultSetType = ResultSet.TYPE_SCROLL_SENSITIVE;
		int resultSetConcurrency = ResultSet.CONCUR_UPDATABLE; // <-  
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement(resultSetType, resultSetConcurrency); 
						ResultSet res = stm.executeQuery("select * from tiere")) {

			res.last(); // Zeile mit Lassie
			
			res.updateString("name", "Rex");
			
			res.updateRow(); // Änderung in der Datenbank übernehmen
		}
		
		MySqlUtils.printTableTiere();
		
	}
}
