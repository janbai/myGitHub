package practice;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Aufgabe_02 {

	public static void main(String[] args) {

			Predicate<? super Integer> predicate1 = x -> x != 5;
			Predicate<? super Integer> predicate2 = x -> x > 2;
			Stream.of(1, 2, 3, 0, 5, 0, 7)
			.filter(predicate1 )
			.filter(predicate2)
			.forEach(System.out::println);
		
			kleineAufgabe();
			
			
	}

	private static void kleineAufgabe() {
		String[] arr = {"mo", "di", "mi", "do", "fr"};
		
		Predicate<? super String> predicate;
		Stream.of(arr)
		.filter(s -> s.indexOf('m') != -1 )
		.forEach(System.out::println);
	}

}
