package sudoku;

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
	
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
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
	for (int i = 0; i < 9; i++) 
	{
		for (int j = 0; j < 9; j++) 
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
	
	message.rahmen1();
	for (int i = 0; i < 9; i++)
	{
		System.out.print("|| "); 
		
		for (j = 0; j < 9; j++)
		 { 
			if( j== 2 || j==5 || j==8) System.out.print(board[i][j] + " || "); 
			else System.out.print(board[i][j] + " | "); 
			 
		 }
		
		
		System.out.println(); 
		if( i== 2 || i==5 || i==8) message.rahmen1();
		else message.rahmen();
	}
} 
//-------------------------------------------------------------------------	

	
}// end of board
