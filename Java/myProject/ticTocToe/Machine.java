package ticTocToe;


public class Machine {

private Model model = new Model();
private WinBlock chance = new WinBlock();
private GoodMove good = new GoodMove();
Position markPos;
//*****************************************Easy Mode ***************************************************
public Position easyMode(Board board) {

	markPos = chance.ToWinBlock('o', board);
	if(! markPos.isChance()) 
	{
		markPos = chance.ToWinBlock('x',board);
		if(! markPos.isChance()) 
		{
				markPos = model.getFreeRandomCell(board);
		}
	}
	return markPos;
}//end of easy mode


//*****************************************Medium Mode ***************************************************
public Position mediumMode(Board board) {

	markPos = chance.ToWinBlock('o', board);
	if(! markPos.isChance()) 
	{
		markPos = chance.ToWinBlock('x',board);
		if(! markPos.isChance()) 
		{
			if(model.IsCenterFree(board)) 
			{
				markPos = new Position(1,1,'o');
				return markPos;
			}
			
			if(! model.IsCenterFree(board)) 
				
			{
				markPos = good.toMove('o', board);
				markPos = model.getRandomOpenFreeCell(board);
			}
			
		}
	}
	return markPos;
}//end of easy mode

//*****************************************Hard Mode ***************************************************
public Position hardMode(Board board,int counter) {

	markPos = chance.ToWinBlock('o', board);
	if(! markPos.isChance()) 
	{
		markPos = chance.ToWinBlock('x',board);
		if(! markPos.isChance()) 
		{
			if(model.IsCenterFree(board)) 
			{
				markPos = new Position(1,1,'o');
				return markPos;
			}
			
			if(! model.IsCenterFree(board)) 
			{
				if(counter>4) 
				{
				markPos = model.getRandomFreeCorner(board);
				if ( markPos != null) 
				{
					return markPos;
				}
				}
				else 
				{
					markPos = good.toMove('o', board);
					markPos = model.getRandomOpenFreeCorners(board);
					if( markPos != null) 
					{
						return markPos;
					}
					else 
					{
						markPos = model.getRandomOpenFreeSides(board);
						
						if ( markPos != null) 
						{
							return markPos;
						}
						else 
						{ 
							markPos = model.getRandomFreeCorner(board);
							
							if ( markPos != null) 
							{
								return markPos;
							}
							else 
							{ 
								markPos = model.getRandomOpenFreeCell(board);	
							}
						}
					}
				}
			}
		}
	}
	return markPos;
}//end of hard mode

}// end of machine
