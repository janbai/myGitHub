package tecTacToe_01;

import java.util.Arrays;
import java.util.List;

public class InputKey {

	private static boolean chance = false;
	private final Integer[] a1 = {1,3,7,9}; 
	private final Integer[] a2 = {2,4,6,8};
	private final Integer[] legalNummbers =  {1,2,3,4,5,6,7,8,9};
	private final int center = 5;
	private final List<Integer> corners =  Arrays.asList(a1);
	private final List<Integer> sides =  Arrays.asList(a2);
    
	public Integer getOpposite(int x) 	{ return 10-x;}
	public Boolean IsCenter (int x) 	{ return (x==5)? true : false;}
	public Boolean IsCorner (int x) 	{ return corners.contains(x) ? true : false;}
	public Boolean IsSide (int x) 		{ return sides.contains(x) ? true : false;}
	
	
	
}
