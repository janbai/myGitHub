package declarations_modifiers;

/*
■ Access modifiers (public, protected, private)
■ Nonaccess modifiers (including strictfp, final, and abstract)

a class can be declared with only public or default access; 
the other two access control levels don't make sense for a class

Oracle recommends that developers use reverse domain names,
appended with division and/or project names

package name: 	com.janbai.steps.clientcode
class name	:	com.janbai.steps.clientcode.Utilities

■ all classes in the Java Universe (JU) have access to a public class.
 	  but you'll still need to import the public class or use the fully qualified name.

 */
 	

public class B01_Class_Access_Modifiers {}
	
//	■ class with default access can be seen only by classes within the same package.
	

class A1{
	public String s = "Access Variable";
	public void m() {System.out.println("Access Method");}
	public int n() { return 10;}
}
class B1 extends A1 { // ■ Extend class A (become B subclass of class A).
	A1 a = new A1();
	String x = a.s;
	int y = n();		// Access certain methods and variables within class A, 
	int z = a.n();					// depending on the access control of those methods and variables.
	public void m1() {
		m();
		a.m();
	}

} 	
class C {
	A1 a = new A1(); 		// ■ Create an instance of class A
	String x = a.s;
	int y = a.n();
}




