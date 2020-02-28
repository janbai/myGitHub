package localDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class LocalDatesAndTimes {

	public static void main(String[] args) {
		
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
		System.out.println("It's currently " + nowDateTime + " where I am"); 
				//Java displays a "T" between the date and the time
		
		LocalDateTime nowLocal = LocalDateTime.now();
		ZoneId zoneId1 = ZoneId.of("Asia/Tokyo");
		LocalDateTime nowTokyo = LocalDateTime.now(zoneId1 );
		System.out.println(nowTokyo);
		
		
		LocalDate eclipseDate1 = LocalDate.of(2017, 8, 21); // ISO-8601  YYYY-MM-DD
		LocalDate eclipseDate2 = LocalDate.parse("2017-08-21");
		System.out.println("Eclipse date: " + eclipseDate1 + ", " +
		eclipseDate2);
		
		
		// Eclipse begins in Madras, OR
		LocalTime begins = LocalTime.of(9, 6, 43); // 9:06:43
		// Totality starts in Madras, OR
		LocalTime totality = LocalTime.parse("10:19:36"); // 10:19:36
		System.out.println("Eclipse begins at " + begins +
		" and totality is at " + totality);
		
		String eclipseDateTime = "2017-08-21 10:19";
		DateTimeFormatter formatter =
		DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime eclipseDay =
		LocalDateTime.parse(eclipseDateTime, formatter); // use formatter
		System.out.println("Eclipse day: " + eclipseDay);
		
		System.out.println("Eclipse day, formatted: " +
				eclipseDay.format(DateTimeFormatter.ofPattern("dd, mm, yy hh, mm")));
		
		System.out.println("Mom time: " + eclipseDay.plusHours(2));
		System.out.println("Going home: " + eclipseDay.plusDays(3));
		System.out.println("What day of the week is eclipse? " +
				eclipseDay.getDayOfWeek());
		
		
				
				
	}
}
