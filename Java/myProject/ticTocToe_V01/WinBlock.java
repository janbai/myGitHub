package ticTocToe_V01;

public class WinBlock {
	private Model model = new Model();
	private Controller message = new Controller();
	private char blank = message.blank;
	
	
	//------------------------------------------------------------------------------------------------		
	public Position ToWinBlock(char currentMark,Board board) {
		
		Position winPos= checkRowsToMark(currentMark, board); 
		if(! winPos.isChance()) winPos= checkColumnsToMark(currentMark, board); 
		if(! winPos.isChance()) winPos= checkDiagonalToMark(currentMark, board);
		
		return winPos;
	}
	//------------------------------------------------------------------------------------------------		

	public Position checkRowsToMark(char currentMark, Board board) 
	{
		Position[] p = model.getAllPositions(board);	
		Position rowPos= checkLine(currentMark, p[0], p[1], p[2]);
		
		if(! rowPos.isChance()) rowPos= checkLine(currentMark, p[3], p[4], p[5]);
		if(! rowPos.isChance()) rowPos= checkLine(currentMark, p[6], p[7], p[8]);
		
		return rowPos;
	}
	//------------------------------------------------------------------------------------------------		
	public Position checkColumnsToMark(char currentMark, Board board) 
	{
		Position[] p = model.getAllPositions(board);	
		
		Position colPos= checkLine(currentMark, p[0], p[3], p[6]);
		if(! colPos.isChance()) colPos= checkLine(currentMark, p[1], p[4], p[7]);
		if(! colPos.isChance()) colPos= checkLine(currentMark, p[2], p[5], p[8]);
		
		return colPos;
	}
	//------------------------------------------------------------------------------------------------	
	public Position checkDiagonalToMark(char currentMark, Board board) 
	{

	Position[] p = model.getAllPositions(board);

		Position diaPos= checkLine(currentMark, p[0], p[4], p[8]);
		if(! diaPos.isChance()) diaPos= checkLine(currentMark, p[2], p[4], p[6]);
		
	return diaPos;		
	}			
	//------------------------------------------------------------------------------------------------	
	public Position checkLine(char currentMark, Position p1, Position p2, Position p3) 
	{ 
	if ((p1.getCurrentMark() == blank) && (p2.getCurrentMark() == currentMark) && (p2.getCurrentMark() == p3.getCurrentMark())) 
		{p1.setChance(true); return p1;}
	if ((p2.getCurrentMark() == blank) && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p3.getCurrentMark())) 
		{ p2.setChance(true); return p2;}
	if ((p3.getCurrentMark() == blank) && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p2.getCurrentMark())) 
		{ p3.setChance(true); return p3;}

	return new Position(-1,-1,blank);
		  
	}
	

}
