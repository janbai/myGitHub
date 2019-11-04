package arbeitsblaetter;

import java.util.Random;

public class DasLebenOhneEnums {
public static final byte ROT=0;
public static final byte GELB=1;
public static final byte GRUEN=2;

	
	public static void main(String[] args) {
		
		System.out.println("*** vor einer Ampel: ");
		
		String strVar = "";
		
		byte farbe = getAmpelFarbe();
		switch (farbe) {
		case ROT:
			System.out.println("Rot! ");
			break;
		case GELB:
			System.out.println("Gelb!");
			break;
		case GRUEN:
			System.out.println("Grün! ");
			break;
		default:
			System.out.println("Fehler!" + farbe);
		}
		
		
		
	}//end of main
	
	static byte getAmpelFarbe() {
		return (byte) new Random().nextInt(4);
	}

}
