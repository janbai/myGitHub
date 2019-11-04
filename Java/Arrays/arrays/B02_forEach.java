package arrays;

public class B02_forEach {

	public static void main(String[] args) {
		
		float [] a1 = new float [3];
		a1[2] = 1.3F;
		System.out.println("A0- print the address of array:");
		System.out.println(a1);
		
		
		System.out.println("A1- mit dem for-Schleife: "); //mit der erweiterten for-Schleife
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("A2- mit dem forEach: ");
		for (float f : a1) {
			System.out.println(f);
		}
		
		System.out.println("A3- ohne weiteres: Kein Schreibzugriff auf das Array in der foreach:");
		for (float f : a1) {
			a1[0]=2.0F;
			System.out.println(f);
		}
		
		System.out.println("A4- mit dem for-Schleife: "); //mit der erweiterten for-Schleife
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("A5- Blockvariable überschreiben: keine Auswirkung auf das Array:");
		for (float f : a1) {
			f = 17.23F; 
			System.out.println(f);
		}
		
		System.out.println("a1[0] = " + a1[0]); // 2.0
		
		System.out.println("*** Mit etwas Aufwand geht es: ");
		int index = 0;
		
		for (float f : a1) {
			System.out.println("f = " + f);
			System.out.println("index_" + index + "= " + a1[index]);
			
			a1[index] = -5; // Schreiben in Array. Übersichtlicher wäre die normale for-Schleife
			index++;
			
			
			
			
		}
		
		kleineAufgabe1();
		kleineAufgabe2();
		
		
		
		
		
	}// end of main
	/*
	 * kleine Aufgabe:
	 * 
	 * - Bitte ein boolean-Array der Länge 200 anlegen.
	 * - Array ausgeben
	 * - Jede gerade Position mit dem Wert true belegen
	 * - Array ausgeben
	 * 
	 */
	
	
	static void kleineAufgabe1() {
		System.out.println("*** Aufgabe 1:");
		
		boolean [] array = new boolean [200];
		for (boolean b : array) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				array[i]=true;
				System.out.print(array[i] + "  ");
			}else {
				array[i] = false; 
				System.out.print(array[i] + " ");
			}
			
		}
		 
		
	}// end of kleineAufgabe1
	static void kleineAufgabe2() {
		 System.out.println("*** Aufgabe 2:" );
			int[] arr = { 1, 2, 3 };
		 for(int i : arr) {
				System.out.print(arr[i] + " "); // ArrayIndexOutOfBoundsException
			}
			
		 
	 }// End of kleineAufgabe2
}
