package trainingpool;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

interface Transportation{
	
}

interface Vehicle  {
	

}
class Motorcycle  implements Vehicle {
	
}
public class Sample {
	   public static void main(String[] args){
		    
		   String date = LocalDate.parse("2014-05-04").format
				   (DateTimeFormatter.ISO_DATE);
				   System.out.println(date);
		    
		   
		}
		 
		}