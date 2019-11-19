package ticTocToe;

public class Board {

	private final char blank='-';
	private char[][] board;
	
//-------------------------------------------------------------------------	
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
public Position[] getAllPositions() 
{
	Position [] p = new Position[9];
	int x=0;
	for (int row = 0; row < 3; row++) {
		for (int column = 0; column < 3; column++) {
			p[x]= new Position(row,column,get(row,column));
			x++;
		}
	}
	return p;
}
//-------------------------------------------------------------------------		
public int[] getCoordinate(int x) 
{
	int[] xy = {-1,-1};
	int y= 0;
	
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{ 
			y++;
			if(y ==x) 
			{
				xy[0] = i;
				xy[1] = j;
				return xy;
				}
			} 
		}
	return xy;
}
//-------------------------------------------------------------------------		
public int getCellNo(Position p) 
{
	int x = 0;
	for (int row = 0; row < 3; row++) 
	{
		for (int column = 0; column < 3; column++) 
		{
			x++;
			if ((row== p.getRow()) && (column == p.getColumn())) 
			{
				return x;
			}
		}
	}
	return 0;
}
//-------------------------------------------------------------------------	
public Position getPosition (Board board, int x) {
	Position p  = new Position();
	int y= 0;
	
	for (int row = 0; row < 3; row++) 
	{
		for (int column = 0; column < 3; column++) 
		{ 
			y++;
			if(y ==x) 
			{
			p.setRow(row); 
			p.setColumn(column);
			char currentMark = board.get(row, column);
			p.setCurrentMark(currentMark);
			
			if (currentMark == blank) 
			{
				p.setChance(true);
			}else 
			{
				p.setChance(false);
			}
			return p;
			}
		} 
	}
	return null;
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
		rahmen();
	}
} 
//-------------------------------------------------------------------------	
void rahmen() {System.out.printf("%s%30s%n","-------------","-------------"); }
	
}// end of board
