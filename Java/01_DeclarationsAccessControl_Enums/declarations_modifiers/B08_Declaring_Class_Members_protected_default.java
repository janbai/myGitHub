package declarations_modifiers;

public class B08_Declaring_Class_Members_protected_default {

}
/*
 
■ Protected member:  
	1- package + kids, package-level access with a special exception for subclasses outside the package
	1-may be accessed only if the class accessing the member belongs to the same package.
	2-and can be accessed (through inheritance) by a subclass even if the subclass is in a different package
	4- The subclass can see the protected member only through inheritance
	5- The subclass CHILD cannot access the protected members in the superclass PARENT by create the partent 
		object Parent p = new Parent(); 
		p.protectedMember(); => Compiler error
		For a subclass outside the package, the protected member can be accessed only through inheritance.
		Once the subclass-outside-the-package inherits the protected member,
		becomes private to any code outside the subclass,
 * 
 */

/*
■ Default member: 
	package restriction. No exceptions
	may be accessed only if the class accessing the member belongs to the same package.

*/

