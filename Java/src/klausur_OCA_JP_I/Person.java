package klausur_OCA_JP_I;
public class Person {
	private String vorname;
	private String nachname;
	int alter;
	private String beruf;
	private boolean verheiratet;
		
	public Person(String vorname, String nachname, int alter)  {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.beruf = beruf;
		
	}



	
	
	@Override
	public String toString() {
		return "Person [vorname=" + vorname + ", nachname=" + nachname + ", alter=" + alter + ", beruf=" + beruf
				+ ", verheiratet=" + verheiratet + "]";
	}




	@Override
	public String toString(String beruf)  {
		return vorname + " " + nachname + " ist " + beruf;
	}
	
}
