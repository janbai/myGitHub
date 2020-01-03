package LocalDate_3_115_125;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q003 {

	public static void main(String[] args) {
		
		String date = LocalDate.parse("2014-05-04")
					  	.format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
			
		String date1 = LocalDateTime.parse("2011-07-31T18:00:00")
						.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date1);
			
		LocalDateTime date2 = LocalDateTime.parse("2008-07-15T15:30:50");
		System.out.println(date2);
			
		LocalDate now =  LocalDate.now();
		System.out.println(now);
			 
		LocalDate dt = LocalDate.parse("2018-01-31"); 
        System.out.println(dt); 
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY"); 
        System.out.println(formatter.format(dt)); 
        
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println(date3);
        
	}
}
