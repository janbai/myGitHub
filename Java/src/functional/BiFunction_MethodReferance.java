package functional;

import java.util.function.BiFunction;


class Auto{
	
}
class Besitzer{
	static Besitzer build(Auto a, Integer id) {
		return new Besitzer(a,id);
	}
	public Besitzer(Auto a, Integer id) {
		
	}
}
public class BiFunction_MethodReferance {

	public static void main(String[] args) {


		BiFunction<Auto, Integer, Besitzer> f1 = new BiFunction<Auto, Integer, Besitzer>(){

			@Override
			public Besitzer apply(Auto a, Integer id) {
				return new Besitzer(a, id);
			}
			
		};

		BiFunction<Auto, Integer, Besitzer> f2 = (a,id) -> new Besitzer(a,id);
		
	}

}
