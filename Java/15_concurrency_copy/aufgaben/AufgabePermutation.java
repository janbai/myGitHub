package aufgaben;

import java.math.BigInteger;
import java.util.Arrays;

public class AufgabePermutation {

	public static void main(String[] args) {

		char[] arr = { 'a', 
				'b', 
				'c',
				'd','e'
				
				};
	
		/*
		 * Bitte die Methode 'factorial' realisieren.
		 * 
		 * Berechnet: 1*2*3*4*...*LängeDesArrays
		 */
		BigInteger arrayLen = BigInteger.valueOf(arr.length);
		BigInteger countPerm = factorial( arrayLen );
		
		permutate(arr, arr.length);
		
		System.out.printf("Array, Länge = %d %n", arr.length);
		System.out.printf("Permutationen: %s %n", countPerm);
		
	}
	
	static BigInteger factorial(BigInteger bi) {
		if( bi.intValue() == 1 ) {
			return bi;
		}
		
		return bi.multiply( factorial(bi.subtract(BigInteger.ONE)) );
	}

	/*
	 * https://en.wikipedia.org/wiki/Heap%27s_algorithm
	 */
	public static void permutate(char[] arr, int pointer) {
	    if(pointer==1) {
	        System.out.printf("%s %n", Arrays.toString(arr));
	        return;
	    }
	    
		for (int i = 0; i < pointer-1; i++) {
		   permutate(arr, pointer-1);
		    
			if(pointer%2==0) {
			    char tmp = arr[pointer-1];
			    arr[pointer-1] = arr[i];
			    arr[i] = tmp;
			} else {
			    char tmp = arr[pointer-1];
			    arr[pointer-1] = arr[0];
			    arr[0] = tmp;
			}
		}
		
		permutate(arr, pointer-1);
	}
	
	
}
