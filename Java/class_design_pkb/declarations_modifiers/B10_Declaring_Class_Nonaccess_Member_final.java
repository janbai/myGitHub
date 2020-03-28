package declarations_modifiers;

public class B10_Declaring_Class_Nonaccess_Member_final {

}
/*
■ Final Methods: cannot be overridden.
*/

class SuperClass{
public final void showSample() {
System.out.println("One thing.");
}
}

class SubClass extends SuperClass {
public void showSample() { // CF
System.out.println("Another thing.");
}
}

/*
■ Final Arguments: 
you CANNOT force the final reference variable to refer to a different object..
final parameter must keep the same value as the argument had when it was passed into the method.
*/
class TestFinalArguments{
	public void getRecord(int fileNumber, final int recNumber) {
		recNumber = 12; // CF
		
		
	}

}