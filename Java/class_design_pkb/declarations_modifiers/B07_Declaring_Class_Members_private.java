package declarations_modifiers;

public class B07_Declaring_Class_Members_private {

}
/*
 *
Members marked private can't be accessed by code in any class other than the
class in which the private member was declared.


 */

class Roo {
private String doRooThings() { //it is not an overriding method!
// imagine the fun code that goes here, but only the Roo class knows
return "fun";//do fun, secret stuff
}
}

class UseARoo {
	public void testIt() {
	Roo r = new Roo(); //So far so good; class Roo is public
	//System.out.println(r.doRooThings()); // Compiler error!
}
}

class Cloo extends Roo { // Still OK, superclass Roo is public
	public void testCloo() {
//	System.out.println(doRooThings()); // Compiler error!
}
}
