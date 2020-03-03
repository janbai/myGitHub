package innerClasses;

import java.util.Map;
import java.util.Map.Entry;



class Pairs<Integer, String>{
	static class Element {
		void go() { System.out.println("hi ...");}}
}


public class Static_Nested_Classes_TopLevel {
	static class B2{ void goB2 (){ System.out.println("hi B2.....");}}
	
	public static void main(String[] args) {

		Pairs.Element n = new Pairs.Element();
		n.go();
		
		B2 b2 = new B2();
		b2.goB2();
		
		Map.Entry<Integer, String> entry =  new Pairs.Element();


	}

}
