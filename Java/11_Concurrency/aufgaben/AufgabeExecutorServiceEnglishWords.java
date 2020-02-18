package aufgaben;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;



class TaskCountWords implements Callable<Integer> {
	private List<String> words;
	private Predicate<String> predicate;
	
	public TaskCountWords(List<String> words, Predicate<String> predicate) {
		this.words = words;
		this.predicate = predicate;
	}
	
	@Override
	public Integer call() throws Exception {
		return (int)words.stream().filter(predicate).count();
	}
}

public class AufgabeExecutorServiceEnglishWords {

	public static void main(String[] args) {
//		a2a3a4();
		a5();
		a6();
	}
	
	public static void a6() {
		System.out.println("*** A6");
		
		List<String> words = ResourceLoader.loadEnglishWords();
		System.out.println("words: " + words.size()); // 58110
		
		final int countTasks = 50;
		final int subListSize = words.size() / countTasks;
		
		List<Callable<Integer>> tasks = new ArrayList<>();
		
		for (int i = 0, von = 0; i < countTasks; i++, von+=subListSize) {
			System.out.print("* Task " + i);
			int bis = von + subListSize;
			// unschön, muss noch geändert werden für die Letzte Task:
			if(i==countTasks-1) {
				bis = words.size();
			}
			
			
			System.out.println(" " + von + " .. " + bis);
			List<String> subList = words.subList(von, bis); 
			Callable<Integer> task = new TaskCountWords( subList, w -> w.length()==5 );
			tasks.add(task);
		}
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		try {
			List<Future<Integer>> futures = service.invokeAll(tasks);
			
			int summe = 0;
			for (Future<Integer> future : futures) {
				summe += future.get();
			}
			
			System.out.println("Wörter mit Länge 5: " + summe);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		service.shutdown();
		
	}
		
	public static void a5() {
		System.out.println("*** A5");
		
		List<String> words = ResourceLoader.loadEnglishWords();
		System.out.println("words: " + words.size()); // 58110
		
		Callable<Long> taskCount = () -> words.stream().filter(w -> w.length()==5).count(); 
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		try {
			long count = service.submit(taskCount).get();
			System.out.println("Wörter mit Länge 5: " + count);
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	}
	
	public static void a2a3a4() {
		System.out.println("*** A2, A3, A4");

		List<String> words = ResourceLoader.loadEnglishWords();
		System.out.println("words: " + words.size()); // 58110
		
		AtomicInteger result1 = new AtomicInteger();
		Runnable task1 = () -> {
			int count = 0;
			for (String w : words) {
				if(w.indexOf('t')!=-1) {
					count++;
				}
			}
			result1.set(count);
		};
		
		Callable<Integer> task2 = () -> {
			int count = 0;
			for (String w : words) {
				if(w.contains("oo")) {
					count++;
				}
			}
			return count;
		};
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Future<?> future1 = service.submit(task1);	
		Future<Integer> future2 = service.submit(task2);
		
		try {
			future1.get();
			System.out.println("Wörter mit t: " + result1);
			
			System.out.println("Wörter mit oo: " + future2.get());
			
		} catch (ExecutionException | InterruptedException e) {
			e.printStackTrace();
		}
		
		service.shutdown();
	} 
	
//	static void a2(List<String> words) {
//		System.out.println("*** A2");
//	}

}
