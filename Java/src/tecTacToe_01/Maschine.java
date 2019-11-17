package tecTacToe_01;

import java.util.Arrays;
import java.util.List;

public class Maschine {

	private final char blank= '-';
	private int[] pos= {3,3};
	private static boolean chance = false;
	private final Integer[] a1 = {1,3,7,9}; 
	private final Integer[] a2 = {2,4,6,8};
	private final Integer[] a =  {1,2,3,4,5,6,7,8,9};
	private final int center = 5;
	private final List<Integer> corners =  Arrays.asList(a1);
	private final List<Integer> sides =  Arrays.asList(a2);
    
	public Integer getOpposite(int x) 	{ return 10-x;}
	public Boolean IsCenter (int x) 	{ return (x==5)? true : false;}
	public Boolean IsCorner (int x) 	{ return corners.contains(x) ? true : false;}
	public Boolean IsSide (int x) 		{ return sides.contains(x) ? true : false;}
	

	public void chanceToWin(char currentMark,char[][] brettspiel) {
		Maschine comp = new Maschine();
		chance=false;
		
		comp.checkRowsToMark(currentMark, brettspiel);
		
		System.out.println("chance: " + chance);
		int row1 = comp.checkRowsToMark(currentMark, brettspiel)[0];
		int col1 = comp.checkRowsToMark(currentMark, brettspiel)[1];
	}
	
	
public int[] checkRowsToMark(char currentMark, char[][] board) 
{
	for (int i = 0; i < 3; i++) { char c1= board[i][0]; char c2= board[i][1]; char c3= board[i][2];
		
		if (checkLine(currentMark, c1, c2, c3))
		{
			chance = true;
			for (int j = 0; j < 3; j++) {if (board[i][j]== blank) {pos[0] = i; pos[1] = j;}}
		}
	}
	
	return pos;
}

public int[] checkColumnsToMark(char currentMark, char[][] brettspiel) 
{
	for (int i = 0; i < 3; i++) { char c1= brettspiel[0][i]; char c2= brettspiel[1][i];char c3= brettspiel[2][i];
		if (checkLine(currentMark, c1, c2, c3))
		{
			chance = true;
			for (int j = 0; j < 3; j++) 
			{
				if (brettspiel[j][i]== blank) {	pos[0] = j; pos[1] = i;}
			}
		}else {
			chance= false;
		}
	}
	return pos;
}

public int[] checkDiagonalToMark(char currentMark, char[][] board) 
{
	for (int i = 0; i < 3; i++) { char c1= board[0][0]; char c2= board[1][1]; char c3= board[2][2]; 
								  char c4= board[0][2]; char c5= board[2][0];
		if (checkLine(currentMark, c1, c2, c3))
		{
			for (int j = 0; j < 3; j++) 
			{
				if (i==j && board[i][j]== blank){ pos[0] = i; pos[1] = j;}
			}			
	
		}		
	}
	chance = false; return pos;		
}			

public boolean checkLine(char currentMark, char c1, char c2, char c3) 
{ 
	return ((c1 == '-') && (c2 == currentMark) && (c2 == c3)
		|| 	(c2 == '-') && (c1 == currentMark) && (c1 == c3)
		||	(c3 == '-') && (c1 == currentMark) && (c1 == c2)
		    );
}

	
	
	
	
	
}// end of Stratigy
