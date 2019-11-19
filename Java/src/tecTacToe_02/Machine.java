package tecTacToe_02;


public class Machine {

Position pos = new Position();

public Position chanceToWin(Board board)		{ return chanceToWinBlock('o', board);}	 	
	
public Position forceToBlock (Board board)		{ return chanceToWinBlock('x', board);}

public Position chanceTogetCenter(Board board) 	{ return (new Controller().IsCenterFree(board)) ? new Position(1,1,'o') :null;}			
//-----------------------------------------------------------------------------------------------------------------------------
public Position chanceTogetCorner(Board board) 	
{
	
	if(new Controller().getFreeCorner(board) != null) 
	{
		Position cornerPos = new Controller().getRandomFreeCorner(board);
		boolean  isOppFree = new Controller().isOppositeBlocked(board, cornerPos);
		
		if(cornerPos != null)
		{
			return (isOppFree)? cornerPos : new Controller().getRandomFreeCorner(board);
		}
	}
	return null;
}
//-----------------------------------------------------------------------------------
public Position chanceTogetSide(Board board) 	{
	
	
	if(new Controller().getFreeCorner(board) != null) 
	{
		Position sidePos  = new Controller().getRandomFreeSide(board);
		boolean isOppFree = new Controller().isOppositeBlocked(board, sidePos);
		
		if(sidePos != null)
		{
			return (isOppFree)? sidePos : new Controller().getRandomFreeSide(board);	
		}
	}
	return null;
}
//--------------------------------------------------------------------------------
public Position strategy_01(Board board) 
{
	
	if (chanceToWin(board) != null && chanceToWin(board).isChance()) 		  				{ return chanceToWin(board);}
			
	else if(forceToBlock(board) != null )  				{ return forceToBlock(board);}
	
	else if(chanceTogetCenter(board) != null )  			{ return chanceTogetCenter(board);}
	
	else if(chanceTogetCorner(board) != null )  		{ return chanceTogetCorner(board);}
	
	else if(chanceTogetSide(board) != null )  		{ return chanceTogetSide(board);}
	
	
	return null;
}



public Position strategy(Board board) 
{
	Position markPos, cornerPos, sidePos;
	boolean isOppFree;
	markPos = chanceToWinBlock('o',board);// chance to win
	
	if(! markPos.isChance()) 
	{
		markPos = chanceToWinBlock('x',board); // force to block
		if(! markPos.isChance()) 
		{
			
			if(new Controller().IsCenterFree(board)) // get center
			{
				markPos = new Position(1,1,'o');
				return markPos;
			}
			
				if(! new Controller().IsCenterFree(board)) 
				{
					cornerPos = new Controller().getRandomFreeCorner(board);
					sidePos= new Controller().getRandomFreeSide(board);
					
					isOppFree = new Controller().isOppositeBlocked(board, cornerPos); 
						
					if(cornerPos != null) 
						{
							if (isOppFree) 
							{
								if(cornerPos != null) 
								{
									markPos= cornerPos;
								}
								
							}else 
							{
								
								isOppFree = new Controller().isOppositeBlocked(board, sidePos); 
							}
						}else if(sidePos != null) 
						{
							if (isOppFree) 
							{
								markPos= sidePos;
							}else {
								markPos= new Controller().getRandomFreeCorner(board);
							}
						}
					return markPos;
				}
			}
		}
	return markPos;
}
//------------------------------------------------------------------------------------------------		
public Position chanceToWinBlock(char currentMark,Board board) {
		
	Position checkRow = checkRowsToMark(currentMark, board); 
	Position checkCol = checkColumnsToMark(currentMark, board);
	Position checkDia = checkDiagonalToMark(currentMark, board);
	
	
	if(checkRow != null && !checkRow.isChance()) 	{return checkRow;}
	if(checkCol != null && !checkCol.isChance()) 	{return checkCol;}
	if(checkDia != null && !checkDia.isChance()) 	{return checkDia;}
	
		
	return null;
}
//------------------------------------------------------------------------------------------------		
public Position checkRowsToMark(char currentMark, Board board) 
{
	Position[] p = board.getAllPositions();	
	
	Position p_0 = checkLine(currentMark, p[0], p[1], p[2]);
	Position p_1 = checkLine(currentMark, p[3], p[4], p[5]);
	Position p_2 = checkLine(currentMark, p[6], p[7], p[8]);
	
	if(p_0 != null && !p_0.isChance()) {return p_0;}
	if(p_1 != null && !p_1.isChance()) {return p_1;}
	if(p_2 != null && !p_2.isChance()) {return p_2;}
	
	
	return null;
}
//------------------------------------------------------------------------------------------------	
public Position checkColumnsToMark(char currentMark, Board board) 
{
	
	Position[] p = board.getAllPositions();	
	
	Position p_0 = checkLine(currentMark, p[0], p[3], p[6]);
	Position p_1 = checkLine(currentMark, p[1], p[4], p[7]);
	Position p_2 = checkLine(currentMark, p[2], p[5], p[8]);
	
	if(p_0 != null && !p_0.isChance()) {return p_0;}
	if(p_1 != null && !p_1.isChance()) {return p_1;}
	if(p_2 != null && !p_2.isChance()) {return p_2;}
	
	return null;
}
//------------------------------------------------------------------------------------------------	
public Position checkDiagonalToMark(char currentMark, Board board) 
{
	Position[] p = board.getAllPositions();
	
	Position p_0 = checkLine(currentMark, p[0], p[4], p[8]);
	Position p_1 = checkLine(currentMark, p[2], p[4], p[6]);
	
	
	if(p_0 != null && !p_0.isChance()) {return p_0;}
	if(p_1 != null && !p_1.isChance()) {return p_1;}
	
	
	
		
	return null;		
}			
//------------------------------------------------------------------------------------------------	
public Position checkLine(char currentMark, Position p1, Position p2, Position p3) 
{ 
	if ((p1.getCurrentMark() == '-') && (p2.getCurrentMark() == currentMark) && (p2.getCurrentMark() == p3.getCurrentMark())) 
		{p1.setChance(true); return p1;}
	if ((p2.getCurrentMark() == '-') && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p3.getCurrentMark())) 
		{ p2.setChance(true); return p2;}
	if ((p3.getCurrentMark() == '-') && (p1.getCurrentMark() == currentMark) && (p1.getCurrentMark() == p2.getCurrentMark())) 
		{ p3.setChance(true); return p3;}
	
	return null;
}
//------------------------------------------------------------------------------------------------		

/*
public boolean checkLine2(char currentMark, char c1, char c2, char c3) 
{ 
	return ((c1 == '-') && (c2 == currentMark) && (c2 == c3)
		|| 	(c2 == '-') && (c1 == currentMark) && (c1 == c3)
		||	(c3 == '-') && (c1 == currentMark) && (c1 == c2)
		    );
}
*/
//------------------------------------------------------------------------------------------------	
}//end of Machine
