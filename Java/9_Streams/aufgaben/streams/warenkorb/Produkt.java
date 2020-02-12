package aufgaben.streams.warenkorb;

public class Produkt {
	
	private String name;
	private int preis;
	
	public Produkt(String name, int preis) {
		this.name = name;
		this.preis = preis;
	}
	
	public int getPreis() {
		return preis;
	}	
	
	@Override
	public String toString() {
		return name + " " + preis;
	}
}
