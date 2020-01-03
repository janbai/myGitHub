package String_12_45_49_52_85_111_112_143;

import java.util.stream.IntStream;

public class Q012 {

	public static void main(String[] args) {
		// Q012
		String ta = "A ";
		ta = ta.concat("B ");
		char ta1 = ta.charAt(0);
		IntStream ta2 = ta.chars();
		System.out.println("ta1= " + ta1);
		
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
		
		
		
	}
}