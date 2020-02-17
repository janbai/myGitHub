package executor.service;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Creation_ExecutorService {
	
	//static AtomicInteger result1 = new AtomicInteger(); // zum Datenaustausch
	//static AtomicInteger result2 = new AtomicInteger(); // zum Datenaustausch
	public static void main(String[] args) {
ExecutorService service = Executors.newCachedThreadPool();
		
		
		
		service.execute(new Increment());
		
		Future<Integer> future = service.submit(new Decrement());
		service.execute(new Increment1());
		
		service.shutdown(); // async
		
		
		
		long timeout = 1;
		TimeUnit unit = TimeUnit.DAYS;
		
		try {
			service.awaitTermination(timeout, unit); // synchron: warten (maximal 1 Tag) bis alle registrierten Tasks fertig sind
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	static class Increment implements Runnable {
		AtomicInteger result1 = new AtomicInteger();
		
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				result1.incrementAndGet(); // <- nicht atomar, dürfte nicht parallel ausgeführt werden
				System.out.println("result1:" + result1 ); // garantiert 22
			}
		}
	}
	static class Increment1 implements Runnable {
		AtomicInteger result2 = new AtomicInteger();
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				result2.incrementAndGet(); // <- nicht atomar, dürfte nicht parallel ausgeführt werden
				System.out.println("result2:		" + result2); // garantiert 22
			}
		}
	}
	static class Decrement implements Callable {
		AtomicInteger result3 = new AtomicInteger();
		@Override
		public AtomicInteger call() {
			for (int i = 0; i < 100; i++) {
				result3.decrementAndGet(); // <- nicht atomar, dürfte nicht parallel ausgeführt werden
				System.out.println("result3: 			" + result3); // garantiert 22
			}
			
			return result3;
		}

	}
}
