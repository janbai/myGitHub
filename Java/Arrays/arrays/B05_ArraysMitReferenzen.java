package arrays;
class Dozent {
	String vorname;
	String nachname;
}

public class B05_ArraysMitReferenzen {

	public static void main(String[] args) {

	Dozent d1 = new Dozent();
	System.out.println(d1.vorname);// null
	String [] a1 = new String [2];
	System.out.println(a1[0]);
	d1.nachname = "Janbai";
	a1[1] = d1.nachname;
	System.out.println("1. Nachname: " + a1[1]);
	
	d1.nachname = "Mayer";
	System.out.println("2. Nachname:" + d1.nachname);
	System.out.println(a1[1]);
	
	
	}

}
