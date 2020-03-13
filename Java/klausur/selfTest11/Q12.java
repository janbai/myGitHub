package selfTest11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Q12 {

	public static void main(String[] args) {
		

	}
	private Integer executeTask(ExecutorService service,Callable<Integer> task) {
		try {
			Future<Integer> future = service.submit(task);
			return future.get();
			} catch (Exception e) {
			return null;
			}
	}
}
