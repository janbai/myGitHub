
package declarations_modifiers;

public class B04_Declaring_Default_Interface_Methods {}


/*
 ■  Declaring default Interface Methods:
 1- default methods are declared by using the default keyword
 2- default keyword can be used only with interface method signatures, not class method signatures.
 3- default methods are public by definition
 4- default methods cannot be marked as private, protected, static, final, or abstract.
 5- default methods must have a concrete method body.
 */
interface TestDefault {
default int m1(){ return 1; } // legal
public default void m2(){ ; } // legal
// static default void m3(){ ; } // illegal: default cannot be marked static
// default void m4(); // illegal: default must have a method body
}

