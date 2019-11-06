package arbeitsblaetter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Parse_Date {

	public static void main(String[] args) throws ParseException {


		testKlasseDate();
		testKlasseDateFormat();	
		
	}
		
	
	
	public static void testKlasseDateFormat() throws ParseException {
		System.out.println("*** Klasse DateFormat");
		DateFormat df = DateFormat.getInstance();
		
		Date date = new Date();
		String dateAlsText = df.format(date);
		System.out.println("date als String (formatieren): "+ dateAlsText);
		System.out.println("date mit toString: " + date);
		
		dateAlsText = "12.07.03, 07:15";
		Date d2 = df.parse(dateAlsText);
		System.out.println("d2:" + d2 );
	}
	
	
	public static void testKlasseDate() {
		Date date = new Date();
		
		long millis = date.getTime();
		System.out.println("Millis seit 1.1.1970 bis jetzt: " + millis); 
		System.out.println("date: " + date);
		
		Date damals = new Date(121314);
		System.out.println("damals: " + damals);
		
		}
}
