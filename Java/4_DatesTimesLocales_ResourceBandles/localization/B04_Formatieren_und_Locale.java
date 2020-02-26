package localization;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class B04_Formatieren_und_Locale {

	public static void main(String[] args) {
		
		
		String pattern = "EEEE, MMMM";
		Locale locale = Locale.GERMANY;
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern, locale );
		LocalDate date = LocalDate.now();
		
		
		System.out.println("Date: " + date.format(formatter1));
		
		Locale loc2 = Locale.ITALY;
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern, loc2);
		System.out.println("Date: " + date.format(formatter2));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		String betrag = nf1.format(12.4567);
		System.out.println(betrag);
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
		String betrag2 = nf2.format(12.4567);
		System.out.println(betrag2);
		
		Locale defaultLocale = Locale.getDefault();
		System.out.println(defaultLocale);
		System.out.println(Locale.getAvailableLocales().length);
		
		
		
	}

}
