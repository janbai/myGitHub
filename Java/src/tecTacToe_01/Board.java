package tecTacToe_01;

public class Board extends TicTacToe {

	private int rows;
	private int columns;
	private final char blank='-';
	private char[][] board;
	
	
	public Board(int rows, int columns) {
	
		this.board = new char[rows][columns];
		
	}//------------------------------------

	public char get(int row, int column) {
		return board[row][column];
	}
	
	public void set(int row, int column, char newValue) {
		board[row][column] = newValue;
	}
	
	public void reset() { 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
		    board[i][j] = blank;
		    }
		}
	}//------------------------------------
	

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
	
	
	public void ungültigeNummer() 	{System.out.println("diese Nummmer ist ungültig, Versuchen Sie es noch einmal.");}
	void rahmen()			{System.out.printf("%s%30s%n","-------------","-------------"); }	
}
