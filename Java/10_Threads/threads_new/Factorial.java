package threads_new;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {

char[] arr = {
				'a',
				'b',
				'c',
				'd'
			};

BigInteger arrayLen = BigInteger.valueOf(arr.length);
BigInteger countParm = factorial ( arrayLen);
	System.out.printf("%s%n", arr, arr.length);
	}

	private static BigInteger factorial(BigInteger bi) {
		if(bi.intValue()==1) {
			return bi;	
		}
		return bi.multiply((factorial( bi.subtract (BigInteger.ONE) )));
		
	}

}
