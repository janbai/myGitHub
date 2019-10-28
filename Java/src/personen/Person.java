package personen;



public class Person implements Comparable<Person> {

	private String vorname, nachname, postleitzahl;
	private int geburtsjahr;
// * Constructor -----------------------------------	
	public Person(String vorname, String nachname, String postleitzahl, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.postleitzahl = postleitzahl;
		this.geburtsjahr = geburtsjahr;
	}
// * String toString -------------------------------------------
	@Override
	public String toString() {
		return  vorname + " " + nachname + " " + postleitzahl + " " + geburtsjahr ;
	}
// Getters & Setters ------------------------------
			public String getVorname() {
				return vorname;
			}
		
			public void setVorname(String vorname) {
				this.vorname = vorname;
			}
		
			public String getNachname() {
				return nachname;
			}
		
			public void setNachname(String nachname) {
				this.nachname = nachname;
			}
		
			public String getPostleitzahl() {
				return postleitzahl;
			}
		
			public void setPostleitzahl(String postleitzahl) {
				this.postleitzahl = postleitzahl;
			}
		
			public int getGeburtsjahr() {
				return geburtsjahr;
			}
		
			public void setGeburtsjahr(int geburtsjahr) {
				this.geburtsjahr = geburtsjahr;
			}
// * Comparator -----------------------------
			public int compareTo(Person p2) {
				int result = nachname.compareTo(p2.nachname);
				
				if(result==0) {
					result = vorname.compareTo(p2.vorname);
				}
				
				if(result==0) {
					result = postleitzahl.compareTo(p2.postleitzahl);
				}
				
				if(result==0) {
					result = geburtsjahr - p2.geburtsjahr;
				}
				
				return result;
			}
	
// * Equal----------------------------------		
			public boolean equals(Object obj) {
				Person p2 = (Person)obj;
				
				return vorname.equals(p2.vorname)
						&& nachname.equals(p2.nachname)
						&& geburtsjahr == p2.geburtsjahr
						&& postleitzahl.equals(postleitzahl); // evtl. NullPointerException
//						&& Objects.equals(postleitzahl, p2.postleitzahl);
			}
	
			
// * Print Array
			public static void printPersonen(Person[] personen) {
				
				String fmt = "|%5s|%15s|%15s|%15s|%15s|%n";
				
				System.out.printf(fmt, "Nr.", "Vorname", "Nachname","Postleitzahl", "Geburtsjahr" );
				System.out.println("=======================================================================");
				for (int i = 0; i < personen.length; i++) {
					Person p = personen[i];
					System.out.format(fmt, i+1, p.getVorname(), p.getNachname(),p.getPostleitzahl(), p.getGeburtsjahr());
				}
				
			}
	
	
			
	

	
	
	
}
