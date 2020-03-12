package declarations_modifiers;
/*
 1- A key difference is that a constructor can't ever, ever, ever, have a return type…ever!
 2- must have the same name as the class in which they are declared.
 3- Constructors can't be marked static
 4- can't be marked final or abstract (because they can't be overridden).
 */
class Foo {
protected Foo() { } // this is Foo's constructor
protected void Foo() { } // this is a badly named, but legal, method
}

class Foo2 {
	// legal constructors
	Foo2() { }
	private Foo2(byte b) { }
	Foo2(int x) { }
	Foo2(int x, int... y) { }
	// illegal constructors
	void Foo2() { } // it's a method, not a constructor
	Foo() { } // not a method or a constructor
	Foo2(short s); // looks like an abstract method
	static Foo2(float f) { } // can't be static
	final Foo2(long x) { } // can't be final
	abstract Foo2(char c) { } // can't be abstract
	Foo2(int... x, int t) { } // bad var-arg syntax
	}
public class B14_Constructor_Declarations {

}
