package tecTacToe_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

	

	
	

public class TicTacToe  {
	
	
	
	
	Board board = new Board(3,3);
	
private char currentActualMark; 



public TicTacToe()
{ 
	
	currentActualMark = 'x'; 
  
    //board[0][0] = 'o';
    
   
    }

public void printwelcome()
{
	System.out.printf("%33s%n","+-------------------------+");
	System.out.printf("%33s%n","|      Willkommen im      |");
	System.out.printf("%33s%n","|       Tic Tac Toc       |");
	System.out.printf("%33s%n","|     für zwei Spieler    |");
	System.out.printf("%33s%n","+-------------------------+");
	System.out.println();
	System.out.printf("%11s%33s%n","Spielfeld","Positionsnummer");
	board.printBoard(); 
	System.out.println("Geben Sie bitte das Positionsnummer ein.");
	System.out.println();
}




public boolean checkGewinner() 
{
	return(	checkZeilen() || checkSpalten() || checkDiagonalen());
	} 

private boolean checkZeilen() 
{
	for (int row = 0; row < 3; row++) 
	{
		if (checkRowCol(board.get(row, 0), board.get(row, 1), board.get(row, 2)) == true) 
		{
			return true;
		} 
	 }
	return false;
	}

private boolean checkSpalten()
{
	for (int column = 0; column < 3; column++) 
	{
		if (checkRowCol( board.get(0, column), board.get(1, column), board.get(2, column)) == true) 
		{
			return true;
			} 
		}
	return false;
	} 
  
private boolean checkDiagonalen()
{
	return (	(checkRowCol(board.get(0, 0), board.get(1, 1), board.get(2, 2)) == true) 
			 ||	(checkRowCol(board.get(0, 2), board.get(1, 1), board.get(2, 0)) == true));
	} 
	    
private boolean checkRowCol(char c1, char c2, char c3) 
{ 
	return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	} 

public void changePlayer() 
{ 
	currentActualMark = (currentActualMark == 'x') ? 'o' : 'x';
	} 
	     
public boolean checkPlace(int row, int column) 
{ 
	if (board.get(row, column) != '-')  
	{
		
		return false;
		}
	else if	( (row >= 0) && (row < 3) && (column >= 0) && (column < 3) && (board.get(row, column)== '-'))
	{
		
		return true;
		}
	return false;
	} 


public void placeMark(int row, int column) 
{
	if (checkPlace(row,column)) { 
		board.set(row, column, currentActualMark);
	
	}else 
		board.ungültigeNummer();
	}
	
	
}



/*	
private char[][] board;  

final Integer[] a1 = {1,3,7,9}; 
final Integer[] a2 = {2,4,6,8};
final int center = 5;
final List<Integer> corners =  Arrays.asList(a1);
final List<Integer> sides =  Arrays.asList(a2); 
Integer getOpposite(int x) 	{ return 10-x;}
Boolean IsCorner (int x) 	{ return false;}
Boolean IsSide (int x) 		{ return false;}
Boolean IsCenter (int x) 	{ return false;}
*/





 
 
 
/*
public void resetBoard() { 
		
	for (int i = 0; i < 3; i++) 
	{ 
	    for (int j = 0; j < 3; j++)
	    { 
	     board[i][j] = '-';
	     }
	    }
	} 

public void printBoard()
{ 
int y=1; 
int j=0;
	rahmen();
	
	for (int i = 0; i < 3; i++)
		{
		System.out.print("| "); 
		
		for (j = 0; j < 3; j++)
			 { 
			 System.out.print(board[i][j] + " | "); 
			 }
		
		System.out.printf("%18s","| ");
		        
		for (j = 0; j < 3; j++) 
		{
			if (board[i][j] != '-') {
				System.out.print(" " + " | "); 
				y++;
			}else {
				System.out.print(y++ + " | "); 
			}
		}
		System.out.println(); 
		rahmen();
		}
	} 
	   
public boolean istBrettspielVoll() 
{ 
	boolean istVoll = true;
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{ 
			if (board[i][j] == '-') 
			{
				istVoll = false;
				}
			}
		}
	return istVoll;
	} 
*/


