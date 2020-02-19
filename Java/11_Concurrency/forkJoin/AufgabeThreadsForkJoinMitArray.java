package forkJoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class AufgabeThreadsForkJoinMitArray {
	
	static class ReplaceNegative extends RecursiveAction {
		private static final int MAX_ELEMENTS = 3;
		
		private int[] array;
		private int indexFrom, indexTo;
		
		public ReplaceNegative(int[] array, int indexFrom, int indexTo) {
			this.array = array;
			this.indexFrom = indexFrom;
			this.indexTo = indexTo;
		}
		
		@Override
		protected void compute() {
			if( indexTo-indexFrom <= MAX_ELEMENTS ) {
				for (int i = indexFrom; i < indexTo; i++) {
					if(array[i]<0) {
						array[i] = 0;
					}
				}
			} else {
				int mitte = (indexFrom + indexTo) / 2;
				
				invokeAll(new ReplaceNegative(array, indexFrom, mitte),
						new ReplaceNegative(array, mitte, indexTo));
			}
		}
	}
	
	
	static class CountNegative extends RecursiveTask<Integer> {
		
		private static final int MAX_ELEMENTS = 3;
		
		private int[] array;
		private int indexFrom, indexTo;
		
		public CountNegative(int[] array, int indexFrom, int indexTo) {
			this.array = array;
			this.indexFrom = indexFrom;
			this.indexTo = indexTo;
		}
		
		@Override
		protected Integer compute() {
			if( indexTo-indexFrom<=MAX_ELEMENTS ) {
				
				int count = 0;
				for (int i = indexFrom; i < indexTo; i++) {
					if(array[i]<0) {
						count++;
					}
				}
				return count;
				
			} else {
				int mitte = (indexFrom + indexTo) / 2;
				
				CountNegative taskA = new CountNegative(array, indexFrom, mitte);
				CountNegative taskB = new CountNegative(array, mitte, indexTo);
				
				taskA.fork();
				
				return taskB.compute() + taskA.join();
			}
		}
	}

	public static void main(String[] args) {

		Random random = new Random();
		IntSupplier intSupplier = () -> {
			return random.nextInt(101) - 50;
		};
		
		int[] array = IntStream.generate(intSupplier).limit(10).toArray();
		System.out.println("1. " + Arrays.toString(array));
		
		System.out.println("*** A1");
		RecursiveAction replaceNegative = new ReplaceNegative(array, 0, array.length); 

		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(replaceNegative);
		
		System.out.println("2. " + Arrays.toString(array));
		
		System.out.println("*** A2");
		array = IntStream.generate(intSupplier).limit(10).toArray();
		System.out.println("1. " + Arrays.toString(array));
		
		RecursiveTask<Integer> countNegative = new CountNegative(array, 0, array.length);
		Integer count = pool.invoke(countNegative);
		System.out.println("Anzahl negativer Werte: " + count);
	}

}
