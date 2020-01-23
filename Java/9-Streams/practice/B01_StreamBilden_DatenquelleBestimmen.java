package practice;


import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class B01_StreamBilden_DatenquelleBestimmen {
	
	public static void main(String[] args) {
	mitMethodenVonStream();
//		mitMethodenVonArrays();
		//mitMethodenVonCollection();
		
		// weitere Möglichkeiten kommen dazu
	}
	
	public static void mitMethodenVonCollection() {
		
		/*
		 * Stream<E> stream()
		 */
		Collection<Integer> coll = Arrays.asList(1, 2, 3, 4);
		
		coll.stream().forEach(System.out::println);
		
	}
	
	public static void mitMethodenVonArrays() {
		Integer[] array = { 2, 4, 6, 8 }; 
		
		/*
		 * <T> Stream<T> stream(T[] array)
		 */
		System.out.println("*** stream(T[]): ");
		Arrays.stream(array)
				.forEach(System.out::println); // 2 4 6 8

		
		/*
		 * <T> Stream<T> stream(T[] array, int von, int bis)
		 */
		System.out.println("*** stream(T[], int, int): ");
		
		int startInclusive = 1;
		int endExclusive = 4;
		Arrays.stream(array, startInclusive, endExclusive)
				.forEach(System.out::println); // 4 6 8
		
	}
	
	
	public static void mitMethodenVonStream() {

		/*
		 * Stream empty()
		 */
		Stream.empty()
				.forEach(System.out::println);
		
		/*
		 * <T> Stream<T> generate(Supplier<? extends T> s) 
		 */
		System.out.println("*** generate: ");
		
		Supplier<Integer> s = () -> 2;
		Stream.generate(s)
				.limit(5) // <- intermediate operation
				.forEach(System.out::println);

		/*
		 * <T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
		 */
		System.out.println("*** iterate: ");
		
		Integer seed = 1;
		UnaryOperator<Integer> operator = i -> i+1; 
		
		Stream.iterate(seed, operator)
				.limit(3)
				.forEach(System.out::println); // 1 2 3
		
		/*
		 * <T> Stream<T> of(T... values)
		 */
		System.out.println("*** of(T... values): ");
		
		Integer[] arrInt = { 2, 4, 6, 8 };
		
		Stream.of(arrInt)
				.forEach(System.out::println);
		
		System.out.println("nochmal: ");
		
		Stream.<Integer>of(arrInt)
			.forEach(System.out::println);
		/*
		 * <T> Stream<T> of(T t)
		 */
		System.out.println("*** of(T value): ");
		
		Stream.of(77)
				.forEach(System.out::println); // 77
		
		System.out.println("nochmal: ");
		
		Stream.<Integer[]>of(arrInt)
			.forEach(System.out::println); // [Ljava.lang.Integer;@60215eee
		
		Stream<Integer> s1 =Stream.of(1, 2, 3);
		Stream<Integer> s2 = Stream.of(4, 5);
		System.out.println("----------------");
		Stream.concat(s1, s2).forEach(System.out::println);
		
	} // 


}

