package ArrayList_26_129;

import java.util.ArrayList;
import java.util.List;

public class Q129 {

	public static void main(String[] args) {
		
		List colors = new ArrayList();
		colors.add("green");
		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3, "cyan");
		System.out.println(colors);
	//	colors.remove(4);	// IndexOutOfBoundsException: Index 4 out of bounds for length 4
	//	colors.add(5, "pink"); // IndexOutOfBoundsException: Index: 5, Size: 4
		System.out.println(colors);
		
		
	}

}
