package text.statistcs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;




public class ReduceTextStatistcs {

	public static void main(String[] args) {
		TextStatistics stats = new TextStatistics("Hallo Welt ! 2020");
		
		System.out.println("count chars: " + stats.countChar()); // 17
		System.out.println("count special chars: " + stats.countSpecialChar()); // 4
		System.out.println("count letters: " + stats.countLetter()); // 9
	//	System.out.println("count space chars: " + stats.countSpaceChar()); // 3
	//	System.out.println("count alphebatic chars: " + stats.countAlphebaticChar()); // 9
		System.out.println("longest word: " + stats.findLongestWord().get()); // Hallo
		System.out.println("max word: " + stats.findMaxWord().get()); // Welt
		
		
		System.out.println("---------------------------");
		String[] input = {
				"3 Welt",
				"1 2 Hallo"
			};
		
		TextStatistics idt = new TextStatistics("");
		
		BiFunction<TextStatistics, String, TextStatistics> acc = (statistics, str) -> {
			TextStatistics newStatistics = new TextStatistics(str);
			return new CombinedTextStatistics(statistics, newStatistics);
		};
		
		BinaryOperator<TextStatistics> cmb = CombinedTextStatistics::new;
		
		stats = Arrays.stream(input).reduce(idt, acc, cmb);
		
		System.out.println("count chars: " + stats.countChar()); // 15
		System.out.println("count special chars: " + stats.countSpecialChar()); // 3
		System.out.println("count letters: " + stats.countLetter()); // 9
		System.out.println("longest word: " + stats.findLongestWord().get()); // Hallo
		System.out.println("max word: " + stats.findMaxWord().get()); // Welt
		
		
		
	}
	
}
