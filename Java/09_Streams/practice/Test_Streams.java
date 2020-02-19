package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Test_Streams {

	public static void main(String[] args) {

		Collection<Integer> coll = Arrays.asList(7, 8, 9);
		coll.parallelStream().forEach(x-> System.out.print(x + " "));
		System.out.println();

		Stream<Integer> stream = coll.stream();
		
		stream.parallel()
					.peek(x-> System.out.print(x + " "))
					.sequential()
					.forEach(x-> System.out.print(x + " "));
		System.out.println();
		System.out.println("-------------");
		
	exam();	

		

	}//end of main

	static void exam() {
	List<Integer> daten = Arrays.asList(12, 14, 16, 18);
	Integer result = daten.parallelStream()
			.filter(x-> {
				System.out.println(x);
				return true;})
			.findFirst().get();
	System.out.println("result:" + result);
}
}
