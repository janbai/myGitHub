package arbeitsblaetter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AufgabeExceptionsPaseDate {

	public static void main(String[] args)  {
	
		String dateAsString = getUserInput();
		System.out.println("Eingegeben:" + dateAsString);
		
		DateFormat df = DateFormat.getDateInstance();
		try {
							
			Date date = df.parse(dateAsString);
			System.out.println("Date: " + date);
			System.out.println("Millis seit dem 1.1.1970: " + date.getTime());
			
		} catch (ParseException e) {
			System.out.println("Fehler Ungültig Eingabe: " + dateAsString);
		}
		
		
		

	}
private static String getUserInput() {
	System.out.println("Bitte das Datum eingeben (TT.MM.YYYY):");
	return new Scanner(System.in).nextLine();
}
}
