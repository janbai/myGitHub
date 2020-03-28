package designpatterns;


/*
 * Pattern Singleton: Klasse so gestalten, dass davon nur ein einziges Objekt geben kann 
 * 
 */

/*
 * Version 0
 */
class MySingletonV0 {
	public final static MySingletonV0 INSTANCE = new MySingletonV0();
	
	
	private MySingletonV0() {}
}


/*
 * Version 1
 */
class MySingletonV1 {
	private final static MySingletonV1 instance = new MySingletonV1();
	
	public static MySingletonV1 getInstance() {
		return instance;
	}
	
	private MySingletonV1() {}
}


/*
 * Version 2
 */
enum MySingletonV2 {
	INSTANCE
}


/*
 * Version 3 (lasy, nicht threadsicher)
 */
class MySingletonV3 {
	public static final int IRGENDEINE_KONSTANTE = 3; // auch beim Zugriff auf die Konstante wird die Klasse geladen
	
	private static MySingletonV3 instance;
	
	public static MySingletonV3 getInstance() {
		if(instance==null) {
			instance = new MySingletonV3();
		}
		
		return instance;
	}
	
	private MySingletonV3() {}
}


/*
 * weitere threadsichere lasy Lösung kommt evtl. beim Thema 'Threads'
 */



/*
 * Falsche Realisierung. (Nur dann als richtige Antwort nehmen, wenn die Anderen Antworten noch schlimmer sind)
 */
class MySingletonFalsch {
	private static final MySingletonFalsch INSTANCE = new MySingletonFalsch();
	
	public static MySingletonFalsch getInstance() {
		return INSTANCE;
	}
	
	MySingletonFalsch() {} // nicht privat! 
}


public class Pattern_Singleton {

	public static void main(String[] args) {

		// new MySingletonV1();
		
		MySingletonV1 s1 = MySingletonV1.getInstance();

		MySingletonV2 s2 = MySingletonV2.INSTANCE;

		MySingletonV3 s3 = MySingletonV3.getInstance();
	}

}














