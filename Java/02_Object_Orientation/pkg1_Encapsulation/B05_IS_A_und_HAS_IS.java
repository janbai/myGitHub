package pkg1_Encapsulation;
class Animal{}
class LeadRope{}

class Horse extends Animal {
private Halter myHalter = new Halter();
public void tie(LeadRope rope) {
myHalter.tie(rope); // Delegate tie behavior to the Halter object
}
}
class Halter {
public void tie(LeadRope aRope) {
// Do the actual tie work here
}
}
public class B05_IS_A_und_HAS_IS {

}

/*
1- The only way to access an object is through a reference variable.
2- A reference variable can be of only one type, and once declared, that type can never be changed
 	(although the object it references can change).
3- A reference is a variable, so it can be reassigned to other objects 
	(unless the reference is declared final).
4- A reference variable's type determines the methods that can be invoked on
	the object the variable is referencing.
5- A reference variable can refer to any object of the same type as the declared
	reference, or—this is the big one—it can refer to any subtype of the declared type!
6- A reference variable can be declared as a class type or an interface type. If
	the variable is declared as an interface type, it can reference any object of any
	class that implements the interface.
 */
