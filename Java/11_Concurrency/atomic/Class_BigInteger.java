package atomic;

import java.io.PrintStream;
import java.math.BigInteger;

public class Class_BigInteger {
	static final 	String fmt = "%-20s%s%n";
	public static void main(String[] args) {


		BigInteger bigInteger = BigInteger.valueOf(12);
		System.out.printf(fmt,"bigInt.signum():", bigInteger.signum());
		System.out.printf(fmt,"bigInt.abs():", bigInteger.abs());
		
		
		System.out.printf(fmt,"bigInt.abs():", bigInteger.abs());
		System.out.printf(fmt,"bigInt.TEN:", bigInteger.TEN);
		System.out.printf(fmt,"pow(1000):", bigInteger.pow(1000));
		System.out.printf(fmt,"bigInteger:", bigInteger);
		//factorial(bigInteger);
		System.out.printf(fmt,"factorial: "+ bigInteger + "!=", factorial(bigInteger));
		
	}
	static BigInteger factorial(BigInteger bigInteger) {
		if( bigInteger.intValue() == 1 ) {
			//System.out.print (bigInteger);
			return bigInteger;
		}
		//System.out.print (bigInteger+ " * ");
		return bigInteger.multiply( factorial(bigInteger.subtract(bigInteger.valueOf(1)) ));
	}
}
