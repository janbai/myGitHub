package arbeitsblaetter;

import java.util.Arrays;

enum Size{
	BIG, SMALL
}

class Groesse {
	
	 static final Groesse GROSS = new Groesse("GROSS");
	 static final Groesse KLEIN = new Groesse("KLEIN");
	static Groesse[] values () {
		return new Groesse[] { GROSS, KLEIN};
	}
	 private String name;
	
	 private Groesse (String name) {
		 this.name = name;
	 }
	 
	 
	@Override
	public String toString() {
	
		return name;
	}

	private Groesse() {}
}

public class WasEineEnumKlasseImmerHat {

	public static void main(String[] args) {
		
			Size s1 = null;
			Groesse g1 = null;
			
			s1 = Size.BIG;
			g1= Groesse.GROSS;
			System.out.println(s1);
			System.out.println(g1);
			System.out.println( Groesse.KLEIN);
			
		Size[] allSize = Size.values();
		System.out.println(Arrays.toString(allSize));
		
		Groesse[] alleGroessen = Groesse.values();
		System.out.println(Arrays.toString(alleGroessen));
		
		
	}

}
