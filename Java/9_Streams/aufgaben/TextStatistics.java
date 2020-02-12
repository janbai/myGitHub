package aufgaben;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class TextStatistics {
	private final String text;
	public TextStatistics(String text) {
		
		this.text = text;
	}
	
	public int getCountChars() {
		return text.length();
	}
	
	public int getCountSpecialChars() {	
		return (int)text.chars().filter( ch -> !Character.isLetterOrDigit(ch) ).count();
	}
	
	public int getCountLetters() {
		return (int) text.chars().filter( Character::isLetter).count();
	}
	
	public Optional<String> getMaxWord() {	
		return Arrays.stream(text.split(" ") ).max(Comparator.naturalOrder());
	}
	
	public Optional<String> getLongestWord() {
		return Arrays.stream(text.split(" ") ).max(Comparator.comparingInt(String::length));
	}
}
