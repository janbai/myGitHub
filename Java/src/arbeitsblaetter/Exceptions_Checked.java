package arbeitsblaetter;

import java.text.DateFormat;
import java.text.ParseException;

public class Exceptions_Checked {
	static void m0() {
		throw new NullPointerException();
	}
	
	static void m1() throws NullPointerException {
		throw new NullPointerException();
	}
	
	static void m2() throws ParseException {
		throw new ParseException("", 1);
	}
	
	static void m3()  {
		try {
			throw new ParseException("", 1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	static void m4() throws ParseException  {
		throw new ParseException("", 1);
	}
	
	static void m5() throws ParseException  {
		throw new ParseException("Hallo", 1);
	}
	
	public static void main(String[] args) throws ParseException {
		
	//		m0();
	//		m1();
	//		m2();
	//		m3();
	//		m4();
	//		m5();
	
			System.out.println(Integer.parseInt("Hallo welt"));
			
		//	DateFormat.getInstance().parse("Hallo welt");
			
	}

}
