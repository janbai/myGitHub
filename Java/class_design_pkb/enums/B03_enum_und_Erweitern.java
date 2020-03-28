package enums;

public class B03_enum_und_Erweitern {
	

	/*
	 * - Jede enum-Klasse erweitert die Klasse Enum
	 * - Jede enum-Klasse darf mehrere Interfaces realisieren
	 * 
	 * - Von einer enum-Klasse darf nicht geerbt werden (Ausnahme: spezielle anonyme Klassen wie für die Konstante MEDIUM)
	 * 
	 */
	
	enum Size implements Runnable {
		SMALL, 
		MEDIUM {
			public void run() {
				System.out.println("run für MEDIUM überschrieben");
			}
		}, 
		LARGE;
		
		@Override
		public void run() {
			System.out.println(name() + " läuft :)");
		}
	}
	
	
	public static void main(String[] args) {

		Size.SMALL.run();
		Size.MEDIUM.run();
		

	}

}
