package anfang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class MySqlUtils{
	
	private static String url = "jdbc:mysql://localhost?serverTimezone=UTC";
	private static String username ="root";
	private static String password = "1234";
	Connection connection;
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password) ;
	}
	public static void buildTableTiere() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
public class MaSqlUtilsTest {

	public static void main(String[] args) {

		
		try(Connection c = MySqlUtils.getConnection()){
			System.out.println("Connection steht");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
MySqlUtils.buildTableTiere();

	}

}
