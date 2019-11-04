package aufgaben;

public class KleineAufgabeArrays {

	public static void main(String[] args) {

		a1();
		a2();
		
		
	}// End of main
	/*
	 * Erzeugen Sie bitte ein Array in dem die Konstanten Math.PI und Math.E gespeichert werden.
	 * Geben Sie dann das Array aus.
	 */
	
	static void a1() {
		double [] arr = { Math.PI, Math.E };
		for (double d : arr) {
			System.out.println(d);
		}
	}// End of a1	
		/*
	 	Gegeben sind folgende zwei Arrays:

		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };
		
		Und folgender Methodenaufruf:
		
		int[] a3 = add(a1, a2);
		
		Diefinieren Sie bitte die Methode add, dass sie die ensprechenden Elemente 
		beider übergebenen Arrays addiert und in einem neuen Array zurück liefert.
		
		In dem Bsp. wird a3 folgende Werte erhalten: 13, 15, 17 (Summen ensprechender Positionen)
	 */
		
		static void a2() {
			
			int[] arr1 = { 1, 2, 3, 4 };
			int[] arr2 = { 12, 13, 14, 15, 16, 17 };
			int[] arr3 = add1( arr1, arr2 );
			System.out.println("a1= ");
			for (int x : arr1) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println("a2= ");
			for (int x : arr2) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println("a3 = a1 + a2 ");
			for (int x : arr3) {
				System.out.print(x + " ");
			}	
		}// End of a2
		
		static int [] add( int[] array1, int[] array2) {
			int[] back = new int[array1.length + array2.length];
			for (int i = 0; i < array1.length; i++) {
				back[i] = array1[i];
			}
			
			for (int i = 0; i < array2.length; i++) {
				back[i+ array1.length] =array2[i];
			}
			return back;
			}//End of add
	
		
		static int [] add1( int[] array1, int[] array2) {
			int len = array1.length > array2.length ? array1.length : array2.length;
			int[] back = new int[len];
			for (int i = 0; i < back.length; i++) {
				int x = i >= array1.length ? 0 : array1[i];
				int y = i >= array2.length ? 0 : array2[i];
				
				back[i] = x + y;
			}		
			return back;
			}//End of add1
}
