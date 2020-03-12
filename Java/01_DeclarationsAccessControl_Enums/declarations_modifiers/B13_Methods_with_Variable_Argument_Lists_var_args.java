package declarations_modifiers;
/*
■ arguments The things you specify between the parentheses when you're
invoking a method:
doStuff("a", 2); // invoking doStuff, so "a" & 2 are
// arguments
 * 
 ■ parameters The things in the method's signature that indicate what the
method must receive when it's invoked:
void doStuff(String s, int a) { } // we're expecting two parameters: String and int

■ Var-arg type When you declare a var-arg parameter, you must specify
the type of the argument(s) this parameter of your method can receive.
(This can be a primitive type or an object type.)
■ Basic syntax To declare a method using a var-arg parameter, you follow
the type with an ellipsis (...), a space (preferred but optional), and then the
name of the array that will hold the parameters received.
■ Other parameters It's legal to have other parameters in a method that
uses a var-arg.
■ Var-arg limits The var-arg must be the last parameter in the method's
signature, and you can have only one var-arg in a method.
 */
public class B13_Methods_with_Variable_Argument_Lists_var_args {
	class Animal{}
	class LegalVar_Arg{
		void doStuff(int... x) { } // expects from 0 to many ints
		// as parameters
		void doStuff2(char c, int... x) { } // expects first a char,
		// then 0 to many ints
		void doStuff3(Animal...animal) { } // 0 to many Animal objects
		// (no space before the argument is legal)
	}
	class Illegal_lVar_Arg{
		void doStuff4(int x...) { } // bad syntax
		void doStuff5(int... x, char... y) { } // too many var-args
		void doStuff6(String... s, byte b) { } // var-arg must be last
	}
}
