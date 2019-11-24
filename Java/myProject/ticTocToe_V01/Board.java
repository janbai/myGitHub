package ticTocToe_V01;

public class Board {

	
	private char[][] board;
	private Controller message = new Controller();
	char blank = message.blank;
	
//-------------------------------------------------------------------------	
	public Board() {}
public Board(int rows, int columns) 
{
	this.board = new char[rows][columns];
}
//-------------------------------------------------------------------------	
	
public void reset() 
{ 
	
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
	    board[i][j] = blank;
	    }
	}
}
//-------------------------------------------------------------------------	
	
public char get(int row, int column) 
{
	return board[row][column];
}
//-------------------------------------------------------------------------	

public void set(int row, int column, char newValue) 
{
	board[row][column] = newValue;
}
//-------------------------------------------------------------------------	
public boolean isBoardFull() 
{ 
	boolean istVoll = true;
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{ 
			if (board[i][j] == blank) 
			{
				istVoll = false;
			}
		}
	}
	return istVoll;
} 
//-------------------------------------------------------------------------	
public void printBoard()
{
	int y=1; 
	int j=0;
	System.out.println();
	message.header();
	message.rahmen();
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
			if (board[i][j] != blank) 
			{
				System.out.print(" " + " | "); 
				y++;
			}
			else 
			{
				System.out.print(y++ + " | "); 
			}
		}
		System.out.println(); 
		message.rahmen();
	}
} 
//-------------------------------------------------------------------------	

	
}// end of board
