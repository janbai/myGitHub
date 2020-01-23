package practice;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Aufgabe_03 {

	public static void main(String[] args) {

long max = 3;
long n = 3;
		UnaryOperator<Integer> op =  x -> x + 1;
		Stream.iterate(1,op)
				.skip(n)
				.limit(max)
				.forEach(System.out::println);
		
		
		
		

	}

}
