package lernen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class KleineAufgabe_Future {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


Random random = new Random();
		
		ExecutorService service = Executors.newCachedThreadPool();
		List<Future<Integer>> futures = new ArrayList<>();
		Integer summe = 0;
		for (int i = 0; i < 100; i++) {
			Callable<Integer> task =() -> 1;//random.nextInt(5)+1;
			
			Future<Integer> future = service.submit(task);
			futures.add(future);
		
			summe += future.get();
				System.out.println("Summe: " + summe);
			 
		}
		
		
		
		service.shutdown();
		
	}

}
