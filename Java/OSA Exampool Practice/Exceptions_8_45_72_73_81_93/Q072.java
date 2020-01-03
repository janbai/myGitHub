package Exceptions_8_45_72_73_81_93;


public class Q072 {

	public static void main(String[] args) {
		
		try {
			method1();
			} catch (MyException ne) {
			System.out.print("A");
		}
	}
	
	
	public static void method1() { // line n1
	
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
			} catch (RuntimeException re) {
			System.out.print("B");
			}
	}
}