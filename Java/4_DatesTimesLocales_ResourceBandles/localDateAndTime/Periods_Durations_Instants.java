package localDateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Periods_Durations_Instants {

	public static void main(String[] args) {


		// Totality begins in Austin, TX in 2024 at 1:35pm and 56 seconds;
		// Specify year, month, dayOfMonth, hour, minute, second, nano, zone
		ZonedDateTime totalityAustin =
		ZonedDateTime.of(2024, 4, 8, 13, 35, 56, 0, ZoneId.of("US/Central"));
		System.out.println("Next total eclipse in the US, date/time in Austin, TX: " +
		totalityAustin);

		// Reminder for a month before
		Period period = Period.ofMonths(1);
		System.out.println("Period is " + period);
		ZonedDateTime reminder = totalityAustin.minus(period);// P1M : "P" meaning period and "1M" meaning month.
		System.out.println("DateTime of 1 month reminder: " + reminder);
		// for people who are in Austin:
		System.out.println("Local DateTime (Austin, TX) of reminder: " +
				reminder.toLocalDateTime());
		
		System.out.println("Zoned DateTime (Madras, OR) of reminder: " +
				reminder.withZoneSameInstant(ZoneId.of("US/Pacific")));
		
		// Eclipse begins in Austin, TX
		LocalTime begins = LocalTime.of(12, 17, 32); // 12:17:32
		// Totality in Austin, TX
		LocalTime totality = LocalTime.of(13, 35, 56); // 13:35:56
		System.out.println("Eclipse begins at " +begins +
				" and totality is at " + totality);
		
		// How many minutes between when the eclipse begins and totality?
		long betweenMins = ChronoUnit.MINUTES.between(begins, totality);
		System.out.println("Minutes between begin and totality: " + betweenMins);
		
		Duration betweenDuration = Duration.ofMinutes(betweenMins);
		System.out.println("Duration: " + betweenDuration); //PT means "period of time"
		
		
		
		
	}

}
