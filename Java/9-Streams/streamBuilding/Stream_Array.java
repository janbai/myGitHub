package streamBuilding;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Stream_Array {

	public static void main(String[] args) {


		Integer[] myNums = { 1, 2, 3 };
		Stream<Integer> myStream = Arrays.stream(myNums);
		
		//System.out.println(myStream.count());//stream closed
		System.out.println(myStream);
	
		myStream.forEach(n -> System.out.print(n + " "));//stream closed
		System.out.println();
		//myStream.forEach(System.out::println); //IllegalStateException: stream has already been operated upon or closed
		
		String[] a1 = { "mo", "di" };
		String[] a2 = { "mi", "do", "fr" };
		
		Stream<String[]> arrStr = Stream.of(a1, a2);
		
		Consumer<? super String[]> action = array -> {
			for (String s : array) {
				System.out.print(s + " ");
			}
			System.out.println();
		};
		arrStr.forEach(action );
		
		System.out.println("using concat: ");
		Stream<String> arrStr1 = Stream.concat(Arrays.stream(a1), Arrays.stream(a2));
		
		arrStr1.forEach(System.out::println);

		
	}

}
