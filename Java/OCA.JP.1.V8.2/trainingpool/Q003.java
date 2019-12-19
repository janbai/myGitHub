package trainingpool;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Q003 {

	public static void main(String[] args) {


		LocalDate currrentDate = LocalDate.now();
		System.out.println(currrentDate);
		//String date2 = date1.format(DateTimeFormatter.ISO_DATE_TIME); // Exp
		
	LocalDate date2 = LocalDate.of(1972, 9, 3);
	System.out.println(date2);
		String date3 = LocalDate.parse("1972-09-03").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.from(date2);
		System.out.println(date4);
		Period date5 = date2.until(currrentDate);
		System.out.println(date5);
		LocalDate arrivedDate = LocalDate.of(2015, 11, 19);
		Period date6 = Period.between(arrivedDate, currrentDate);
		System.out.println(date6);
		Calendar currentDate1 = Calendar.getInstance();
		
		System.out.println(currentDate1);
		LocalDateTime date10 = LocalDateTime.now();
		String date11 = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
		
		
	}

}
