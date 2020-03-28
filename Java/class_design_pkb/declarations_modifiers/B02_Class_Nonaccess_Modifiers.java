package declarations_modifiers;
import food.Fruit;
/*
 * Nonaccess Class Modifiers: final, abstract, or strictfp.
 
■ strictfp:
1- can be used to modify a class or a method, but never a variable.
2- any method code in the class conform strictly to the IEEE 754 standard rules for floating points.
 
■ Final:
1- the class can't be subclassed no other class can ever extend (inherit from) a final class.
2- absolute guarantee that none of the methods in that class will ever be overridden.
3- gives the security that nobody can change the implementation out from under you.
4- for example: String class cannot be subclassed
5- your class can't ever be improved upon, or even specialized, by another programmer.

final class AA{}
class BB extends AA{} // CF

■ Abstract: (concrete just means not abstract)
1- can never be instantiated: you can't make objects out of it.
2- if even a single method is abstract, the whole class must be declared abstract.
3- take advantage of polymorphism and gives you the greatest degree of flexibility and extensibility.
4- You can't mark a class as both abstract and final. 
   They have nearly opposite meanings. 
   An abstract class must be subclassed, whereas a final class must not be subclassed
5- 
*/
 class A02{
	public boolean OverrideMethod() {
		return false;
	}
}
class B02 extends A02 {
	A02 a = new A02();
	@Override
	public boolean OverrideMethod() {
		return true;
	}
}

// Notice that the methods marked abstract end in a semicolon rather than curly braces
abstract class Car {
private double price;
private String model;
private String year;
public abstract void goFast();
public abstract void goUpHill();
public abstract void impressNeighbors();
// Additional, important, and serious code goes here
}

public class B02_Class_Nonaccess_Modifiers {
	// Car x = new Car(); // CF
}

class Apple extends Fruit{

	@Override
	public int calculatePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
