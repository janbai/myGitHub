package innerClasses;
class MyOuter2{
	private String x = "Outer2";
	/*
	 * the only modifiers you can apply to a method-local inner class 
	 * are abstract and final
	 * but, as always, never both at the same time.
	 */
	void doStuff() { 
		String z = "local variable";
		class MyInner{
		public void seeMyOuter() {
			System.out.println("Outer x = " + x);
			System.out.println("local variable in the methode inner class z = " + z);
			//z = "changing the local variable"; //CF *the local variables must be final or effectively final
		}
		}//close inner class
		x = "changing the Outer2";
		MyInner inner = new MyInner();
		inner.seeMyOuter();
	}
	
}
public class Method_Inner_Classes {

	public static void main(String[] args) {


		MyOuter2 outer = new MyOuter2();
		outer.doStuff();

	}

}
