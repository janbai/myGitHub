package anfang;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) {


		String url ="jdbc:mysql://localhost?serverTimezone*UTC"; //C:\\Users\\HJAN181\\Desktop\\java_test_db";
		String password = "Janbai5143118";
		String user = "Janbai";
		try(Connection connection = DriverManager.getConnection(url, user , password)){
			System.out.println("** Die Verbindung steht ");
		
			try(Statement stm = connection.createStatement()){
				String sql = "";
				try(ResultSet res = stm.executeQuery(sql)){
					while(res.next()) {
						int id = res.getInt(1);
						id = res.getInt("id");
						System.out.printf("id: %d, vorname:  %n", id);
					}
				}
			}
			//
			System.out.println("** Die Verbindung wird geschlossen.");
			
			// connection.close();
		}
		catch(SQLException e) {
			System.out.println("** fehler! Die Verbindung konnte nicht geöffnet werden!");
			e.printStackTrace();
		}
		
	}

}
