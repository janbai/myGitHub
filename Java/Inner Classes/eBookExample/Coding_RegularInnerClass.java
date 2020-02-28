package eBookExample;

class Class_AB {
private int x = 7;
// inner class definition
class Class_B {
	public void seeOuter() {
		System.out.println("Outer x is " + x);
		}
	} // close inner class definition
} // close outer class

class Class_AC {
private int x = 9;
public void makeInner() {
Class_C in = new Class_C(); // make an inner instance
in.seeOuter();
}
class Class_C {
public void seeOuter() {
System.out.println("Outer x is " + x);
}
}
}

public class Coding_RegularInnerClass {

	public static void main(String[] args) {

		Class_AB outer = new Class_AB();
			
		Class_AB.Class_B inner = outer.new Class_B();
			inner.seeOuter();
		
			Class_AC outer2 = new Class_AC();
			
			Class_AC.Class_C inner2 = outer2.new Class_C();
				inner2.seeOuter();
			
	}

}
