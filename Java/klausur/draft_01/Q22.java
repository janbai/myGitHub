package draft_01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface I {  
	void m(); 
}
class C implements I { 
	public void m() {} 
}

public class Q22 {

	public static void main(String[] args) {


		List<Integer> list = Arrays.asList(1, 3, 5);
		Optional<Integer> maybeInt = list.stream().reduce( (a, b) -> a+b );
		System.out.println(maybeInt.get());


		List<Integer> list1 = Arrays.asList(1, 3, 5);
		Optional<Integer> maybeInt1 = list.stream().reduce( Integer::sum );
		System.out.println(maybeInt1.get());
		
		
		List<String> list2 = Arrays.asList("montag", "donnerstag", "mi");
		String tag;
		tag = list2.stream().filter(s -> s.startsWith("d"))
				.reduce(String::concat).get();

		System.out.println(tag);
		
		
		I var1 = C::new;
		I var2 = System::console;
		I var3 = new Object()::toString;
		
		System.out.println(var2.toString());
	}

}
