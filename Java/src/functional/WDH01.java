package functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class WDH01 {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1, 2, 3);
		list.forEach( new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
	System.out.println();
	list.forEach(System.out::println);
	}

}
