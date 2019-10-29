package functional;

public class Rennwagen {

		

	private  String hesrstelle;
	private Fahrer f;
	private Motor m;

	
	
	public Rennwagen(String hesrstelle) {
		this.hesrstelle = hesrstelle;
		this.f = f;
		this.m = m;
	}

	public static class Fahrer {
		private String vorname,nachname;

		public Fahrer(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}

		@Override
		public String toString() {
			return vorname + " " + nachname;
		}
		
		
	}//end of Fahrer

	public void setFahrer(Fahrer f) {
		this.f=f;
	}
	
	
	@Override
	public String toString() {
		return "Rennwagen =" + hesrstelle + ". " + f ;
	}

	public static class Motor{
private String typ;

		public Motor(String typ) {
		this.typ = typ;
}

		@Override
		public String toString() {
			return "Motor " + typ + " aus dem Rennwagen " + hesrstelle;
		}
		
	}

	public Motor getMotor() {
		return m;
	}
	
	
}
