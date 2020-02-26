package localDateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeAdjustments {

	public static void main(String[] args) {


		String eclipseDateTime = "2017-08-21 10:19";
		DateTimeFormatter formatter =
		DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime eclipseDay =
		LocalDateTime.parse(eclipseDateTime, formatter); // use formatter
		
		ZonedDateTime zTotalityDateTime =
				ZonedDateTime.of(eclipseDay, ZoneId.of("US/Pacific"));
				System.out.println("Date and time totality begins with time zone: "
				+ zTotalityDateTime);
		
		ZonedDateTime followingThursdayDateTime =
				zTotalityDateTime.with(TemporalAdjusters.next( // adjust date time
				DayOfWeek.THURSDAY)); // to next Thursday
				System.out.println("Thursday following the totality: " +
				followingThursdayDateTime);
				
				OffsetDateTime offsetDateTime = OffsetDateTime.now();
				System.out.println(offsetDateTime);
				
				
				
	}

}
