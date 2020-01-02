package Casting_4_27_44_51_55_66_96_107_142;
class A {
	public A() {
	System.out.print("A ");
	}
	}

	class B extends A {
	public B() { // Line n1
	System.out.print("B ");
	}
	}

	class C extends B {
	public C() { // Line n2
	System.out.print("C ");
	}
	}

public class Q027{
	
	

public static void main(String[] args) {

	C c = new C(); 			// A B C
	System.out.println();	
	A b = new B();			// A B 
	System.out.println();
	 A a = new A();  		// A
	 System.out.println();
	// c = (C) a; 			// ClassCastException
	 System.out.println();
	 b = (B) c;
//	B b1 =   new C();	// A B C 
	System.out.println();
	System.out.println();
	//C c1 = (C) new A(); 	// A ClassCastException
	System.out.println();
//	B c2 = (C) new B(); 	// A B ClassCastException
	
//	System.out.println(args[0]); // ArrayIndexOutOfBoundsException
}
}