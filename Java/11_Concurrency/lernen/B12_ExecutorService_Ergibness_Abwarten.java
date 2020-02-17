package lernen;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class B12_ExecutorService_Ergibness_Abwarten {

	public static void main(String[] args) {


		//	v1_awaitTermination();
		//	v2_future_submit_get();
		//	v3_Runnable_submit_Future_get();
		v4_Callable_Future_get();
			
		
	}

	private static void v4_Callable_Future_get() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Callable<Integer> task = () -> {
			System.out.println("run");
			return 12345;
		};
		
		Future<Integer> future = service.submit(task);
		
		
		
		try {
			Integer resultFuture = future.get();
			System.out.println("result from future: " + resultFuture );
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	//	MyThreadUtils.pause(100);
				
		
		
		service.shutdown();
		
	}

	private static void v3_Runnable_submit_Future_get() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		AtomicInteger result = new AtomicInteger();
		Runnable task = () -> {
			System.out.println("run");
			result.set(330+3);
		};
		
		Future<AtomicInteger> future = service.submit(task,result);
		
		
		
		try {
			AtomicInteger resultFuture = future.get();
			System.out.println("result from future: " + resultFuture );
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	//	MyThreadUtils.pause(100);
				
		
		
		service.shutdown();
	}

	private static void v2_future_submit_get() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		AtomicInteger result = new AtomicInteger();
		Runnable task = () -> {
			System.out.println("run");
			result.set(110);
		};
		
		Future<?> future = service.submit(task);
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	//	MyThreadUtils.pause(100);
				
		
		System.out.println("result: " + result );
		service.shutdown();
	}

	private static void v1_awaitTermination() {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		AtomicInteger result = new AtomicInteger();
		Runnable task = () -> {
			System.out.println("run");
			result.set(22);
		};
		service.execute(task);
		
		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("result: " + result);
		
		
	}

}
