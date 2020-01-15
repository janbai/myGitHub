package examples;

import java.util.function.Consumer;

public class WDH04 {

	public static void main(String[] args) {


		Consumer<? extends Number> cExtNumber;
		
		Consumer<Number> cNumber = n-> System.out.println(n);

		cExtNumber = cNumber;
		cNumber.accept(22);
		
		//cExtNumber.accept(22);
		
		Consumer<? super Integer> cSuperInteger;
		
	
		cSuperInteger= cNumber;
		cSuperInteger.accept(22);

		Number m = 22;
		cSuperInteger.accept((Integer) m);
		
		
		
		Consumer<?> cExt;
		cExt =cNumber;
		
		//cExt.accept(22);
		
		Consumer<? super Integer> cA= null;
		Consumer<? extends Number> cB= null;
		//	cA = cB;
		//	cB = cA;
		
		Consumer<? extends Integer> cC = null;
		
		cB = cC;
		
		cB = new Consumer<Integer>() {public void accept(Integer x) {}};
	//	cC = cB;
		
		Consumer<?> cd = cA;
		
		
		
		
		
	}

}
