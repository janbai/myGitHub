package anfang;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B09_insertRow {

	public static void main(String[] args) throws SQLException {
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
		
		int resultSetType = ResultSet.TYPE_SCROLL_SENSITIVE;
		int resultSetConcurrency = ResultSet.CONCUR_UPDATABLE; // <-  
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement(resultSetType, resultSetConcurrency); 
						ResultSet res = stm.executeQuery("select * from tiere")) {
			
			res.moveToInsertRow(); // Spezielle Zeile zum Vorbereiten eines neuen Datensatzes
			
			res.updateInt("id", 4);
			res.updateString("name", "Rex");
			res.updateInt("alter", 2);
			
			res.insertRow(); // neue zeile in der datenbank in der Tabelle 'tiere' übernehmen
		}
		
		MySqlUtils.printTableTiere();
		
	}

}
