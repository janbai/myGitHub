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


 */
// 	■ all classes in the Java Universe (JU) have access to a public class.
// 	  but you'll still need to import the public class or use the fully qualified name.
	
public class B01_Class_Access_Modifiers {}
	
//	■ class with default access can be seen only by classes within the same package.
	
class MyClass { } 



class A{
	int x;
	public void m() {}
}
class B extends A{}
class C {
	A a = new A();

}

/*
class A access class B =>
■ Create an instance of class B.
■ Extend class B (become a subclass of class B).
■ Access certain methods and variables within class B, depending on the access
control of those methods and variables.
 */
