package utilitiesExamples;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Integer [] array = {1, 12, 33, -6, 101, -60, 77, -8};
		System.out.println(Arrays.stream(array).allMatch(a-> a >0)); // false
				
		System.out.println(Arrays.stream(array).anyMatch(a -> a<0 )); // true
				
		System.out.println(Arrays.stream(array).count());
		
		List<Boolean> list1 = Arrays.stream(array).map(x -> x > 0).collect(Collectors.toList());
		System.out.println(list1); // [true, true, true, false, true, false, true, false]
		 
		List<Integer> list2 = Arrays.asList(23, 43, 12, 25);	  
	  	  IntSummaryStatistics stats = list2.stream()
	  			     .collect(Collectors.summarizingInt(i -> i + i));
	  	  System.out.println("Sum:"+stats.getSum()); // Sum:206
	  	  
	  	  
	  	List<String> list3 = Arrays.asList("Ram","Shyam","Shiv","Mahesh");
		String result=  list3.stream().collect(Collectors.joining(", "));
		System.out.println("Joining Result: "+ result);
	  	
		Consumer<? super Integer> action= (n) -> System.out.print(n + " ");
		Arrays.stream(array).skip(3).forEach(action );;
		System.out.println();
		Arrays.stream(array).filter(x -> x%2 == 0).forEach(action);
		System.out.println();
		Integer maxInt = Arrays.stream(array).max(Integer::compare).get(); 
		System.out.println(maxInt);
		
		Integer minInt = Arrays.stream(array).min(Integer::compare).get(); 
		System.out.println(minInt);
		
			Stream<Integer> stream = Arrays.stream(array);
	
			// Using Stream findAny().  
			// Executing the source code multiple times 
			// may not return the same result. 
			// Every time you may get a different  
			// Integer which is divisible by 4. 
			stream = stream.filter(i -> i % 4 == 0); 
			
			Optional<Integer> answer = stream.findAny(); 
			if (answer.isPresent())  
			{ 
			 System.out.println(answer.get()); 
			} 
			
			
			
	}

}
