package ocp_self_test;
interface Gadget {
void doStuff();
}
abstract class Electronic1 {
void getPower() { System.out.print("plug in "); }
}
public class Tablet extends Electronic1 implements Gadget {
 public void doStuff() { System.out.print("show book "); }
public static void main(String[] args) {
new Tablet().getPower();
new Tablet().doStuff();
}

interface MyInterface {
	public static void m1() {;}
	 default void m2() {}
	 abstract int m3();
	 default short m4() {return 5;}
	 default long m5() {
		return 0;
	}
	 static void m6() {}
	}
}