package examples;
 
interface Tontraeger {}

class Schallplatte implements Tontraeger {}
class Tonband implements Tontraeger {}
class CD implements Tontraeger {}

class Abspielgeraet <T extends Tontraeger> {
	private Tontraeger t; 
	void abspielen(T t) {
		this.t=t;
	}
}


public class AufgabeGenerics_Tonträger {

	public static void main(String[] args) {


		Schallplatte schallplatte= new Schallplatte();
		Tonband tonband = new Tonband();
		CD cd = new CD();
		
		Abspielgeraet<Schallplatte> spSpieler= new Abspielgeraet<>();
		Abspielgeraet<Tonband> tdSpieler= new Abspielgeraet<>();
		Abspielgeraet<CD> cdSpieler= new Abspielgeraet<>();
		
		spSpieler.abspielen(schallplatte);
		tdSpieler.abspielen(tonband);
		cdSpieler.abspielen(cd);
		
		
		
	}
	
	
}
