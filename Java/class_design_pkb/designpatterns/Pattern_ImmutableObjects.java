package designpatterns;

import java.util.ArrayList;
import java.util.List;

/*
 * MyIntValue nach 'Immutable Objects' etwickelt:
 *  (gut gekapselt + final)
 */
final class MyIntValue {
	private int value;

	public MyIntValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

//class X extends MyIntValue {
//	int i;
//	
//	X(int x) {
//		super(x);
//	}
//	
//	@Override
//	public int getValue() {
//		return super.getValue() + i++;
//	}
//}

/*
 * Immutable Objekts Pattern: Klasse so gestalten, dass Ihre Objekte nicht geändert werden können
 */
public class Pattern_ImmutableObjects {

	public static void main(String[] args) {
		
		/*
		 * Klassen aus der Standardbibliothek:
		 * 	String, LocalDate, alle Wrapper-Klassen...
		 * 
		 */
	
		MyIntValue v1 = new MyIntValue(3);
		System.out.println( v1.getValue() ); // 3
		System.out.println( v1.getValue() ); // 
		System.out.println( v1.getValue() ); // 
		System.out.println( v1.getValue() ); // 
		System.out.println( v1.getValue() ); // 
		System.out.println( v1.getValue() ); // 
		System.out.println( v1.getValue() ); // 
		
	} // 

	/*
	 * Frage 1: ist 'Laden' nach dem Muster 'Immutable Objects' realisiert?
	 * Antwort: Nein
	 * 
	 * Frage 2: Und wenn 'produkte' final ist?
	 * Antwort: Nein
	 *  
	 * Frage 3: Und wenn 'produkte' final und private ist?
	 * Antwort: Nein
	 * 
	 * Solange die ArrayList erreichbar bleibt, wird Immutable Objects nicht realisiert. 
	 */
	public class Laden {
		List<String> produkte = new ArrayList<>();
		
		public List<String> getProdukte() {
			return produkte;
		}
	}
	
	
}

