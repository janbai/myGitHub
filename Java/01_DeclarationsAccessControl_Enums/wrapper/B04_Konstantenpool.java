package wrapper;

public class B04_Konstantenpool {

	public static void main(String[] args) {
		
		/*
		 * Für Byte, Short, Integer und Long: je einen Konstantenpool für Werte -128 bis 127 (inklusive)
		 */

		Integer i1 = 12;	// Integer.valueOf(12);		// aus dem Integer-Pool
		Integer i2 = Integer.valueOf(12);				// aus dem Integer-Pool
		Integer i3 = 12;								// aus dem Integer-Pool
		
		System.out.println(i1 == i2);  // true
		System.out.println(i1 == i3);  // true

		Integer i4 = new Integer(12);
		System.out.println(i1 == i4); // false

		Integer x1 = 128;
		Integer x2 = Integer.valueOf(128); // >127
		System.out.println(x1 == x2);
		
		
		
	}

}
