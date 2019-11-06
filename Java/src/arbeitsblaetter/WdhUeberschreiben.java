package arbeitsblaetter;

interface Fahrzeug{
	void fahren();
}



class Rennwagen implements Fahrzeug {
	private int fahren(int x) { return 3;}
	public  void fahren() {System.out.println("Rennwagen fahrt ....");}
}


public class WdhUeberschreiben {
	static void rennen(Fahrzeug f1, Fahrzeug f2) {
		f1.fahren();
		f2.fahren();
	}
	
	
	public static void main(String[] args) {
		Fahrzeug f1 = new Rennwagen();
		Fahrzeug f2 = new Rennwagen();
		rennen(f1, f2);
		
	}

	
}
