package arbeitsblaetter;

public class Exceptions_01 {

	static boolean isAddOk = true;
	
	
	
	static int add (int x, int y) {
		isAddOk =true;
		long result = (long)x +y;
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			System.out.println(" Fehler! Integer Overflow:  "+ result);
			isAddOk= false;
		}
		return (int) result;
	}
	
	public static void main(String[] args) {
	
		final int MIN_Entfernung = 1000;
		int a = 2;
		int b = Integer.MAX_VALUE;
		
		int s = add(a,b);
		System.out.println("entfernung: " + s); 
		
		if (!isAddOk) {
			System.out.println("Feuer!");
		}else {
			System.out.println("Alles Klar");
		}

	}

}
