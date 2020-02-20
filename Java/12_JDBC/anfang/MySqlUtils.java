package anfang;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;

public class MySqlUtils {
	
	private static String loadScript(String scriptName) {
		try {
			return Files.lines( Paths.get("src/jdbc/").resolve(scriptName) ).map(String::trim).collect(Collectors.joining(" "));
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost/java_test_db?serverTimezone=UTC";
		return DriverManager.getConnection(url, "root", "Janbai5143118");
	}

	/**
	 * Erzeugt folgende Tabelle:  <br/> <br/>
	 * 
	 *  | id | name   | alter | <br/>
	 *  |  1 | Tom    |    3  | <br/>
	 *  |  2 | Jerry  |    5  | <br/>
	 *  |  3 | Lassie |    4  | <br/>
	 * 
	 */
	public static void buildTableTiere() throws SQLException {
		
		try(Connection c = getConnection()) {
			
			try(Statement stm = c.createStatement()) {
				String sql = loadScript("create_table_tiere.sql");
				stm.executeUpdate(sql);
			}

			// INSERT INTO `tiere` (`id`, `name`, `alter`)	VALUES (?, ?, ?)
			String sql = loadScript("insert_into_tiere.sql");
			try(PreparedStatement stm = c.prepareStatement(sql)) {
				addRowToTiere(stm, 1, "Tom", 3);
				addRowToTiere(stm, 2, "Jerry", 5);
				addRowToTiere(stm, 3, "Lassie", 4);
			}
			
			System.out.println("Tabelle 'tiere' wurde erzeugt");
		}
	}
	
	private static void addRowToTiere(PreparedStatement stm, int id, String name, int alter) throws SQLException {
		stm.setInt(1, id); // Platzhalter 1
		stm.setString(2, name);
		stm.setInt(3, alter); // Platzhalter 3
		
		stm.executeUpdate();
	}
}
