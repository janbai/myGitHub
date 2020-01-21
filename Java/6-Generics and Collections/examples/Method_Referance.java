package examples;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;

/*
 * Kind																				Example
	Reference to a static method													ContainingClass::staticMethodName
	Reference to an instance method of a particular object							containingObject::instanceMethodName
	Reference to an instance method of an arbitrary object of a particular type		ContainingType::methodName
	Reference to a constructor														ClassName::new
 */

class MyUtils1 {
   static boolean isLeer(String s) {
	   return s!= null && !s.isEmpty();
   }

public static boolean random(String s) {
	// TODO Auto-generated method stub
	return s!= null && !s.isEmpty();
}

public static int random(Number a, Number b) {
	// TODO Auto-generated method stub
	return new Random().nextInt();
}
}
public class Method_Referance {
	
	public static void main(String[] args) {
		Predicate<String> p0 = new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return MyUtils1.isLeer(s);
			}
		};
				

		Predicate<String> p1 = s -> MyUtils1.isLeer(s);
		Predicate<String> p2 = MyUtils1 :: isLeer;
		
		

	}
static void kleinAufgabe() {
	
	Comparator<Integer> c1 = (i1 , i2) -> MyUtils1.random(i1, i2);
	Comparator<Integer> c2 = MyUtils1 :: random;
}
}
