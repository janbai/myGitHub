package ticTocToe;

public class TicTacToe {

	private char currentActualMark; 
	
	
	
	public TicTacToe() { 
		
		currentActualMark = 'x'; 
		
	    }

	
	public boolean checkGewinner(Board board) 
	{
		return(	checkZeilen(board) || checkSpalten(board) || checkDiagonalen(board));
		} 

	private boolean checkZeilen(Board board) 
	{
		for (int row = 0; row < 3; row++) 
		{
			if (checkRowCol(board, board.get(row, 0), board.get(row, 1), board.get(row, 2)) == true) 
			{
				return true;
			} 
		 }
		return false;
		}

	private boolean checkSpalten(Board board)
	{
		for (int column = 0; column < 3; column++) 
		{
			if (checkRowCol( board, board.get(0, column), board.get(1, column), board.get(2, column)) == true) 
			{
				return true;
				} 
			}
		return false;
		} 
	  
	private boolean checkDiagonalen(Board board)
	{
		return (	(checkRowCol(board, board.get(0, 0), board.get(1, 1), board.get(2, 2)) == true) 
				 ||	(checkRowCol(board, board.get(0, 2), board.get(1, 1), board.get(2, 0)) == true));
		} 
		    
	private boolean checkRowCol(Board board,char c1, char c2, char c3) 
	{ 
		return ((c1 != '-') && (c1 == c2) && (c2 == c3));
		} 

	public void changePlayer() 
	{ 
		currentActualMark = (currentActualMark == 'x') ? 'o' : 'x';
		} 
		     
	public boolean checkPlace(Board board, int row, int column) 
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


	public void placeMark(Board board,int row, int column) 
	{
		if (checkPlace(board, row, column)) { 
			board.set(row, column, currentActualMark);
		
		}else 
			board.ungültigeNummer();
		}
		
	
	
	
	/*
	
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
	
	*/
	
}
