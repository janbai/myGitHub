package practice;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Stream_Map {

	public static void main(String[] args) {


		Function<Integer, String> mapper = i-> "<" +i + ">";
		Consumer<String> c = System.out::println;
		Stream.of(1, 2, 3)
		.map(mapper)
		.forEach(c);

		kleineAufgabe();

	}

	private static void kleineAufgabe() {
		System.out.println("************Aufgabe");
		class Person{
			String name;

			public Person(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return "Person:" + name;
			}
			
		}
		String[] namen = {
				"Peter", "Paul", "Mary"
		};
		
		Arrays.stream(namen).map(name-> new Person(name)).forEach(System.out::println);

		Stream<String> myStream = Arrays.stream(namen);
		myStream.forEach(System.out::println);
		
		
		

	}

}
