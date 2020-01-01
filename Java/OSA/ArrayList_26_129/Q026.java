package ArrayList_26_129;

import java.util.ArrayList;
import java.util.List;

public class Q026 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if (names.remove("Bran")) {
		names.remove("Jon");
		}
		System.out.println(names); // [Robb, Rick, Bran]
		
		if (names.remove("Bran")) {
			names.add("Joe");
			}
		System.out.println(names); // [Robb, Rick, Joe]
	}
}
