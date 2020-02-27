package localDateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ZonedDatesAndTimes {

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
		
			//How did you know the name of the ZoneId?	US, GB,
				Set<String> zoneIds = ZoneId.getAvailableZoneIds();
				List<String> zoneList = new ArrayList<String>(zoneIds);
				Collections.sort(zoneList);
				/*
				 * Africa, America, Antarctica, Asia, Atlantic, Australia, 
				 *  Brazil, CET, CST6CDT, Canada, Chile, Cuba, EET
				 *  US, Europe, 	
				 
				for (String zoneId : zoneList) {
					if (zoneId.contains("Europe")) { 
					System.out.println(zoneId);
					}
					}
				*/	
				
				zoneIds.stream()
							.filter(x -> x.contains("Europe"))
							.forEach(System.out::println);
				
				ZoneId pacific = ZoneId.of("US/Pacific");
				// pacific.getRules() returns a ZoneRules object that has all the rules
				// about time zones, including daylight savings and standard time.
				System.out.println("Is Daylight Savings in effect at time of totality: " +
				pacific.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));//true (summer time)
				

	}

}
