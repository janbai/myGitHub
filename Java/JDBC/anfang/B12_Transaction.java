package anfang;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 
 * Transaktion hier: Alter tauschen
 * 
 * 		Jerry bekommt das Alter vom Tom
 * 		Und Tom kriegt das Alter vom Jerry 
 * 
 */

public class B12_Transaction {

	public static void main(String[] args) throws SQLException {

		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
	
//	    |  1 |        Tom |     3 |
//    	|  2 |      Jerry |     5 |
//    	|  3 |     Lassie |     4 |
		
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement();) {
		
			int alterTom;
			try( ResultSet res = stm.executeQuery("select * from tiere where name='Tom'") ) {
				res.next();
				alterTom = res.getInt("alter");
			}
			
			int alterJerry;
			try( ResultSet res = stm.executeQuery("select * from tiere where name='Jerry'") ) {
				res.next();
				alterJerry = res.getInt("alter");
			}
			
			String sql = "update tiere set `alter` = " + alterTom +" where name='Jerry'" ;
			stm.executeUpdate(sql);		
			
			sql = "update tiere set `alter` = " + alterJerry +" where name='Tom'" ;
			stm.executeUpdate(sql);
			
		}
		
		MySqlUtils.printTableTiere();

	}

}
