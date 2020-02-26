package wrapper;

public class B03_Autoboxing_Autounboxing {

	public static void main(String[] args) {

		Byte var1 = 12; // implizites Casting vor dem Autoboxing:		Byte var1 = Byte.valueOf((byte)12);
		Short var2 = 12; // implizites Casting vor dem Autoboxing
//		Long var3 = 12;		// Compilerfehler	
//		Float var4 = 12; 	// Compilerfehler
//		Double var5 = 11;	// Compilerfehler
		
		
		Integer v1 = 12; // Autoboxing: 		Integer v1 = Integer.valueOf(12); 

		int x1 = v1; // Autounboxing:			int x1 = v1.intValue();

		/*
		 * Falls sowohl Autoboxing als Autounboxing
		 * helfen können wird das Autounboxing eingesetzt
		 */
		System.out.println( x1 == v1 ); // Autounboxing: 		x1 == v1.intValue()
	
		
		double d1 = 11;
		
		System.out.println( d1 < v1 ); // Autounboxing:			d1 < v1.intValue()
		
		
		System.out.println( d1 == v1 );// Autounboxing:			d1 == v1.intValue()
		
		
		Double d2 = d1;	// Autoboxing:			Double d2 = Double.valueOf(d1);	 
		
		/*
		 * Achtung 	bei != und ==
		 * 
		 *  Beim Ist-Gleich oder Ist-Ungleich-Vergleich zwei Referenzen gibt es kein Autounboxing!!! 
		 */
		
		// System.out.println( d2 == v1 ); // Compilerfehler: Referenzen von Geschwisterklassen
		
		Integer v2 = 133;
		System.out.println(v1 == v2); // Referenzenvergleich!
	}

}
