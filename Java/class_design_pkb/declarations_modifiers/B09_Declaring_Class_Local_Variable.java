package declarations_modifiers;

public class B09_Declaring_Class_Local_Variable {

}

/*
■ Local Variables and Access Modifiers
There is never a case where an access modifier can be applied to a local variable
*/
class Foo {
void doStuff() {
// private int x = 7; // CF
	final int y = 10; // only one modifier that can ever be applied to local variables—final.
	// y = 11;// CF
}
}