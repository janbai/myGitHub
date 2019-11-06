package arbeitsblaetter;




public class Exception_03 {


	static void m1() {
		System.out.print("a ");
		//m2();					//Stack over flow 
		System.out.println(5/0);
		System.out.print("b ");
		
	}
	
	static void m2() {
		System.out.print("c ");
		try {
			m1();
		} catch (Exception e) {
			
			System.out.print("e2 ");
		}
		System.out.print("d ");
		
	}
	
	static void m3() {
		System.out.print("e ");
		
		m2();
		System.out.print("f ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			m3();
		} catch (Exception e) {
			
			System.out.println("e4");
		}
		
		
		
		
	}

}
