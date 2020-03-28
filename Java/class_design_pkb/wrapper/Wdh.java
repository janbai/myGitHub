package wrapper;

class Ozean {
	Long tiefe = 12L;  // aus dem Long-Pool
}



class Berg {
	Long hoehe = 1200L; // neues Long-Objekt auf dem Heap
}





public class Wdh {
	
	public static void main(String[] args) {
//		frage1();
		frage2();
	}

	
	public static void frage2() {
		
		Berg b1 = new Berg();
		Berg b2 = new Berg();
		
		b1 = null;
		b2 = null;
		
		// Zeile B. 		4 Objekte stehen dem GC zur Verfügung ( 2 Berg-Objekte und 2 Long-Objekte ) 
	}
	
	public static void frage1() {

		Ozean o1 = new Ozean();
		Ozean o2 = new Ozean();

		o1 = null;
		o2 = null;
		
		// Zeile A. 		2 Objekte stehen dem GC zur Verfügung ( 2 Ozean-Objekte )
		
	}

}
