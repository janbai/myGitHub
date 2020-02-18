package concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
class RecursiveActionZahlenBereich extends RecursiveAction{

	public RecursiveActionZahlenBereich(Integer[] daten, int i, int length) {
		

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}
	
}
public class KleineAufgabe_ForkJoin {

	public static void main(String[] args) {
Integer[] daten = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		
		ForkJoinPool pool = new ForkJoinPool();
		RecursiveAction task = new RecursiveActionZahlenBereich(daten, 0, daten.length);
		
		pool.invoke(task);
		System.out.println("Array in main:" + Arrays.toString(daten));

	}

}
