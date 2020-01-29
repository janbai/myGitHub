package aufgaben;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Aufgabe_Stream_reduce {

	
	public static void main(String[] args) {

		String[] items = { "aa", "bbb", "cccc", "ddddd" };
		
		BinaryOperator<Integer> accumulator = (x1 , x2) -> x1+x2;
		Integer identity = 0;
		Integer countChart = Arrays.stream(items)
				.map(String::length)
				.reduce(identity, accumulator);
		System.out.println(countChart);
		
		BinaryOperator<Integer> combiner = accumulator;
		BiFunction<Integer, String, Integer> accumulator1 = (count, str) -> count + str.length() ;
		Integer countChart1 = Arrays.stream(items)
				.reduce(identity, accumulator1 , combiner);
		System.out.println(countChart1);
		
		
		
	}

}
