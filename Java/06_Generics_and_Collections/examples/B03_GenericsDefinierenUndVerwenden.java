package examples;



import java.util.ArrayList;
import java.util.Map;

/*
 * Definieren (generischer Typ: MyValue <T>)
 * 
 * 		T - Typparameter
 * 
 * 		T extends Number - Type Bound (Typeinschränkung). 		extends steht hier für IS-A
 */

class MyValue <T extends Number> {
	T value;
	
	void set ( T value) {
		this.value= value;
	}
	T get(){
		return value;
	}
}


public class B03_GenericsDefinierenUndVerwenden {

	public static void main(String[] args) {
		
		/*
		 * Verwenden und dabei parametrisieren
		 */
		MyValue<Integer> v1; 
		
		class MyIntValue extends MyValue<Integer> {}
		
		Map<Integer,String> map;
		
		/*
		 * Achtung! Bitte IMMER parametrisieren. Bitte keine 'raw types' verwenden!
		 * 
		 * Obwohl es auch ohne Parametrisierung geht:
		 */
		
		MyValue v2; // MyValue ohne Parametrisierung: raw type

		ArrayList list; // ArrayList: raw type
		
		
	}

}
