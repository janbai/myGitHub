package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class B02 {
	
	static class Auto implements Serializable {
		int baujahr;

		public Auto() {System.out.println("Auto()");}
		public Auto(int baujahr) {
			this.baujahr = baujahr;
			System.out.println("Auto(int)");
		}
		
	}
	static class PKW extends Auto implements Serializable{
		String hersteller;
		int baujahr;
		public PKW(String hersteller, int baujahr) {
			super(baujahr);
			this.hersteller = hersteller;
			System.out.println("Auto(String, int)");
			
		}
		@Override
		public String toString() {
			return "PKW [hersteller=" + hersteller + ", baujahr=" + baujahr + "]";
		}
		
		
	}
	public static void main(String[] args) {
		
		String file = "pkw01";
	try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
		PKW pkw1 = new PKW("Audi", 2001);
		oos.writeObject(pkw1);
		System.out.println("Serialisiert: " + pkw1);
	}catch(IOException e) {
		e.printStackTrace();
	}

	try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
		Object pkw2 = (PKW)ois.readObject();
		System.out.println("Deserialisiert: " + pkw2);
	}catch(IOException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
	
	}

}
