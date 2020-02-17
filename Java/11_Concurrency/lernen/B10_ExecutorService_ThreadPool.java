package lernen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class B10_ExecutorService_ThreadPool {

	public static void main(String[] args) {

		System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory());
		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
		Runtime.getRuntime().gc();
		
       List<Runnable> listTask = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			Runnable task = ()-> System.out.println("my task in thread: " + Thread.currentThread().getId());
			listTask.add(task);
		}
		
		int nThreads = 1000;
		
		//ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newFixedThreadPool(nThreads );
		//ExecutorService service = Executors.
		for (Runnable task : listTask) {
			service.execute(task);
			MyThreadUtils.pause(0);
		}
				
		service.shutdown();

		
		
		

	}//end of main

}
