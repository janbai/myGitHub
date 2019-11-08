
public class WdhVonWdh {

	static class Foo {
		void m() throws ArithmeticException {
			System.out.println(5/0);
		}
	}
	
	static class Bar extends Foo {
		void m()  { 
			
			try {
				super.m();
			} finally {
				System.out.println("a ");
			}
			}
	}
	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	try {
		Foo f = new Bar();
		f.m();
	} catch (Exception e) {
		System.out.println("b");
	}
		
		
		
	}

}
