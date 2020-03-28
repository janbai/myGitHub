package designpatterns;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * Pattern Factory Method: das Bilden eines Objektes verstecken und so vom Code der Anwendung trennen.
 * 
 */

abstract class Fahrbar {
	
	public static Fahrbar createInstance() {
		return new VW();
	}
}

class VW extends Fahrbar {}
class Mercedes extends Fahrbar {}



public class Pattern_FactoryMethod {

	public static void main(String[] args) {
		
		//statt überall im Projekt mit dem Konstruktor einer konkrenten Klasse...
		Fahrbar f1 = new Mercedes();
		
		// ...überall im Projekt die 'Fabrikmethode' verwenden um Objekte vom 'Standard-Typ' zu bilden:
		Fahrbar f2 = Fahrbar.createInstance();

		
		/*
		 * Bsp. aus der Standardbibliothek
		 * 
		 * DateFormat ist eine abstrakte Klasse, getInstance ist die Fabrikmethode 
		 * in der die Details zum Bilden des konkreten Objektes von der Anwendung versteckt sind.
		 */
		DateFormat df = DateFormat.getInstance();
		String s1 = df.format(new Date());
		
		/*
		 * weitere Beispiele
		 */
		NumberFormat nf = NumberFormat.getInstance();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		
		
		
	}

}
