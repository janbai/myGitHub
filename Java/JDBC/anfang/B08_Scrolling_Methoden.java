package anfang;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B08_Scrolling_Methoden {

	public static void main(String[] args) throws SQLException {
		
		MySqlUtils.removeTableTiere();
		MySqlUtils.buildTableTiere();
		MySqlUtils.printTableTiere();
		
		int resultSetType = ResultSet.TYPE_SCROLL_SENSITIVE; // ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_SCROLL_INSENSITIVE
		int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
		
		try(Connection c = MySqlUtils.getConnection();
				Statement stm = c.createStatement(resultSetType, resultSetConcurrency); // bei MySql: keine Wirkung
						ResultSet res = stm.executeQuery("select * from tiere")) {
			
			
//			->  
//	 	    	|  1 |        Tom |     3 |
//		    	|  2 |      Jerry |     5 |
//		    	|  3 |     Lassie |     4 |
//		    				    

			// res.getInt(1); // java.sql.SQLException: Before start of result set
			
			
			/*
			 * boolean next()
			 */
			res.next();
//		  
//	 	    ->	|  1 |        Tom |     3 |
//		    	|  2 |      Jerry |     5 |
//		    	|  3 |     Lassie |     4 |
//		    				    
			System.out.println("1. " + res.getString(2)); // Tom
			
			
			/*
			 * boolean first()
			 * boolean last()
			 */
			
			res.last();
//			  
//	 	    	|  1 |        Tom |     3 |
//		    	|  2 |      Jerry |     5 |
//		    ->	|  3 |     Lassie |     4 |
//		    				    
			System.out.println("2. " + res.getString(2)); // Lassie
			
			res.first();
//			  
//	 	    ->	|  1 |        Tom |     3 |
//		    	|  2 |      Jerry |     5 |
//		    	|  3 |     Lassie |     4 |
//		    				    
			System.out.println("3. " + res.getString(2)); // Tom
			
			/*
			 * 
			 */
			res.beforeFirst();
//			->  
// 	    		|  1 |        Tom |     3 |
//	    		|  2 |      Jerry |     5 |
//	    		|  3 |     Lassie |     4 |
//	    				    

			res.afterLast();
//			  
// 	    		|  1 |        Tom |     3 |
//	    		|  2 |      Jerry |     5 |
//	    		|  3 |     Lassie |     4 |
//			->

			System.out.println("** alle Zeilen rückwärts: ");
			while(res.previous()) {
				System.out.println(res.getString(2));
			}
			
//			->  
//	    		|  1 |        Tom |     3 |
//    			|  2 |      Jerry |     5 |
//    			|  3 |     Lassie |     4 |
//    				    

			/*
			 * boolean absolute(int)
			 */
			res.absolute(3);
//			
//    			|  1 |        Tom |     3 |			1 (absolut)
//				|  2 |      Jerry |     5 |			2
//			->  |  3 |     Lassie |     4 |			3
//				    
			System.out.println("4. " + res.getString(2)); // Lassie
			
			res.absolute(-3);
//    		->  |  1 |        Tom |     3 |			-3 (absolut)
//				|  2 |      Jerry |     5 |			-2
//				|  3 |     Lassie |     4 |         -1 

			System.out.println("5. " + res.getString(2)); // Tom
			
			
			/*
			 * boolean relative(int)
			 */
			res.relative(1);
//    		    |  1 |        Tom |     3 |
//			->  |  2 |      Jerry |     5 |
//				|  3 |     Lassie |     4 | 
			System.out.println("6. " + res.getString(2)); // Jerry 
			

			
			
			res.afterLast();
//			  
//	    		|  1 |        Tom |     3 |
//    			|  2 |      Jerry |     5 |
//    			|  3 |     Lassie |     4 |
//			->
			res.relative(-2);
//			  
//    			|  1 |        Tom |     3 |
//			->  |  2 |      Jerry |     5 |
//				|  3 |     Lassie |     4 |

			System.out.println("7. " + res.getString(2)); // Jerry 
			
			
		}
	}

}
