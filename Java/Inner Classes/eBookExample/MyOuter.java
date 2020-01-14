package eBookExample;

public class MyOuter {

	private int x = 5;
	public String str = "Hallo from Outer";
	
	void makeInner() {
		MyInner in = new MyInner();
		in.showInner();
	}
	class MyInner{
		
		void showInner() {
			System.out.println("Hallo from Inner");
			System.out.println("Outer private x is:" + x);
			System.out.println("Inner class referance is: " + this);
			System.out.println("Outer class referance is " + MyOuter.this);
			
			
		}
	}
	
	void doStuff() {
		final String z = "local variable";
		class MyInner1 {
			void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("Local var z is " + z);
			//	z = "changing the local variable"; // Won't compile!
				} // close inner class method
			} // close inner class definition
		
		MyInner1 mi = new MyInner1(); // This line must come
		// after the class
		mi.seeOuter();
		} // close outer class method doStuff()
} // close outer class


