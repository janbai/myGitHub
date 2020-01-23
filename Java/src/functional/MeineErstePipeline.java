package functional;

import java.util.Arrays;
import java.util.List;

public class MeineErstePipeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list =Arrays.asList(8,7, 45, 33);
		list.stream()
			.map(x -> x+1) // 8+1 = 9
			.map(x -> x*2) // 9*2 =18
			.forEach(System.out::println);
		System.out.println(list);
	}

}
