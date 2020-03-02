package nested;

import java.util.Comparator;
import java.util.Map;

/*
 * Innere-Klassen können den Design verbessern 
 * 
 * - Logische Verbindung zum äußeren Typ
 * - Verstecken der Klassen, die nur in der äußeren Klasse verwendet werden 
 * - keine Sichtbarkeitseinschränkungen in dem äußeren Typ für alle Inhalte (also auch für innere Typen) 
 * - impliziter Zufriff auf ein Objekt vom äußeren Typ in der nichtstatischen inneren Klasse 
 * ...
 */


class Buch {
	private String titel;
	
	class Seite {
		@Override
		public String toString() {
			return "Eine Seite aus dem Buch " + titel;
		}
	}
}


public class B01_Warum {
	
	private static class MyComparator implements Comparator<String> {
		public int compare(String o1, String o2) {
			return 0;
		};
	}

	public static void main(String[] args) {

		Buch.Seite s1;
		Map.Entry e1;
		
		new MyComparator();
	}

}
