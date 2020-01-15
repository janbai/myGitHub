package examples;


public class WDH03 {
	
	class TV {}
	class TVDE extends TV {}
	class TVUK extends TV {}
	
	static class Steckdose<T extends TV> {
		T tv;
		void anschliessen(T tv) {
			this.tv = tv;
		}
	}

	public static void main(String[] args) {

		Steckdose<TV> sdTV = null;
		Steckdose<TVDE> sdDE = new Steckdose<TVDE>();
		Steckdose<TVUK> sdUK = null;

		/*
		 * 1. Kontrolle: Steckdose <= IS-A <= Steckdose				: OK
		 * 2. Kontrolle: <TVUK> ist nicht gleich <TVDE> 			: Compilerfehler
		 */
		//sdUK = sdDE;
		sdUK=new Steckdose<TVUK>();
		sdUK.anschliessen(new TVUK());
		
		
		/*
		 * 1. Kontrolle: Steckdose <= IS-A <= Steckdose				: OK
		 * 2. Kontrolle: <TV> ist nicht gleich <TVDE> 				: Compilerfehler
		 */
	//	sdTV = sdDE;
		sdTV = new Steckdose<TV>();
		sdTV.anschliessen(new TVDE());
		sdTV.anschliessen(new TVUK());
		
	Steckdose <? extends TV> sd3;
	sd3 = sdTV;
	sd3 = sdDE;
	
	sd3 = sdUK;
	//sd3.anschliessen(new TVDE());
	//sd3.anschliessen(new TVUK());
	sd3.anschliessen(null);
	
	Steckdose<? super TVDE> sd4;
	sd4= sdTV;
	//sd4 = sdUK;
	sd4 = sdDE;
	sd4.anschliessen(new TVDE());
	//sd4.anschliessen(new TVUK());
	//sd4.anschliessen(new TV());
	
	
	}

}
