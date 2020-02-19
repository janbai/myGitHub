package forkJoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/*
 * Aufgabe: Anzahl der Strings der Länge 2 ermitteln.
 * 
 * compute:
 * 
 * 		Falls die Datenmenge klein genug ist (Aufgabe ist einfach):
 * 				die Aufgabe lösen,
 * 		Sonst (Aufgabe ist zu schwer):
 * 				Datenmenge in zwei (oder mehrere) Teile teilen,
 * 				Zwei (oder mehrere) Sub-Tasks bilden,
 * 				Daten an die Sub-Tasks verteilen,
 * 				Sub-Tasks dem ForkJoinPool zum aktivieren übergeben 
 * 
 */
@SuppressWarnings("serial")
class RecursiveTaskCountWords extends RecursiveTask<Integer> {
	
	private static final int MAX_SIZE = 3;
	
	private List<String> list;
	
	public RecursiveTaskCountWords(List<String> list) {
		this.list = list;
	}

	protected Integer compute() {
		
		System.out.printf("compute. Thread: %d %n", Thread.currentThread().getId());
		
		if(list.size() < MAX_SIZE) {
			int count = 0;
			
			for(String s : list) {
				if(s.length() == 2) {
					count++;
				}
			}
			
			return count;
		} else {

			int indexMitte = list.size() / 2;
			
			List<String> listA = list.subList(0, indexMitte);
			List<String> listB = list.subList(indexMitte, list.size());
			
			RecursiveTaskCountWords taskA = new RecursiveTaskCountWords(listA);
			RecursiveTaskCountWords taskB = new RecursiveTaskCountWords(listB);

//			Sinnlos: (beide compute-Aufrufe erfolgen im selben Thread) 			
//			Integer countA = taskA.compute();
//			Integer countB = taskB.compute();

			taskA.fork(); // aktiviert die taskA (startet compute) im anderen Thread
			
			Integer countB = taskB.compute();
			
			Integer countA = taskA.join(); // blockiert den aktiellen Thread, bis taskA fertig ist.
						  					// Liefert das Ergebnis der compute von taskA zurück.
			
			return countA + countB;
		}
	}
}

public class B16_ForkJoin_RecursiveTask {

	public static void main(String[] args) {

		List<String> daten = Arrays.asList("a", "bb", "ccc", "dd", "e", "ff", "g", "hh");

		
		ForkJoinPool pool = ForkJoinPool.commonPool();

		RecursiveTaskCountWords task = new RecursiveTaskCountWords(daten);
		
		Integer count = pool.invoke(task);
		
		System.out.println("Anzahl der Strings Länge 2: " + count);
		
	}

}
