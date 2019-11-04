package arbeitsblaetter;

abstract class AmpelFarbeKlasse {
	//AmplelFarbeKlasse[] farbe = { ROT, GELB, GRUEN };
	 public static final AmpelFarbeKlasse ROT= new AmpelFarbeKlasse() {};
	 public static final AmpelFarbeKlasse GELB= new AmpelFarbeKlasse() {};
	 public static final AmpelFarbeKlasse GRUEN= new AmpelFarbeKlasse() {};
	
	 
	  private AmpelFarbeKlasse () {}
	
}





public class EigenerTypMitClass {

	
	
	public static void main(String[] args) {
		

System.out.println("*** vor einer Ampel: ");
		

		//AmpelFarbeKlasse  farbe = new AmpelFarbeKlasse();
		
		AmpelFarbeKlasse farbe =getAmpelFarbe();
		
		if (farbe == AmpelFarbeKlasse.ROT) {
			System.out.println("Rot! ");
		} else if(farbe == AmpelFarbeKlasse.GELB) {
			System.out.println("Gelb!");
		}else if (farbe == AmpelFarbeKlasse.GRUEN) {
			System.out.println("Grün! ");
		}else {
			System.out.println("Fehler!" + farbe);
		}
			
		
	}// end of main

	
	static AmpelFarbeKlasse getAmpelFarbe(){
		 AmpelFarbeKlasse[] farbe = { ROT, GELB, GRUEN };
		return farbe;
	 }
	

	
	
}
