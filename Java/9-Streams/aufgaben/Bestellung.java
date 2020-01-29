package aufgaben;

public class Bestellung {

	private String produktName;
	private int anzahl;
	
	public Bestellung(String produktName, int anzahl) {
		this.produktName = produktName;
		this.anzahl = anzahl;
	}

	public String getProduktName() {
		return produktName;
	}

	public void setProduktName(String produktName) {
		this.produktName = produktName;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	
	
}
