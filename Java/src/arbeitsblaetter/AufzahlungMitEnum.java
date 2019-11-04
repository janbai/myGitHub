package arbeitsblaetter;

import java.util.Random;

enum AmpelFarbe { ROT, GELB, GRUEN }

public class AufzahlungMitEnum {

	public static void main(String[] args) {
		
		AmpelFarbe farbe = getAmpelFarbe();
		

		System.out.println(farbe);	

switch (farbe) {
case ROT:
	System.out.println("Rot! Stehen bleiben");
	break;
case GELB:
	System.out.println("Gelb! Bereit halten");
	break;
case GRUEN:
	System.out.println("Grün! Los! ");
	break;
default:
	System.out.println("Fehler!" + farbe);
}


		
	}
static AmpelFarbe getAmpelFarbe() {
	AmpelFarbe[] alleFarbe = AmpelFarbe.values();
	int index = new Random().nextInt(alleFarbe.length);
	return alleFarbe[index];
}
}
