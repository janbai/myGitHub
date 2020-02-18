package concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

@SuppressWarnings("serial")
class RecursiveActionReplaceNull extends RecursiveAction{

	private static final int MAX_ELEMENTS=3;
	
	private String[] daten;
	private int indexFrom, indexTo;
	
	public RecursiveActionReplaceNull(String[] daten, int indexFrom, int indexTo) {
		this.daten = daten;
		this.indexFrom = indexFrom;
		this.indexTo = indexTo;
	}

	@Override
	protected void compute() {
		if(indexTo - indexFrom <= MAX_ELEMENTS) {
			System.out.printf("Action für den Bereich: %2 bis %d, Thread %d %n", indexFrom, indexTo, Thread.currentThread().getId());
			for (int i = indexFrom; i < indexTo; i++) {
				if(daten[i]== null) {
					daten[i] = "nicht besetzt";
				}
			}
		}else {
			System.out.println("Aufgabe ist zu komplex!");
			int indexMitte = (indexTo - indexFrom)/2 +indexFrom;
	
			System.out.printf("Action A und B vorbereitet für den Bereich: %d / %d / %d, Thread %d %n", indexFrom, indexMitte, indexTo, Thread.currentThread().getId());
			RecursiveAction taskA = new RecursiveActionReplaceNull(daten, indexFrom, indexMitte);
			RecursiveAction taskB = new RecursiveActionReplaceNull(daten, indexMitte, indexTo);
			invokeAll(taskA, taskB);		
		}
		
	}
	
}
public class ForkJoin_RecursiveAction {

	public static void main(String[] args) {

		String[] daten = {"0", null, "2", null, "4","5", "6", null, "8", null, "9","10"};
		
		ForkJoinPool pool1 = new ForkJoinPool();
		RecursiveAction task = new RecursiveActionReplaceNull(daten, 0, daten.length);
		
		pool1.invoke(task);
		System.out.println("Array in main:" + Arrays.deepToString(daten));
		
	}

}
