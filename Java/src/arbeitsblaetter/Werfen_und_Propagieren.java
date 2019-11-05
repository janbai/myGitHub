package arbeitsblaetter;

public class Werfen_und_Propagieren {

	
	static void m1() {
		System.out.println("a");
		if(true)
			throw new ArithmeticException("test.exc");
	//	System.out.println(5/0);
		System.out.println("b");
		
	}
	
	static void m2() {
		System.out.println("c");
		m1();
		System.out.println("d");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("m");
		m2();
		
		System.out.println("end of main");
		
		
	}

}
