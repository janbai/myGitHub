package aufgaben.hafen;

import java.util.Arrays;

public class Hafen {

	private Schiff [] schiffe = new Schiff [5];
	
	private boolean status (Schiff s) {
		
		for (int i = 0; i < schiffe.length; i++) {
			if(schiffe[i] == null) {
				schiffe[i] = s;
				return true;
			}
		}
	return false;	
	}//end of einlaufen
	
	public void einlaufen (Schiff s) {
		
		if( status(s) ) {
			System.out.println("Klasse, " + s + " eingelaufen!");
		} else {
			System.out.println("Kein Platz für " + s);
		}
	}

	@Override
	public String toString() {
		int anzahlSchiffe = getCountSchiffe();
		
		return "Hafen. (Schiffe: " + anzahlSchiffe + ". Freie Plätze: " + (schiffe.length - anzahlSchiffe) + ")";	
	}
	
	
	private int getCountSchiffe() {
		int count = 0;
		for (int i = 0; i < schiffe.length; i++) {
			if ( schiffe[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
