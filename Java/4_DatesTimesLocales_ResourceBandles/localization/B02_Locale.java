package localization;

import java.util.Locale;

public class B02_Locale {

	public static void main(String[] args) {


		Locale loc1 = new Locale("de");
		Locale loc2 = new Locale("de","DE");
		Locale loc3 = new Locale.Builder()
								.setLanguage("de")
								.setRegion("DE")
								.build();
		Locale loc4 = Locale.GERMANY;
		printLocale(loc4);
		
	}

	private static void printLocale(Locale locale) {
		System.out.println("Locale: " + locale);
		System.out.println("getLanguage: " + locale.getDisplayLanguage());
		System.out.println("getDisplayCountry: " + locale.getDisplayCountry());
		System.out.println("getCountry: " + locale.getDisplayCountry());
		
		
		
		
	}

}
