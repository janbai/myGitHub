package kontrollstrukturen;

public class IfElseVerzweigung {

	public static void main(String[] args) {
		
		int day = 777;
		
		/*
		 *  if
		 *  else 
		 */
		if( day==2 ) {
			System.out.println("1. Donnerstag");
		} else {
			System.out.println("2. Ein Tag, der nicht Donnerstag ist");
		}

		/*
		 * 	if
		 * 	else if
		 *  else if
		 *  
		 *  Nur der erste Zweig mit 'true' wird aktiviert (falls es überhaupt einen Zweig mit 'true' gibt).
		 */
		if( day < 6 ) {
			System.out.println("3. Arbeitstag");
		} else if( day==6 ) {
			System.out.println("4. Samstag");
		} else if( day==7 ) {
			System.out.println("5. Sonntag");
		}
		
		
		
		/*
		 * if
		 * else if
		 * ...
		 * else
		 */
		day = -1;
		
		if( day < 6 && day > 0 ) {
			System.out.println("6. Arbeitstag");
		} else if( day==6 || day==7 ) {
			System.out.println("7. Wochenende");
		} else {
			System.out.println("8. Ungültige Tag-Angaben: " + day);
		}
		
		
		/*
		 * Exam
		 */
		
		/*
		if(true) {
			
		} else if { // Compilerfehler if(----)
			
		}
		
		*/
		
//		if(true) {
//			
//		} else (day==1) { // Compilerfehler :if( ----)
//			
//		}
		
		System.out.println("end of main");
	}

}
