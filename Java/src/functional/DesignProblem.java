package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




class MyStringCmp implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}


public class DesignProblem {
	public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Abcdef");
	list.add("ab");
	list.add("aaaaa");
	list.add("def");
	
	Collections.sort(list,new MyStringCmp());
	System.out.println("list: " + list);
	
	
}
	

}
