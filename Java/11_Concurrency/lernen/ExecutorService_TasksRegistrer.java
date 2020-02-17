package lernen;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService_TasksRegistrer {

	public static void main(String[] args) {


		ExecutorService service = Executors.newCachedThreadPool();
		
		Runnable task1 =() -> System.out.println("run 1");
		service.execute(task1);
		
		Runnable task2 = () -> System.out.println("run 2");
		Future<?> future2 = service.submit(task2);
		Runnable task3 = () -> System.out.println("run 3");
		Integer result3 = 3;
		Future<Integer> future3 = service.submit(task3, result3);
		System.out.println("result3: " + result3);
		Callable<Integer> task4 =() -> {
			System.out.println("call");
			return 1 + 3;
		};
		service.submit(task4);
		
		Future<Integer> future4 = service.submit(task4);
		try {
			Integer result4 = future4.get();
			
			System.out.println("result4: " + result4);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.shutdown();

	}

}
