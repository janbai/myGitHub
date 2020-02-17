package lernen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class B13_ExcutorService_invilke_Method {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<String>> tasks = new ArrayList<>();
		tasks.add(()-> "a");
		tasks.add(()-> "b");
		tasks.add(()-> "c");
				
		try {
			List<Future<String>> futures = service.invokeAll(tasks);
			futures.forEach(f-> System.out.println(f.isDone()));
			
			for (Future<String> future: futures) {
				System.out.println("result: " + future.get());
				
				
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.shutdown();
	}

}
