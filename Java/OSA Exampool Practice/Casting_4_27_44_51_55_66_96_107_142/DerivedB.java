package Casting_4_27_44_51_55_66_96_107_142;
//Q044
class Base {
	public void test() {
		System.out.println("Base ");
	}
}

class DerivedA extends Base {
	public void test() {
	System.out.println("DerivedA");
	}
}

class DerivedB extends Base {
	public void test() {
	System.out.println("DerivedB");
	}
	
	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		b1 = (Base) b3;
		
	// 	Base b4 = (DerivedA) b3; // ClassCastException
	// 	Base b4 = (DerivedA) b2; // DerivedA
	// 	Base b4 = (DerivedB) b3; // DerivedB
	//	Base b4 = (DerivedB) b1; // DerivedB
		Base b4 = (DerivedB) b2; // ClassCastException
		b1.test(); // DerivedB
		
		b4.test(); 
		
		
	}
}