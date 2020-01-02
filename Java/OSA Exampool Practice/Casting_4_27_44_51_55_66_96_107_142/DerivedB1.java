package Casting_4_27_44_51_55_66_96_107_142;
//Q142
class Base1 {
public void test() {
	System.out.println("Base ");
}
}
class DerivedA1 extends Base1 {
	public void test() {
		System.out.println("DerivedA");
}
}
class DerivedB1 extends DerivedA1 {
	public void test() {
		System.out.println("DerivedB");
}
	public static void main(String[] args) {
		Base1 b1 = new DerivedB1();
		Base1 b2 = new DerivedA1();
		Base1 b3 = new DerivedB1();
		b1 = (Base1) b3;
		Base1 b4 = (DerivedA1) b3; // ClassCastException
		b1.test();
		b4.test();
	}
}