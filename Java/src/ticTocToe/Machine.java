package ticTocToe;


public class Machine {

	Position pos = new Position();

	public Position strategy(Board board) {
		Position markPos;
		
		markPos = chanceToWinBlock('o',board);
	//	System.out.println("chanceToWin:" + markPos.getRow() + " " + markPos.getColumn()); 
		if(! markPos.isChance()) 
		{
			markPos = chanceToWinBlock('x',board);
		//	System.out.println("chanceToBlock:" + markPos.getRow() + " " + markPos.getColumn()); 
			if(! markPos.isChance()) 
			{
				if(new Controller().IsCenterFree(board)) 
				{
					//System.out.println("IsCenterFree:" + markPos.getRow() + " " + markPos.getColumn());
					markPos = new Position(1,1,'o');
					return markPos;
				}
				if(! new Controller().IsCenterFree(board)) {
					markPos = new Controller().getRandomFreeCorner(board);
					if(markPos != null) 
					{
					//	System.out.println("IsFreeCorner:" + markPos.getRow() + " " + markPos.getColumn());
						return markPos;
					}
					else 
					{
						markPos = new Controller().getRandomFreeSide(board);
					//	System.out.println("IsFreeSide:" + markPos.getRow() + " " + markPos.getColumn());
						return markPos;
					}
				}
				
				
			}
		}
		return markPos;
		}
		

	public Position chanceToWinBlock(char currentMark,Board board) {
		
		Position winPos= checkRowsToMark(currentMark, board); 
		if(! winPos.isChance()) winPos= checkColumnsToMark(currentMark, board); 
		if(! winPos.isChance()) winPos= checkDiagonalToMark(currentMark, board);
		
		
		return winPos;
	}
	
	
public Position checkRowsToMark(char currentMark, Board board) 
{
	Position[] p = board.getAllPositions();	
	
	Position rowPos= checkLine1(currentMark, p[0], p[1], p[2]);
	
	if(! rowPos.isChance()) rowPos= checkLine1(currentMark, p[3], p[4], p[5]);
	if(! rowPos.isChance()) rowPos= checkLine1(currentMark, p[6], p[7], p[8]);
	
	return rowPos;
}

public Position checkColumnsToMark(char currentMark, Board board) 
{
	
	Position[] p = board.getAllPositions();	
	
	Position colPos= checkLine1(currentMark, p[0], p[3], p[6]);
	if(! colPos.isChance()) colPos= checkLine1(currentMark, p[1], p[4], p[7]);
	if(! colPos.isChance()) colPos= checkLine1(currentMark, p[2], p[5], p[8]);
	
	return colPos;
}

public Position checkDiagonalToMark(char currentMark, Board board) 
{
	
	Position[] p = board.getAllPositions();
	
		Position diaPos= checkLine1(currentMark, p[0], p[4], p[8]);
		if(! diaPos.isChance()) diaPos= checkLine1(currentMark, p[2], p[4], p[6]);
		
	return diaPos;		
}			

public boolean checkLine(char currentMark, char c1, char c2, char c3) 
{ 
	return ((c1 == '-') && (c2 == currentMark) && (c2 == c3)
		|| 	(c2 == '-') && (c1 == currentMark) && (c1 == c3)
		||	(c3 == '-') && (c1 == currentMark) && (c1 == c2)
		    );
}

public Position checkLine1(char currentMark, Position p1, Position p2, Position p3) 
{ 
	if ((p1.getCurrentMark() == '-') && (p2.getCurrentMark() == currentMark) && (p2.getCurrentMark() == p3.getCurrentMark())) 
		{p1.setChance(true); return p1;}
	if ((p2.getCurrentMark() == '-') && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p3.getCurrentMark())) 
		{ p2.setChance(true); return p2;}
	if ((p3.getCurrentMark() == '-') && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p2.getCurrentMark())) 
		{ p3.setChance(true); return p3;}
	
	return new Position(-1,-1,'-');
		  
}
	
	
	
	
	
	
}//
