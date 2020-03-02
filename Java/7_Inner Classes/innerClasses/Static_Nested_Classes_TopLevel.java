package innerClasses;

class BigOuter{
	static class Nest{ void go() { System.out.println("hi ...");}}
}


public class Static_Nested_Classes_TopLevel {
	static class B2{ void goB2 (){ System.out.println("hi B2.....");}}
	
	public static void main(String[] args) {

		BigOuter.Nest n = new BigOuter.Nest();
		n.go();
		
		B2 b2 = new B2();
		b2.goB2();
		
		


	}

}
