package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Terminal_Operations {

	public static void main(String[] args) {
		
		Consumer<? super Integer> action = x -> System.out.println(x);;
		long result = Stream.of(1, 2, 3, 4, 5, 6)
				.filter(x -> x%2 ==0)
			.count();

	System.out.println(result);
	System.out.println("------------");
	
	//Stream.of(1, 2, 3, 4, 5, 6).forEach(action);
	
	
	
	Comparator<Integer> comparator = Comparator.naturalOrder() ;
	Optional<Integer> maybeMin = Stream.of(1, 3, 2, 5, -7)
	.max(comparator );
	
	System.out.println(maybeMin.get());
	
	

	

	}
}
