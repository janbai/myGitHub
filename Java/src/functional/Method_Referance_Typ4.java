package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Method_Referance_Typ4 {

	public static void main(String[] args) {


		Function<String, Integer> f0 = new Function<> (){
			public Integer apply(String s) {
				return s.length();
				
			}
		};

		
		Function<String, Integer> f1 = s -> s.length();
		
		Function<String, Integer> f2 = String::length;
		
		int result = f2.apply("Hallo");
		
		System.out.println(result);
		
		BiFunction<String, String, String> f3 = String::concat;  
		BiFunction<String, String, String> f4 = (s1, s2) -> s1.concat(s2);
		
	String newString = f4.apply("hallo ", "word");
	System.out.println(newString);
		
	}

	static void kleineAufgabe() {
		BiFunction<String, String, String> f0 = new BiFunction<>() {

			@Override
			public String apply(String t, String u) {
				
				return t.concat(u);
			}
			
		};
		
		
		
	}
	
}
