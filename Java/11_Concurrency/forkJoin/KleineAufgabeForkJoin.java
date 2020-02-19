package forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.Stream;

@SuppressWarnings("serial")
class PrintBounds extends RecursiveAction {
	private static final int MAX_SIZE = 3;
	
	private int lowerBound, upperBound;
	
	public PrintBounds(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	@Override
	protected void compute() {
		
		if(upperBound - lowerBound < MAX_SIZE) {
			System.out.println("Unterbereich " + lowerBound + " .. " + upperBound);
		} else {
		
			int center = (lowerBound + upperBound) / 2;

			invokeAll( new PrintBounds(lowerBound, center),
					new PrintBounds(center+1, upperBound) );
		}
	}
}

public class KleineAufgabeForkJoin {

	public static void main(String[] args) {

		// Gegeben ist Zahlenbereich a .. b 
		// Teilen Sie den Zahlenbereich in Unterbereiche. In jedem Unterbereich darf es maximal 3 Zahlen geben.
		// Bitte alle Unterbereiche ausgeben.
		// Bitte ForkJoin-Framework verwenden.
		
		/*
		 * Gesamtbereich. a = 1, b = 9
		 * 
		 * 1 .. 9
		 * 
		 * Mögliche Ausgaben:
		 * 	Unterbereich 1 .. 3
		 * 	Unterbereich 4 .. 6
		 * 	Unterbereich 7 .. 9
		 * 
		 * Ausgaben dürfen sich untescheiden 
		 * (maximal 3 Zahlen gehören zu einem Unterbereich, es kann auch weniger sein)
		 * 
		 */
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new PrintBounds(1, 9));

	}

}
