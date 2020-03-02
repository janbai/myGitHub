package serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class B03_manuell_serialisieren_unbequem {
	
	/*
	 * Angenommen, man darf nicht (kann nicht) die Klasse Motor ändern
	 */
	static class Motor {
		String typ;

		public Motor(String typ) {
			this.typ = typ;
		}

		@Override
		public String toString() {
			return "Motor [typ=" + typ + "]";
		}
	}
	
	/*
	 * Angenommen, man darf nicht (kann nicht) die Klasse Auto ändern
	 */
	static class Auto {
		int baujahr;

		public Auto() { // <- ohne diesen Konstruktor kann PKW nicht deserialisiert werden
			System.out.println("Auto()");
		}
		
		public Auto(int baujahr) {
			this.baujahr = baujahr;
			System.out.println("Auto(int)");
		}
		
	}
	
	/*
	 * Angenommen, dass nur die Klasse PKW 'Serializable' markiert werden darf/kann
	 */
	static class PKW extends Auto implements Serializable {

		transient Motor motor; // <- nicht Serializable
		String hersteller;

		public PKW(String hersteller, int baujahr) {
			super(baujahr);
			this.hersteller = hersteller;
			System.out.println("PKW(String, int)");
		}

		@Override
		public String toString() {
			return "PKW [hersteller=" + hersteller + ", baujahr=" + baujahr + "]";
		}
	}
	
	
	
	public static void main(String[] args) {

		String file = "pkw03";
		
		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)) ) {
			
			PKW pkw1 = new PKW("Audi", 2001);
			pkw1.motor = new Motor("T1");
			
			oos.writeObject(pkw1);
			System.out.println("Serialisiert: " + pkw1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file)) ) {
			
			PKW pkw2 = (PKW)ois.readObject();
			System.out.println("Deserialisiert: " + pkw2);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}	
}
