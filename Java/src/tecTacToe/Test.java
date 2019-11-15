package tecTacToe;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		final Integer[] a1 = {1,3,7,9}; 
	    final Integer[] a2 = {2,4,6,8};
	    final Integer[] a =  {1,2,3,4,5,6,7,8,9};
	    final int center = 5;
	    final List<Integer> corners =  Arrays.asList(a1);
	    final List<Integer> sides =  Arrays.asList(a2);
	   
	    
	    
	    
	  //  final List<Integer> cornerUndSides =  corners+ sides;
	 
		//System.out.println(corners.indexOf(1));
		int x = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " <> " +  (10-i));
		}
		
	}

}
