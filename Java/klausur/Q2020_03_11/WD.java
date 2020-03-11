package Q2020_03_11;

import java.util.Comparator;


import java.util.Locale;
import java.util.function.Function;



public class WD {
static class MyComp{

	public static <T,R> Comparator<T> comparing(Function<T,R> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
	public static void main(String[] args) {
		Comparator<Locale> cmp1 = MyComp.comparing(Locale::getDisplayLanguage);

		
		Locale locA = new Locale("de", "DE");
		Locale locB = new Locale("at", "AT");
		Comparator<Locale> c1 = Comparator.comparing(Locale::getLanguage);
		System.out.println(c1.compare(locA, locB));
	}

}
