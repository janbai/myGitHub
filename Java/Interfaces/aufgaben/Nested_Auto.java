package aufgaben;

class Rennwagen{
	private static String name;
	
	
	public Rennwagen(String name) {
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Rennwagen: "  + name + ". " + Fahrer.getVorname() + Fahrer.getNachname() ;
	}
	
	public static class Fahrer {
		private static String vorname;	
		private static String nachname;
		
		public Fahrer(String vorname, String nachname) {
			super();
			this.vorname = vorname;
			this.nachname = nachname;
			
	}
		
		public static String getVorname() {
			return vorname;
		}
		
		public static String getNachname() {
			return nachname;
		}
	   
		@Override
		public String toString() {
			return "Fahrer " + vorname + " " + nachname ;
		}
	
	}//End of Fahrer
	
	void setFahrer(Fahrer f) {
		System.out.print("Zeile A: ");
	}
	
	public static class Motor{
		@Override
		public String toString() {
			return "Motor Type1 aus dem Rennwagen " + Rennwagen.name;
		}

		void getMotor() {
			System.out.print("Zeile B: ");
		}
	}
	
}//End of Rennwagen

public class Nested_Auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Rennwagen rw = new Rennwagen("Mercedes");
		 Rennwagen.Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
		 rw.setFahrer(f);				//  Zeile A:
		 System.out.println(rw);		//  Rennwagen: Mercedes. M.Schuhmacher
		  
		  Rennwagen.Motor m = new Rennwagen.Motor(); // 
		  m.getMotor();								//  Zeile B:
		  System.out.println(m);					//  Motor Type1 aus dem Rennwagen Mercedes	
		 
		 
	}

}
