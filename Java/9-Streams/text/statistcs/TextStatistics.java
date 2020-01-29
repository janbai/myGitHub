package text.statistcs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;



public class TextStatistics 
{

private final String text;

public TextStatistics(String text) 				{ this.text = text;}
	
	public int countChar() 				   		{ return text.length();}
	
	public int countSpecialChar() 				{ return (int) text.chars().filter(ch -> !Character.isLetterOrDigit(ch)).count();}
	
	public int countLetter() 					{ return (int) text.chars().filter(Character::isLetter).count();}
	
//	public int countSpaceChar() 				{ return (int) text.chars().filter(Character::isSpaceChar).count();}
	
	public int countAlphebaticChar() 			{ return (int) text.chars().filter(Character::isAlphabetic).count();}
	
	public Optional<String> findMaxWord()		{ return Arrays.stream(text.split(" ")).max(Comparator.naturalOrder());}
	
	public Optional<String> findLongestWord()	{ return Arrays.stream(text.split(" ")).max(Comparator.comparingInt(String::length));}
	
}

class CombinedTextStatistics extends TextStatistics {
	
	private TextStatistics statisticsA, statisticsB;
	
	public CombinedTextStatistics(TextStatistics statisticsA, TextStatistics statisticsB) {
		super("");
		this.statisticsA = statisticsA;
		this.statisticsB = statisticsB;
	}

	@Override
	public int countChar() 			{ return statisticsA.countChar() + statisticsB.countChar();}

	@Override
	public int countSpecialChar() 	{ return statisticsA.countSpecialChar() + statisticsB.countSpecialChar();}

	@Override
	public int countLetter() 		{ return statisticsA.countLetter() + statisticsB.countLetter();}

	@Override
	public Optional<String> findMaxWord() {
		String str1 = statisticsA.findMaxWord().get();
		String str2 = statisticsB.findMaxWord().get();
		
									return str1.compareTo(str2) > 0 ? Optional.of(str1) : Optional.of(str2);}

	@Override
	public Optional<String> findLongestWord() {
		String str1 = statisticsA.findLongestWord().get();
		String str2 = statisticsB.findLongestWord().get();
		
									return str1.length() > str2.length() ? Optional.of(str1) : Optional.of(str2);}
}
