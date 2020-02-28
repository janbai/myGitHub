package localization;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;


public class Test {

	public static void main(String[] args) {
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate,nowTime);
		System.out.println(nowDateTime);//Java displays a "T" between the date and the time
		
		LocalDateTime nowLocal = LocalDateTime.now();
		ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
		LocalDateTime nowTokyo = LocalDateTime.now(zoneTokyo );
		System.out.println(nowTokyo);
		System.out.println(nowTokyo.compareTo(nowLocal));
		LocalDate myBirthday = LocalDate.of(1972,9,3);
		LocalDate myWifeBirthday = null;
		try {
			myWifeBirthday = LocalDate.parse("1972-08-16");
		} catch (DateTimeParseException e) {
			System.err.println(e.toString());// "1972-08-16"
		}
		
		System.out.println(myBirthday + " : " + myWifeBirthday);
		 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime eclipseDateTime = LocalDateTime.parse("2008-07-15 18:30", formatter );
		System.out.println(eclipseDateTime);
		System.out.println(eclipseDateTime.plusDays(2));	
		System.out.println(eclipseDateTime.plusHours(3));	
		System.out.println(eclipseDateTime.getDayOfWeek() + " " +eclipseDateTime.getDayOfYear());	
		
		ZonedDateTime zDateTime = ZonedDateTime.of(nowDateTime,zoneTokyo );
		System.out.println(nowDateTime);
		System.out.println(zDateTime);
		
		ZoneId pacific = ZoneId.of("US/Pacific");
		System.out.println(pacific.getRules().isDaylightSavings(zDateTime.toInstant()));
		
		ZonedDateTime nextThersdayInTokyo = zDateTime.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(nextThersdayInTokyo);
		ZonedDateTime firstDayOf_2021 = zDateTime.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println(firstDayOf_2021.getDayOfWeek());
		
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime.getOffset());
		
		Period period = Period.ofMonths(2);
		Period period2 = Period.ofDays(30);
		ZonedDateTime reminder = zDateTime.plus(period2);
		System.out.println(reminder);
		
		
		
		
	}

}
