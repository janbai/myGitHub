package arbeitsblaetter;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class KleineAufgabe_20191111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	//	LocalDate startDateInclusive = LocalDate.now();
		//LocalDate endDateExclusive = startDateInclusive.plusDays(2);
		//Period p = Period.between(startDateInclusive, endDateExclusive);
		
		//System.out.println("Period: " + p);
		//System.out.printf("days: %s, months %s, years: %s % n ",p.getDays(), p.getMonths(),p.getYears());
		

		LocalTime startTimeInclusive = LocalTime.now();
		LocalTime endTimeExclusive = startTimeInclusive.plusHours(2);
		Duration d = Duration.between(startTimeInclusive, endTimeExclusive);
		
		System.out.println(d);
		System.out.printf("Seconds: %s % n ", d.getSeconds());
		
		
	}// end of main

	
		
	
}
