package draft_01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Worker implements Callable<String> {
	public String call() throws Exception {
		return "work ";
	}
}


public class Q21 {

	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(4); 
		Future<String> f = service.submit(new Worker());
		String str = f.get().toString();
		System.out.println(str);
	}


}
