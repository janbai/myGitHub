package arbeitsblaetter;

import java.text.ParseException;

public class Exceptions_KleineAufgabe_01 {

	public static int add(int a,int b) throws IllegalArgumentException, ParseException,NumberFormatException {
		long result = (long)a + b;
		if( result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Integer overflow");
		}
		
		return (int)result;
	}
	
	
	
	
	public static void main(String[] args) throws IllegalArgumentException, ParseException {
		// TODO Auto-generated method stub

		int a = Integer.parseInt("10");
		int b = Integer.parseInt("214");
		add(a,b);
		System.out.println(add(a,b));
	}
static boolean IsInteger(String text) {
	
	try {
		Integer 
	} catch (Exception e) {
		// TODO: handle exception
	}
	return false;
}
}
