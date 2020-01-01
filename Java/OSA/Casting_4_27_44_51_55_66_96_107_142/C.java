package Casting_4_27_44_51_55_66_96_107_142;
//Q096

class A {
public void test() {
System.out.println("A");
}
}
class B extends A {
public void test() {
System.out.println("B");
}
}
public class C extends A {
public void test() {
System.out.println("C");
}
public static void main(String[] args) {
A b1 = new A();
A b2 = new C();
b1 = (A) b2;
A b3 = (B) b2; // line n1 	ClassCastException
b3 = (C) b2; // line n2		ClassCastException
b1.test();
b3.test();
}
}