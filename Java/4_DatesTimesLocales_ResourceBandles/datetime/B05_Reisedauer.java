package datetime;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class B05_Reisedauer {

	public static void main(String[] args) {
		
		ZoneId berlinID = ZoneId.of("UTC+1");
		
		int year = 2018;
		int month = 3;
		int dayOfMonth = 2;
		int hour = 0, minute = 0, second = 0, nanoOfSecond = 0;
		
		ZonedDateTime abflug = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, berlinID);
		
		
		ZoneId dallasID = ZoneId.of("UTC-6");
		
		hour = 7;
		ZonedDateTime ankunft = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, dallasID);
		
		/*
		 * Exam: Wie lange hat die Reise gedauert?
		 * 
		 * 
		 * 
		 * 
		 * Auf englische Zeit umgerechnet:
		 * 
		 * 		beim Abflug aus Berlin was es in England: 1. März, 23:00 Uhr ( lokale Zeit - 1 Stunde ) 
		 * 	
		 * 		bei der Ankunft in Dallas war es in England: 2. März, 13:00 Uhr ( lokale Zeit + 6 Stunden )
		 * 
		 * 
		 */

		Duration dauer = Duration.between(abflug, ankunft);
		
		System.out.println( dauer ); // PT14H

		long dauerInStunden = dauer.toHours();
		System.out.println("dauer: " + dauerInStunden + " Stunden");
		
	}

}
