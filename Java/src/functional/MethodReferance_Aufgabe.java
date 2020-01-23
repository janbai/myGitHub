package functional;

import java.util.function.*;
public class MethodReferance_Aufgabe {

	static class Values{
		
		static String get(Values u, Integer t) {
			return "" + t;
		}
		
		Values(){}
		Values(Values v){}
	}
	
	public static void main(String[] args) {

		Supplier<Values> s1 = Values::new;
		
		Consumer<Values> c1 = Values::new;


		Consumer<Values> c2 = new Consumer<Values>() {

			@Override
			public void accept(Values t) {
				new Values(t);
				
			}
			
		};
		
		
		BiFunction<Values, Integer, String> f1 = Values::get;
		
	}

}
