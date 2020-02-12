package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AllMatch_AnyMatch_NonMatch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 0, 17);
		
		Predicate<Integer> isPositive = x -> x > 0;
		Predicate<Integer> notNigative = x -> x >= 0;
		
		list.stream().allMatch(isPositive );
		boolean result = list.stream().allMatch(isPositive);
		boolean result1 = list.stream().allMatch(notNigative);
		
		System.out.println("result " + result1);
		
		list.stream().anyMatch(isPositive );
		boolean result2 = list.stream().anyMatch(notNigative.negate());
		System.out.println("result " + result2);
		System.out.println("---------------");
		list.stream().noneMatch(isPositive );
		boolean result3 = list.stream().noneMatch(isPositive);
		boolean result4 = list.stream().noneMatch(notNigative.negate());
		
		System.out.println("result " + result4);
		System.out.println("---------------");
		System.out.println(Stream.<Integer>empty().noneMatch(isPositive));
		System.out.println(Stream.<Integer>empty().anyMatch(isPositive));
		System.out.println(Stream.<Integer>empty().allMatch(isPositive));
	}

}
