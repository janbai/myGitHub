package arbeitsblaetter;

public class Exception_07 {

	/**
	 * Bildet die Summe von a und b. Macht es immer korrect:
	 * @param a
	 * @param b
	 * @return liefert die Summe von a und b
	 * @throws IllegalArgumentException beim Integer Overflow
	 */

public static int add(int a,int b) throws IllegalArgumentException {
		long result = (long)a + b;
		if( result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Integer overflow");
		}
		
		return (int)result;
	}
	
	static void m1() {
		throw new NullPointerException();
	}
	
	static void m2() throws NullPointerException{
		
	}
	
	static void m3() throws NullPointerException, ArithmeticException{
		
	}
	
	static void m4() throws NullPointerException, Exception{
		
	}
	

	
	public static void main(String[] args) {
		
		add(2,3);

	}

}
