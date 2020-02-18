package concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
class RecursiveTaskCountWords extends RecursiveTask<Integer>{
	private static final int MAX_SIZE = 3;
	private List<String> list;
	
	
	public RecursiveTaskCountWords(List<String> list) {
		this.list = list;
	}


	@Override
	protected Integer compute() {
		System.out.printf("compute. Thread: %d %n", Thread.currentThread().getId());
		if(list.size() < MAX_SIZE) {
			int count = 0;
			for(String s : list) {
				if(s.length()==2) {
					count++;
				}
			}
			return count;
		}else {
			int indexMitte = list.size()/2;
			List<String> listA = list.subList(0, indexMitte);
			List<String> listB = list.subList(indexMitte, list.size());
			RecursiveTaskCountWords taskA = new RecursiveTaskCountWords(listA);
			RecursiveTaskCountWords taskB = new RecursiveTaskCountWords(listB);
			
			taskA.fork();
			Integer countB = taskB.compute();
			Integer countA = taskA.join();
		
			return countA + countB;
		}
		
	}
	
	
}
public class ForkJoin_RecursiveTask {

	public static void main(String[] args) {

		List<String> daten = Arrays.asList("a", "bb", "ccc","dd", "eee","a", "bb", "ccc","dd", "eee");
		
		ForkJoinPool pool = ForkJoinPool.commonPool();
		RecursiveTaskCountWords task = new RecursiveTaskCountWords(daten);
		Integer count = pool.invoke(task);
		System.out.println("Anzahl der String Länge 2:" + count);
		

	}

}
