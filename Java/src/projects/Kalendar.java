package projects;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int year = 2019;
		int month = 11;
		int dayOfMonth = 10	;
		
		//LocalDate date = LocalDate.of(year, month, dayOfMonth);
		
		//printCalendar(year, month,dayOfMonth);
		//dayOfWeek();
		dayOfWeek(2019, 11, 8);
		

	
	}
	
	static void dayOfWeek(int year,int month,int dayOfMonth) {
		Calendar calendar = GregorianCalendar.getInstance(Locale.GERMANY);
		
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.set(year, month, dayOfMonth);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}
	static void printCalendar(int year,int month,int dayOfMonth){
		System.out.println(getMonthFromInt(month) + " " + year);
	      System.out.println("--------------");
	      printWeekDays();
	      System.out.println(); 
	      getFirstWeekDay(year, month,dayOfMonth);
	}
	
	static void getFirstWeekDay(int year,int month,int dayOfMonth) {
		Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth);
        System.out.println(calendar.getTime().toString());
	}
	
	static void printWeekDays() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("u");
		String[] weekdays = new DateFormatSymbols().getWeekdays();
	    for (int i = 2; i < (weekdays.length); i++) {
	       String weekday = weekdays[i];
	       
	       System.out.print(weekday.substring(0,2) + " ");
	    }
	    String weekday = weekdays[1];
	    System.out.print(weekday.substring(0,2) + " ");
	}
	
	static String getMonthFromInt(int month) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
	    return dateFormat.format(month);
	}
}
