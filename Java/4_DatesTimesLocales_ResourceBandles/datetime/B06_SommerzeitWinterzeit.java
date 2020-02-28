package datetime;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class B06_SommerzeitWinterzeit {

	public static void main(String[] args) {

		
		/*
		 * Exam: Zeitpunkt der Zeitumstellung wird bekanntgegeben
		 * 
		 * 
		 * z.B.: im 2015 in New York gab es die Umstellung von Winter- auf Sommerzeit
		 * 		 am 8. März um 2:00 Uhr:
		 * 
		 * 
		 * ...
		 * 01:59:58
		 * 01:59:59
		 * 03:00:00
		 * 03:00:01
		 * ...
		 * 
		 */

		ZoneId zone = ZoneId.of("America/New_York");
		
		int year = 2015;
		int month = 3;
		int dayOfMonth = 8;
		
		int hour = 1;
		
		int minute = 0, second = 0, nanoOfSecond = 0;
		
		ZonedDateTime time1 = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone);
		
		hour = 4;
		ZonedDateTime time2 = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, nanoOfSecond, zone);
		
		/*
		 * Exam: Wie viele Stunden liegen zwischen zeit1 und zeit2
		 * 
		 */
		
		Duration zeitspanne = Duration.between(time1, time2);
		
		long zeitspanneInStunden = zeitspanne.toHours();
		
		System.out.println("Dazwischen liegen " + zeitspanneInStunden + " Stunden"); // 2 (Zeitumstellung berücksichtigt)
		
	}

}
