package aufgaben;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

import thread.anfang.MyThreadUtils;

public class AufgabePermutation {

	public static void main(String[] args) {

		char[] arr = { 'a', 
				'b', 
				'c',
				'd',
				'e'
				
				};
	
		/*
		 * Bitte die Methode 'factorial' realisieren.
		 * 
		 * Berechnet: 1*2*3*4*...*LängeDesArrays
		 */
		BigInteger arrayLen = BigInteger.valueOf(arr.length);
		BigInteger countPerm = factorial( arrayLen );
		int capacity = 100;
		ArrayBlockingQueue<String> dataQueue = new ArrayBlockingQueue<String>(capacity );
	
		Runnable taskBuildData = () ->{
			try {
				permutate(dataQueue,arr,arr.length);
			} catch (InterruptedException e) {
				System.err.println(e.toString());
			}
			
		};
		Thread threadBuildData = new Thread(taskBuildData);
		threadBuildData.start();
		
		Runnable taskPrintData = () ->{
			try {
				while(true) { 
					String data = dataQueue.take();
					System.out.print(data);}	
			} catch (InterruptedException e2) {
				System.err.println("The task is completed!");
			}
		};
		
		Thread threadPrintData = new Thread(taskPrintData);
		threadPrintData.start();
		
		try {
			threadBuildData.join();
			MyThreadUtils.pause(1000);
			threadPrintData.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Array, Länge = %d %n", arr.length);
		System.out.printf("Permutationen: %s %n", countPerm);
		
	}//end of main
	
	static BigInteger factorial(BigInteger bi) {
		if( bi.intValue() == 1 ) {
			return bi;
		}
		
		return bi.multiply( factorial(bi.subtract(BigInteger.ONE)) );
	}

	/*
	 * https://en.wikipedia.org/wiki/Heap%27s_algorithm
	 */
	public static void permutate(ArrayBlockingQueue<String> dataQueue, char[] arr, int pointer) throws InterruptedException {
	    if(pointer==1) {
	       // System.out.printf("%s %n", Arrays.toString(arr));
	        String data = String.format("%s%n", Arrays.toString(arr));
	        dataQueue.put(data);
	    	return;
	    }
	    
		for (int i = 0; i < pointer-1; i++) {
		   permutate(dataQueue, arr, pointer-1);
		    
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
		
		permutate(dataQueue,arr, pointer-1);
	}
	
	
}
