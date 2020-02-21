package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class B11_Methadata {

	public static void main(String[] args) throws SQLException {

		
		
		
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement();
					ResultSet res = stm.executeQuery("select * from tiere")) {
			
			// DatabaseMetaData databaseMetaData = c.getMetaData();
			
			ResultSetMetaData resultSetMetaData = res.getMetaData();
			
			int columns = resultSetMetaData.getColumnCount();
			System.out.println("Spalten: " + columns);
			
			for (int col = 1; col <= columns; col++) {
				String colName = resultSetMetaData.getColumnLabel(col);
				System.out.print(colName);
				
				String colTypeName = resultSetMetaData.getColumnTypeName(col);
				System.out.println(" - " + colTypeName);
			}
			
		}

	}

}
