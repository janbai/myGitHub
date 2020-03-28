package declarations_modifiers;
/*
  ■ Declaring Static Interface Methods:
1- by using the static keyword.
2- They are public, by default, and the public modifier is optional.
3- they cannot be marked as private, protected, final, or abstract.
4- They must have a concrete method body.
5- When invoking a static interface method, the method's type (interface name) MUST be included in the invocation
*/


interface StaticIface {
static int m1(){ return 42; } // legal
public static void m2(){ ; } // legal
// final static void m3(){ ; } // illegal: final not allowed
// abstract static void m4(){ ; } // illegal: abstract not allowed
// static void m5(); // illegal: needs a method body
}
public class B05_Declaring_Static_Interface_Methods {


public static void main(String[] args) {
System.out.println(StaticIface.m1()); // legal: m1()'s type
// must be included
new B05_Declaring_Static_Interface_Methods().go();
// System.out.println(m1()); // illegal: reference to interface is required


}
void go() {
System.out.println(StaticIface.m1()); // also legal from an instance
}
}