package examples;

import java.util.Optional;

public class OptionalClass {

	static String getDayName (int dayNumber) {
		switch(dayNumber) {
		case 1:return "mo";
		case 2:return "di";
			
		}
		return null;
	}
	
	static Optional<String> maybeGetDayName (int dayNumber) {
		switch(dayNumber) {
		case 1:return Optional.of("mo");
		case 2:return Optional.of("di");
		case 3:return Optional.of("mi");
		case 4:return Optional.of("do");
		case 5:return Optional.of("fr");
		}
		return Optional.empty();
	}
	
	
	public static void main(String[] args) {

Optional<String> maybeday2 = maybeGetDayName(1);
if(maybeday2.isPresent()) {
	String day2= maybeday2.get(); 
	System.out.println(day2.toUpperCase());
}

	}

}
