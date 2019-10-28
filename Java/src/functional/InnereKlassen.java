package functional;

class Buch{
	public static class Seite {
		public void print() {
		Buch buch = new Buch("Harry Potter");
		System.out.println( "Buch.Seite aus dem Buch " + buch.titel);
		
		}
	}//End of Seite
	
private String titel;
	public Buch(String titel) {
		this.titel = titel;
	}
}//End of Buch


class Heft {
	public class Seite {
		public void print () {
			System.out.println("Heft.Seite selbst: " + this);
			System.out.println("Heft.Seite kennt den Heft-Preis: " + prise);
			System.out.println("Heft.Seite kennt das Heft-Object: " + Heft.this);
			System.out.println("Heft.Seite kennt das Heft-Object: " + Heft.this.prise);
			
		}
	}//End of Seite
	private int prise;

	public Heft(int prise) {
	
		this.prise = prise;
	}
}


public class InnereKlassen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		functional.Buch.Seite s0;
		
		Buch buch = new Buch("Harry Potter");
//		System.out.println(buch.titel);
		
		Buch.Seite s1= new Buch.Seite();
		s1.print();
		
//		Heft.Seite heftSeite=new Heft.Seite();
//		Heft.Seite heftSeite = heft.new Seite();???
		heftSeite.print();

	
		
	}

}
