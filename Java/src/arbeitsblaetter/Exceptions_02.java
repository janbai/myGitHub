package arbeitsblaetter;

public class Exceptions_02 {

	static int add (int x, int y) {
		
		long result = (long)x +y;
		if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			//System.out.println(" Fehler! Integer Overflow:  "+ result);
		throw new IllegalArgumentException(" Fehler! Integer Overflow:  " + result);
		}
		return (int) result;
	}
	
	
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = Integer.MAX_VALUE;
		try {
			int s = add(a,b);
			System.out.println("entfernung: " + s); 
			
		}catch (Exception e) {
			System.out.println(" Die Anmeldung hat einen Fehler erkannt! Integer Overflow:  " + e.getMessage());
		}
		
	}

}
