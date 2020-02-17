package aufgaben;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Aufgabe_Reduce_TextStatistics {
private static class CombinedTextStatistics extends TextStatistics{

	private TextStatistics statsticsA, statsticsB;

	
	public CombinedTextStatistics(String text, TextStatistics statsticsA, TextStatistics statsticsB) {
		super("");
		this.statsticsA = statsticsA;
		this.statsticsB = statsticsB;
	}

	@Override
	public int getCountChars() {
		// TODO Auto-generated method stub
		return super.getCountChars();
	}

	@Override
	public int getCountSpecialChars() {
		// TODO Auto-generated method stub
		return super.getCountSpecialChars();
	}

	@Override
	public int getCountLetters() {
		// TODO Auto-generated method stub
		return super.getCountLetters();
	}

	@Override
	public Optional<String> getMaxWord() {
		// TODO Auto-generated method stub
		return super.getMaxWord();
	}

	@Override
	public Optional<String> getLongestWord() {
		// TODO Auto-generated method stub
		return super.getLongestWord();
	}
	
	
}
	public static void main(String[] args) {

		TextStatistics stats = new TextStatistics("Hallo Welt");
		System.out.println("Count Chars: " + stats.getCountChars());
		System.out.println("Count special Chars. " + stats.getCountSpecialChars());
		System.out.println("Count letters: " + stats.getCountLetters());
		System.out.println("Count max word: " + stats.getMaxWord());
		System.out.println("Count longest word: " + stats.getLongestWord());
		
		String[] input = {
				"3 Welt",
				"1 2 Hallo"
		};
		
		
	
	}

}
