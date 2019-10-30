package functional;

import java.util.function.Function;
import java.util.function.Supplier;



public class Supplier_20191030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	testFunction();	
		
		
		
	}

	static void testSupplier() {
		
		System.out.println("******Supplier");
		
		Supplier<Double> s1 = new Supplier <>() {
			public Double get() {
				return 22d;
			}
			};
			
			Supplier <Double> s2 = () -> 22.28;
			System.out.println(s2.get());
		
	}
	static void testFunction () {
		System.out.println("****Test Function");
		Function<Integer,String> f1 = new Function <>(){
			public String apply(Integer x) {
				return "<" + x + ">";
			}
		};
		 
		Function<Integer,String> f2 = x-> "<" + x + ">";
		String result = f2.apply(123);
		System.out.println(result);
			Integer value = 123;	
		String.valueOf(value);
			
		
		
	}
	
}
