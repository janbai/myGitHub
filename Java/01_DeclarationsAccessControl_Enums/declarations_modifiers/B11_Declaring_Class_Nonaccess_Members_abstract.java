package declarations_modifiers;

public class B11_Declaring_Class_Nonaccess_Members_abstract {

}
/*
■ Abstract Methods: 
1- cannot be implemented. ( not implement)
2-contains no functional code 
3-doesn't even have curly braces, but instead closes with a semicolon, it has no method body
4-force subclasses to provide the implementation
5-It is illegal to have even a single abstract method in a class that is not explicitly declared abstract!
6-You can, however, have an abstract class with no abstract methods
7-Any class that extends an abstract class must implement all abstract methods of the superclass, 
	unless the subclass is also abstract.
8-The first concrete subclass of an abstract class must implement all abstract methods of the superclass.
9-Concrete just means nonabstract
10-A method can never, ever, ever be marked as 
		both abstract and final 
	or 	both abstract and private.
	abstract methods must be implemented (which essentially means overridden by a subclass), 
	whereas final and private methods cannot ever be overridden by a subclass
11-	The abstract modifier can never be combined with the static modifier

*/

class IllegalClass {
//public abstract void doIt(); // class IllegalClass must be declared abstract.
}
abstract class LegalClass {
void goodMethod() {
// lots of real implementation code here
}
}

abstract class Vehicle {
	private String type;
	public abstract void goUpHill(); // Abstract method
	public String getType() { // Non-abstract method
	return type;
	}
}
abstract class Car1 extends Vehicle {
	public abstract void goUpHill(); // Still abstract
	public void doCarThings() {
	// special car code goes here
	}
}
class Mini extends Car1 {
	public void goUpHill() {
	// Mini-specific going uphill code
	}
}

abstract class A {
abstract void foo();
}
class B extends A {

	@Override
	void foo() {}
//void foo(int i) { } // CF (a method using the same identifier, but different arguments)
	
	
	abstract class Car2020 {
		void strartEngine() {}
		abstract void goForward();
		abstract void reverse();
		void stop() {}
		abstract void turn(int inWhichWay);
		
	}
	
	class SportCar extends Car2020 {

		@Override
		void goForward() {}

		@Override
		void reverse() {}

		@Override
		void turn(int inWhichWay) {}
		
	}
	abstract class SUV extends Car2020{
		abstract void goOffRoad();
	}
	class AcmeRover extends SUV{

		@Override
		void goOffRoad() {}

		@Override
		void goForward() {}
		@Override
		void reverse() {}

		@Override
		void turn(int inWhichWay) {}
		
	}
}
