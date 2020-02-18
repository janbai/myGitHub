package concurrency;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class ForkJoin {

	public static void main(String[] args) {
		ForkJoinPool pool1 = new ForkJoinPool();
		RecursiveAction task1 = new RecursiveAction() {
			
			@Override
			protected void compute() {
				System.out.println("compute der task1" );
				
			}
		};
		
		pool1.invoke(task1);
		
		Void result1 = pool1.invoke(task1);
		
		
		RecursiveTask<Integer> task2 = new RecursiveTask<>() {

			@Override
			protected Integer compute() {
				System.out.println("compute der task2");
				return 12;
			}
			
		};
		
		ForkJoinPool pool2 = new ForkJoinPool();
		Integer result2 = pool2.invoke(task2);
		System.out.println("result2: " + result2);
		
		
		
	}//end of main

}
