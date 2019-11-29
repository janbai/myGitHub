package ticTocToe;

import java.util.function.Supplier;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(incrementer());
		
		
		
	}
	private static int start = 0;
	 
	static Supplier<Integer> incrementer() {
	    return () -> start++;
	}
}
