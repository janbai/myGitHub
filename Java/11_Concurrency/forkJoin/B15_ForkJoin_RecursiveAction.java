package forkJoin;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/*
 * Aufgabe: mit RecursiveAction die nulls im Array durch "nicht besetzt" ersetzen
 * 
 * compute:
 * 
 * 		Falls die Datenmenge klein genug ist (Aufgabe ist einfach):
 * 				die Aufgabe lösen,
 * 		Sonst (Aufgabe ist zu schwer):
 * 				Datenmenge in zwei (oder mehrere) Teile teilen,
 * 				Zwei (oder mehrere) Sub-Tasks bilden,
 * 				Daten an die Sub-Tasks verteilen,
 * 				Sub-Tasks dem ForkJoinPool zum aktivieren übergeben (z.B. mit invokeAll)
 * 		
 */
@SuppressWarnings("serial")
class RecursiveActionReplaceNull extends RecursiveAction {
	
	private static final int MAX_ELEMENTS = 3;
	
	private String[] daten;
	private int indexFrom, indexTo;

	public RecursiveActionReplaceNull(String[] daten, int indexFrom, int indexTo) {
		this.daten = daten;
		this.indexFrom = indexFrom;
		this.indexTo = indexTo;
	}

	@Override
	protected void compute() {

		if( indexTo - indexFrom <= MAX_ELEMENTS ) {
			System.out.printf("Action ausgeführt für den Bereich: %d bis %d, Thread: %d %n", indexFrom, indexTo, Thread.currentThread().getId());

			for (int i = indexFrom; i < indexTo; i++) {
				if(daten[i] == null) {
					daten[i] = "nicht besetzt";
				}
			}
		} else {
			int indexMitte = (indexTo - indexFrom) / 2 + indexFrom;  // müsste auch gehen: (indexFrom + indexTo) / 2
			
//			int indexFromA = indexFrom;
//			int indexToA = indexMitte;
//
//			int indexFromB = indexMitte;
//			int indexToB = indexTo;
			
			
			System.out.printf("Actions A und B vorbereitet für die Bereiche: %d / %d / %d, Thread: %d %n", 
					indexFrom, indexMitte, indexTo, Thread.currentThread().getId());
			
			RecursiveAction taskA = new RecursiveActionReplaceNull(daten, indexFrom, indexMitte);
			RecursiveAction taskB = new RecursiveActionReplaceNull(daten, indexMitte, indexTo);
			
			invokeAll(taskA, taskB); // taskA im aktuellen Thread, taskB im anderen Thread
		}
	}
}

public class B15_ForkJoin_RecursiveAction {

	public static void main(String[] args) {

		String[] daten = {
			"0",
			null,
			"2",
			null,
			"4",
			"5",
			"6",
		};
		
		RecursiveAction task = new RecursiveActionReplaceNull(daten, 0, daten.length);		
		
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);

		
		System.out.println("Array in main: " + Arrays.toString(daten));
	}

}
