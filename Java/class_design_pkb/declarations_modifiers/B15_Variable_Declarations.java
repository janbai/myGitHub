package declarations_modifiers;
/*
 ■ Primitives: 	char, boolean, byte, short, int, long, double, or float.
 1- Once a primitive has been declared, its primitive type can never change
 2- although in most cases its value can change.
 
 byte 7 bit :  0 			0010011			0 = positive, I = negative 
			 sign bit	   value bits		2^7 = 0 thru 128 or -1 thru -128
 short 15 bit
 
 ■ Reference variables:
 1- A reference variable is used to refer to (or access) an object
 2- declared to be of a specific type, and that type can never be changed.
 3- char is an integer type (16 bit short is enough)
 */

// the shadowing:
public class B15_Variable_Declarations {
// Declaring Primitives
	byte b;
	boolean myBooleanPrimitive;
	int x, y, z; // declare three int primitives
//Declaring Reference Variables
	Object o;
	Dog myNewDogReferenceVariable;
	String s1, s2, s3; // declare three String vars.
	
	public static void main(String[] args) {
		new TestServer().logIn();
		new TestServer().count();
		
		final int testFinal = 10; // Final Variables
		System.out.println(testFinal);
	//	testFinal = 11; //CF
		TestFinal tf1 = new TestFinal();
		TestFinal tf2 = new TestFinal();
		
		}
}

/*
 * final:
 1- final class cannot be subclassed
 2- final method cannot be overridden by a subclass
 3- final variable cannot be assigned a new value
 */
final class TestFinal{}
class TestServer {
int count = 9; // Declare an instance variable named count
public void logIn() {
int count = 10; // Declare a local variable named count
System.out.println("local variable count is " + count);
}
public void count() {
System.out.println("instance variable count is " + count);
}

}
class Dog{}
/*
 * Instance Variables
■ Can use any of the four access levels (marked with any of the three access modifiers)
■ Can be marked final
■ Can be marked transient
■ Cannot be marked abstract
■ Cannot be marked synchronized
■ Cannot be marked strictfp
■ Cannot be marked native
■ Cannot be marked static because then they'd become class variables
 */
class Employee {
	// define fields (instance variables) for employee instances
	private String name;
	private String title;
	private String manager;
	// other code goes here including access methods for private
	// fields
}

/*
 Local (Automatic/Stack/Method) Variables
 1- are always on the stack, not the heap.
 2- There is no such thing as a stack object, only a stack variable.
 3- can be marked final
 4- must be initialized before you try to use it.
 5- don't get default values.
 6- can't be referenced in any code outside the method
 7- It is possible to declare a local variable with the same name as an instance variable.
 8- this always, always, always refers to the object currently running
 */

class TestServer1 {
public void logIn() {
int count = 10;
}
public void doSomething(int i) {
//count = i; // Won't compile! Can't access count outside
// method logIn()
}
}

class Foo {
int size = 27;
public void setSize(int size) {
this.size = size; // this.size means the current object's
// instance variable, size. The size
// on the right is the parameter
}
}

