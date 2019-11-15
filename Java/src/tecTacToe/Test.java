package tecTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		

		
	   
		for (int i = 1; i < 10; i++) {
			
		//  System.out.println(i + " <Opposite> " + getOpposite(i));
		//	System.out.println(i + " <IsCenter> " + IsCenter(i));
		//	System.out.println(i + " <isCorner> " + IsCorner(i));
		//	System.out.println(i + " <IsSide> " + IsSide(i));
			
			
		}
		
		for (int i = 0; i < brettspiel.length; i++) {
			for (int j = 0; j < brettspiel[0].length; j++) {
				System.out.print(brettspiel[i][j] + " ");
			}
			System.out.println();
		}
		
		char aktuelleSpielermarke = 'o'; 
			
		
		
		int row1 = chanceInRow(aktuelleSpielermarke)[0];
		int col1 = chanceInRow(aktuelleSpielermarke)[1];
		
		
	System.out.println("-------------");
		System.out.println(row1 + "|" + col1);
		
		int row2 = chanceInCol(aktuelleSpielermarke)[0];
		int col2 = chanceInCol(aktuelleSpielermarke)[1];
		System.out.println("-------------");
		System.out.println(row2 + "|" + col2);
		
		int row3 = chanceInDia(aktuelleSpielermarke)[0];
		int col3 = chanceInDia(aktuelleSpielermarke)[1];
		System.out.println("-------------");
		System.out.println(row3 + "|" + col3);
		
		
		
	}
	
	
	
	static char[][] brettspiel = {{'o','-','-'},{'-','o','-'},{'-','-','-'}};
	static char blank= '-';
	static int[] pos= {3,3};
	
	final static Integer[] a1 = {1,3,7,9}; 
    final static Integer[] a2 = {2,4,6,8};
    final Integer[] a =  {1,2,3,4,5,6,7,8,9};
    static final int center = 5;
    static final List<Integer> corners =  Arrays.asList(a1);
    static final List<Integer> sides =  Arrays.asList(a2);
    
	static Integer getOpposite(int x) 	{ return 10-x;}
	static Boolean IsCenter (int x) 	{ return (x==5)? true : false;}
	static Boolean IsCorner (int x) 	{ return corners.contains(x) ? true : false;}
	static Boolean IsSide (int x) 		{ return sides.contains(x) ? true : false;}
	
	
	
	
	private static int[] chanceInRow(char aktuelleSpielermarke) 
	{
		for (int i = 0; i < 3; i++) {
			
			char c1= brettspiel[i][0];
			char c2= brettspiel[i][1];
			char c3= brettspiel[i][2];
			
			if (checkLine(aktuelleSpielermarke, c1, c2, c3)){
				for (int j = 0; j < 3; j++) 
				{
					if (brettspiel[i][j]== blank) 
					{
						pos[0] = i;
						pos[1] = j;
					}
				}
			}
		
		}
		return pos;
		
	}
	
	private static int[] chanceInCol(char aktuelleSpielermarke) 
	{
		for (int i = 0; i < 3; i++) {
			
			char c1= brettspiel[0][i];
			char c2= brettspiel[1][i];
			char c3= brettspiel[2][i];
			
			if (checkLine(aktuelleSpielermarke, c1, c2, c3)){
				for (int j = 0; j < 3; j++) 
				{
					if (brettspiel[j][i]== blank) 
					{
						pos[0] = j;
						pos[1] = i;
					}
				}
			}
		}
		return pos;
		
	}
	
	private static int[] chanceInDia(char aktuelleSpielermarke) 
	{
		
		for (int i = 0; i < 3; i++) {
			
			char c1= brettspiel[0][0];
			char c2= brettspiel[1][1];
			char c3= brettspiel[2][2];
			char c4= brettspiel[0][2];
			char c5= brettspiel[2][0];
			if (checkLine(aktuelleSpielermarke, c1, c2, c3)){
				for (int j = 0; j < 3; j++) 
				{
					if (i==j && brettspiel[i][j]== blank) 
					{
						pos[0] = i;
						pos[1] = j;
					}
				}
				
			}if(checkLine(aktuelleSpielermarke, c4, c2, c5)){
				for (int j = 0; j < 3; j++) 
				{
					if (i==j && brettspiel[i][j]== blank) 
					{
						pos[0] = i;
						pos[1] = j;
					}
				}
			}
		}
		return pos;
		
	}
	
	
private static boolean checkLine(char aktuelleSpielermarke, char c1, char c2, char c3) 
{ 
	return ((c1 == '-') && (c2 == aktuelleSpielermarke) && (c2 == c3)
		|| 	(c2 == '-') && (c1 == aktuelleSpielermarke) && (c1 == c3)
		||	(c3 == '-') && (c1 == aktuelleSpielermarke) && (c1 == c2)
			);
}


	
}
