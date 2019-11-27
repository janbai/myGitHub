package ticTocToe;


public class GoodMove {
private Controller message = new Controller();
private char blank = message.blank;
private Model model = new Model();


//------------------------------------------------------------------------------------------------		
public Position toMove(char currentMark,Board board) {
	
	Position move= goodMoveInRow(currentMark, board); 
	if(! move.isGoodMove()) move= goodMoveInColumn(currentMark, board); 
	if(! move.isGoodMove()) move= goodMoveInDiagonal(currentMark, board);
	
	return move;
}
//------------------------------------------------------------------------------------------------		

public Position goodMoveInRow(char currentMark, Board board) 
{
	Position[] p = model.getAllPositions(board);	
	Position rowPos= checkLine(currentMark, p[0], p[1], p[2]);
	
	if(! rowPos.isGoodMove()) rowPos= checkLine(currentMark, p[3], p[4], p[5]);
	if(! rowPos.isGoodMove()) rowPos= checkLine(currentMark, p[6], p[7], p[8]);
	
	return rowPos;
}
//------------------------------------------------------------------------------------------------		
public Position goodMoveInColumn(char currentMark, Board board) 
{
	Position[] p = model.getAllPositions(board);	
	
	Position colPos= checkLine(currentMark, p[0], p[3], p[6]);
	if(! colPos.isGoodMove()) colPos= checkLine(currentMark, p[1], p[4], p[7]);
	if(! colPos.isGoodMove()) colPos= checkLine(currentMark, p[2], p[5], p[8]);
	
	return colPos;
}
//------------------------------------------------------------------------------------------------	
public Position goodMoveInDiagonal(char currentMark, Board board) 
{

Position[] p = model.getAllPositions(board);

	Position diaPos= checkLine(currentMark, p[0], p[4], p[8]);
	if(! diaPos.isGoodMove()) diaPos= checkLine(currentMark, p[2], p[4], p[6]);
	
return diaPos;		
}			
//------------------------------------------------------------------------------------------------	

public Position checkLine(char currentMark, Position p1, Position p2, Position p3) 
{ 
if ((p1.getCurrentMark() == currentMark) && (p2.getCurrentMark() == blank) && (p2.getCurrentMark() == p3.getCurrentMark())) 
	{p1.setGoodMove(true); return p1;}
if ((p2.getCurrentMark() == currentMark) && (p1.getCurrentMark() == blank) && (p1.getCurrentMark() == p3.getCurrentMark())) 
	{ p2.setGoodMove(true); return p2;}
if ((p3.getCurrentMark() == currentMark) && (p1.getCurrentMark() == blank) && (p1.getCurrentMark() == p2.getCurrentMark())) 
	{ p3.setGoodMove(true); return p3;}

return new Position(-1,-1,blank);
	  
}


}//
