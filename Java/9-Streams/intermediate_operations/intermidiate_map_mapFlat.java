package intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class intermidiate_map_mapFlat {

	public static void main(String[] args) {


		//UnaryOperator<Character> operator = c -> (char)(c+1);
		UnaryOperator<Character> operator = c -> ++c;
		Character seed = 'a';
		Consumer<Character> action = c -> System.out.print(c +" ");;
		Stream.iterate(seed, operator)
			.limit(26)
			.map(Character::toUpperCase)
			.forEach(action );
		
		System.out.println();
		
		System.out.println("using IntStream / rangeClosed ");
		IntConsumer action1 = c -> System.out.print((char)c + " ");
		IntStream.rangeClosed('A', 'Z')
		.map(Character::toLowerCase)
			.forEach(action1 );

		System.out.println();
		System.out.println("using map ");
		
		
		Character[] seed2 = new Character[] {97, 'a'};
		UnaryOperator<Character[]> operator2 = c -> new Character[] {++c[0], ++c[1]} ;
		Consumer<Character[]> action2 =  c -> System.out.printf("%-5s %s%n", c[0],c[1]);
		Function<Character[],Character[]> mapper2 = c-> new Character[] {
					(char)c[0],
					Character.toUpperCase(c[1])
				};
		Stream.iterate(seed2 , operator2  )
			.limit(26)
			.map(mapper2 )
			.forEach(action2);
			
		
		List<String> list = Arrays.asList("Java", "is", "a", 
                "best", "computer", "language"); 

		list.stream()
		.map(str -> str + " " )
		.map(String::toUpperCase)
		.map(str -> str.toString())
		.forEach(System.out::print);
		 
		System.out.println();
		
		// Creating a list of Prime Numbers 
        List<Integer> list1 = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> list2 = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> list3 = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = 
                Arrays.asList(list1, list2, list3); 
  
        System.out.println("The Structure before flattening is : " + 
                                                  listOfListofInts); 
          
        // Using flatMap for transformating and flattening. 
        System.out.println("The Structure after flattening is : " ); 
               
        listOfListofInts.stream() 
                        .flatMap(List::stream) 
                        .map(str -> str + " " )
                        .forEach(System.out::print);
        System.out.println();					
	  Stream.of(list1,list2, list3)
			  .flatMap(List::stream)
			  .map(x -> x*2)
			  .map(x -> x +"%")
			  .map(str -> str + " " )
			  .forEach(System.out::print);
	  System.out.println();
		String text = "JAVA IS A BEST COMPUTER LANGUAGE";
		Stream.of(text)
		.map(s -> s.split(" "))
		.flatMap(Arrays::stream)
		.map(String::toLowerCase)
	//	.distinct()
		.map(str -> str + " " )
		.forEach(System.out::print);
		System.out.println();
		
		
	}

}
