package pkg1_Encapsulation;
class Test {}

public class B02_Inheritance_and_Polymorphism {
	public static void main(String [] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		if (!t1.equals(t2))
			System.out.println("they're not equal");
	if (t1 instanceof Object)
		System.out.println("t1's an Object");
	
	Object o = new Object();
	}
}

