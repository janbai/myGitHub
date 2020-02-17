package examples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WDH01 {

	public static void main(String[] args) {


		Predicate<?> v1 = x -> true;
		Function<Integer, Double> v2 = (Integer x ) ->222.00;
		Supplier<Double> v3 = () -> 22.00;
		Consumer<?> v4 = x -> {};
		
		
		String str = "bla";
		
		Consumer<String> c = x -> x .concat("bla");
		
		Function<String, Consumer<String>> f1 = s-> c;
		Function<String, Consumer<String>> f2 = s ->  x -> x .concat("bla");
	
		Function<String, Consumer<String>> f5 = new Function<String, Consumer<String>> (){
				public Consumer<String> apply(String s) {
					return new Consumer<String> () {
						public void accept(String x) {
						x.concat(s);
					}
				};
			}
		};
		
		
		
		
		

	}// End of main

}
