package genericsExamples;

import java.util.Comparator;

interface TV extends Runnable {
	
}

class TVDE implements TV, Comparator {
	String typ = "deutsche Steckdose";
	public String getTyp() {return typ;}
	
	@Override
	public void run() {System.out.println("TVDE [typ=" + typ + "]");}

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(" :Bosch" );
		return 230;
	}
	
	
}
class TVUK implements TV, Comparator {
	String typ = "englische Steckdose";
	public String getTyp() {return typ;}
	@Override
	public void run() {System.out.println("TVUK [typ=" + typ + "]");}
	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(" :Range Rover" );
		return 220;
	}
	
	
}
class TVJP implements TV, Comparator {
	String typ = "japanische Steckdose";
	public String getTyp() {return typ;}
	@Override
	public void run() {System.out.println("TVJP [typ=" + typ + "]");}
	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(" :Samsung" );
		return 0;
	}
	
	
}

class Steckdose<T extends TV> implements Runnable, Comparator<String>  {
	private T tv;
	
	void anschliessen(T tv) {
		tv.run();
		
		}

	@Override
	public int compare(String o1, String o2) {
		System.out.println("in der Steckdose");
		return 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class SteckdoseGenerics {
	static class ConnectTV implements Runnable, Comparator<String> {
		
		public void run() {
			System.out.println( " :ist angeschlossen");
		};
		
		@Override
		public int compare(String o1, String o2) {
			System.out.println("in der ConnectTV");
			return 0;
		};
	}
	public static void main(String[] args) {
		TVDE tvDE = new TVDE();
		TVUK tvUK = new TVUK();
		TVJP tvJP = new TVJP();
		
		Steckdose<TVDE> sdDE = new Steckdose<>();
		Steckdose<TVUK> sdUK = new Steckdose<>();
		Steckdose<TVJP> sdJP = new Steckdose<>();
		
		sdDE.anschliessen(tvDE);
		sdUK.anschliessen(tvUK);
		sdJP.anschliessen(tvJP);
		
	//	Steckdose<ConnectTV> coDE = new Steckdose<>();
		sdDE.compare("aaa", "bbb");
		
		
	}

}
