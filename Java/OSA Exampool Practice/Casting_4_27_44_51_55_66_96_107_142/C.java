package Casting_4_27_44_51_55_66_96_107_142;
//Q096

class A {
public void test() {
System.out.println("A");
}
}
class B extends AA {
public void test() {
System.out.println("B");
}
}
public class C extends AA {
public void test() {
System.out.println("C");
}
public static void main(String[] args) {
AA b1 = new AA();
AA b2 = new CC();
b1 = (AA) b2;
AA b3 = (BB) b2; // line n1 	ClassCastException
b3 = (CC) b2; // line n2		ClassCastException
b1.test();
b3.test();
}
}