package StringBuilder_36_42_133_134;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q134 {

	

	public static void main(String[] args) {


		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
	
if (arrList.removeIf((String s) -> {return  s.length() <= 2;}) ) {
		
	//	System.out.println(s + "removed"); // Compilation fails.
		System.out.println(arrList + " the new arr");
		}

	}

}
