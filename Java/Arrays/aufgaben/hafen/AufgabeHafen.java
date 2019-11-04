package aufgaben.hafen;

public class AufgabeHafen {

	public static void main(String[] args) {
		
		Schiff s1 = new Schiff("Titanic_1");
		Schiff s2 = new Schiff("Titanic_2");
		Schiff s3 = new Schiff("Titanic_3");
		Schiff s4 = new Schiff("Titanic_4");
		Schiff s5 = new Schiff("Titanic_5");
		Schiff s6 = new Schiff("Titanic_6");
		
		System.out.println("s1: " + s1);
		
		Hafen h = new Hafen();
		h.einlaufen(s1);		
		System.out.println(h);
		
		h.einlaufen(s2);		
		System.out.println(h);
		
		
		h.einlaufen(s3);
		System.out.println(h);
		h.einlaufen(s4);
		h.einlaufen(s5);
		h.einlaufen(s6);
		
	}//end of main

}
