package functional;

import java.util.Random;

public class Lokale_Kalasse_und_Lokale_Variablen {
	
	interface Animal{}
		
	class Katze implements Animal {

		@Override
		public String toString() {
		
			return "Katze";
		}
		
	}
	
	static Animal getLieblingstier() {
		int alter = new Random().nextInt(5)+1;
		
			class Hund implements Animal {
				@Override
				public String toString() {
					return "Hund.Alter: " + alter;
				}
				return new Hund();
			}
			
			
		}
	
	public static void main(String[] args) {
		
		Animal tier1 = new getLieblingstier();
		Animal tier2 = new getLieblingstier();
		System.out.println(tier1);

		
		
		
		
	}

}
