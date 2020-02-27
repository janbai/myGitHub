package localization;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class B04_Formatieren_und_Locale {

	public static void main(String[] args) {

		String pattern = "EEEE, MMMM";
		LocalDate date = LocalDate.now();

		
		Locale loc1 = Locale.GERMANY;
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern(pattern, loc1);
		String text1 = date.format(fmt1);
		System.out.println("text1: " + text1);
		
		Locale loc2 = Locale.ITALY;
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern(pattern, loc2);
		String text2 = date.format(fmt2);
		System.out.println("text2: " + text2);
		
		
		System.out.println("*** Landesangaben berücksichtigen");
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		String betrag1 = nf1.format(12.4567);
		System.out.println("betrag1: " + betrag1); // 12,46 €
		
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String betrag2 = nf2.format(12.4567);
		System.out.println("betrag2: " + betrag2); // ￥12.46
		
		
		Locale.setDefault(Locale.CHINA); // !!!
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String betrag3 = nf3.format(12.4567);
		System.out.println("betrag3: " + betrag3);
		System.out.println("*** Datum");
		Locale.setDefault(Locale.GERMAN);
		DateTimeFormatter fmt3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		String dateAsText = fmt3.format(LocalDate.now());
		System.out.println("Heute für default local: " + dateAsText);
		
		DateTimeFormatter fmt4 = fmt3.withLocale(Locale.US);
		String dateAsText4 = fmt4.format(LocalDate.now());
		System.out.println("Heute mit US local: " + dateAsText4);
		
		
	}//end 

}
