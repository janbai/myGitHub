package eBookExample;

public class MyOuter2 {
	private String x = "Outer2";
	void doStuff() {
		final String z = "local variable"; // now MyInner can use z!
			
		class MyInner {
	
			public void seeOuter() {
			System.out.println("Outer x is " + x);
			System.out.println("Local var z is " + z);
			// we removed the line that changed z
		} // close inner class method
	} // close inner class
		
		x = "Changing Outer2";
		MyInner mi = new MyInner();
		mi.seeOuter();
	} // close outer class doStuff() method
} // close outer class doStuff() method
