package declarations_modifiers;

public class B03_Interface_Access_Modifires {}
/* 
 ■ Declaring an Interface 
 
1- generally defining a contract for what a class can do, without saying anything about how the class will do it.
2- generally has only abstract methods
3- Interfaces can be implemented by any class and from any inheritance tree.
4- All interface methods are implicitly public. Unless declared as default or static, 
5- they are also implicitly abstract
6- All variables defined in an interface must be public, static, and final
7- methods cannot be marked final, strictfp, or native.
8- An interface can extend one or more other interfaces.
9- An interface cannot extend anything but another interface.
10-An interface cannot implement another interface or class.
11-An interface must be declared with the keyword interface.
12-Interface types can be used polymorphically
13-Declaring Interface Constants: public static final
14-interface variable is final and can never be given a value by the implementing (or any other) class.

*/

interface Bounceable{
	int BAR = 42;						// => public static final int BAR = 42;
	void setBounceFactor(int bf);		// => public abstract void setBounceFactor(int bf);
	void bounce1( );					// => public abstract void bounce( );
	public void bounce2();
	abstract void bounce3();
	public abstract void bounce4();
	abstract public void bounce5();
	
//	final void bounce(); // final and abstract can never be used together, and abstract is implied
//	private void bounce(); // interface methods are always public
//	protected void bounce(); // (same as above)
}

class Tire implements Bounceable{
	int BAR = 27;						//	=> BAR = 27 assignment will not compile.
// interface variable is final and can never be given a value by the implementing (or any other) class.
	public void setBounceFactor(int bf){ }
	@Override
	public void bounce1() { }
	@Override
	public void bounce2() { }
	@Override
	public void bounce3() { }
	@Override
	public void bounce4() { }
	@Override
	public void bounce5() { }
	
}


