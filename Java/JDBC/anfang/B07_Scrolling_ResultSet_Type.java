package anfang;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B07_Scrolling_ResultSet_Type {
	
	static String getDisplayType(int type) {
		switch (type) {
			case ResultSet.TYPE_FORWARD_ONLY:
				return "TYPE_FORWARD_ONLY";
			
			case ResultSet.TYPE_SCROLL_SENSITIVE:
				return "TYPE_SCROLL_SENSITIVE";

			case ResultSet.TYPE_SCROLL_INSENSITIVE:
				return "TYPE_SCROLL_INSENSITIVE";
		}
		
		throw new IllegalArgumentException("Bad type: " + type);
	}

	public static void main(String[] args) throws SQLException {
		
		
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
		
		System.out.println("*** default Statement");
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement();
						ResultSet res = stm.executeQuery("select * from tiere")) {

			int type = res.getType();
			System.out.println("*** default ResultSet-Typ: " + getDisplayType(type) ); // bei MySql: TYPE_FORWARD_ONLY, aber trotzdem scrollbar
		}

		
		System.out.println("*** geändertes Statement");
		
		
		int resultSetType = ResultSet.TYPE_SCROLL_SENSITIVE; // ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_SCROLL_INSENSITIVE
		int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement(resultSetType, resultSetConcurrency); // bei MySql: keine Wirkung
						ResultSet res = stm.executeQuery("select * from tiere")) {
			
			int type = res.getType();
			System.out.println("*** ResultSet-Typ: " + getDisplayType(type) ); // bei MySql: bleibt TYPE_FORWARD_ONLY (und immer noch trotzdem scrollbar)
			
			
			/*
				Zeiger vor der 1. Zeile:
				
			->	
				|  1 |        Tom |     3 |
				|  2 |      Jerry |     5 |
				|  3 |     Lassie |     4 |

			 */
			
			
			while( res.next() ) {;}
			
			/*
				Zeiger nach der letzten Zeile
				
				|  1 |        Tom |     3 |
				|  2 |      Jerry |     5 |
				|  3 |     Lassie |     4 |
			->	
	
			 */
			
			res.previous();
			System.out.println("Letzter Name: " + res.getString(2));
			
		}

	}

}
