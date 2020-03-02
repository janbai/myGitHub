package innerClasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test_02 {

	public static void main(String[] args) {
	List<String> list = Arrays.asList("bb","aaa", "c");
	
	Comparator<String> cmp = new Comparator<String>() {

	public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};
	
	list.sort(cmp);
	System.out.println(list);
	
	list.sort( (s1,s2)-> s1.compareTo(s2));
	
	
	}

}
