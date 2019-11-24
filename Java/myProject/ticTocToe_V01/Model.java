package ticTocToe_V01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Model extends Controller {
	
Random random = new Random();
Controller message = new Controller();
private Integer[] corners 						= message.corners;
private Integer[] sides 						= message.sides;
private Integer[] validNo 						= message.validNumber;
private final char blank 						= message.blank;

public Integer getOpposite(int x) 				{ return 10-x;} 
public Boolean IsCenter (int x) 				{ return (x==5)? true : false;}

public Boolean IsCenterFree (Board board) 		{ return (board.get(1, 1)=='-')? true : false;}


public Position[] getAllPositions(Board board) 
{
	
	Position [] p = new Position[9];
	int x=0;
	for (int row = 0; row < 3; row++) {
		for (int column = 0; column < 3; column++) {
			p[x]= new Position(row,column,board.get(row,column));
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
			
			return p;
			}
		} 
	}
	return null;
}

//------------------------------ hard mode------------------------------------------------
public Position getRandomOpenFreeCorners (Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenCorner = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark() == blank && p[x-1].isGoodMove() == true) 
		{
		freeOpenCorner.add(p[x-1]); 
		}
	}
	Collections.shuffle(freeOpenCorner);
	Position goodMoveinCorner = (freeOpenCorner.size()>0)? freeOpenCorner.get(0): null;
	
	return goodMoveinCorner;
	
}
//-------------------------------------------

public Position getRandomOpenFreeSides (Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenSides = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()==blank && p[x-1].isGoodMove() == true) 
		{
			freeOpenSides.add((p[x-1]));
		}
	}
	Collections.shuffle(freeOpenSides);
Position goodMoveinSide = (freeOpenSides.size()>0)? freeOpenSides.get(0): null;
	
	return goodMoveinSide;
}	

//--------------------------------------------

public Position getRandomFreeCorner(Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenCorner = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark() == blank ) 
		{
		freeOpenCorner.add(p[x-1]); 
		}
	}
	Collections.shuffle(freeOpenCorner);
	Position goodMoveinCorner = (freeOpenCorner.size()>0)? freeOpenCorner.get(0): null;
	
	return goodMoveinCorner;
}	
//------------------------------- medium mode ------------------------------	
public Position getRandomOpenFreeCell (Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenCell = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : validNo) 
	{
		if(p[x-1].getCurrentMark() == blank) 
		{
		freeOpenCell.add(p[x-1]); 
		}
	}
	Collections.shuffle(freeOpenCell);
	Position goodMoveinFreeCell = (freeOpenCell.size()>0)? freeOpenCell.get(0): null;
	
	return goodMoveinFreeCell;
}	
//------------------------------ easy mode------------------------------------------------

public Position getFreeRandomCell (Board board) throws UnsupportedOperationException	
{
	List<Position> freeCell = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()==blank) 
		{
			freeCell.add((p[x-1]));
		}
	}
	Collections.shuffle(freeCell);
Position freeMove = (freeCell.size()>0)? freeCell.get(0): null;
	
	return freeMove;
}	


//-------------------------------------------------------------	

public  List<Position> getFreeCorner(Board board) 
{
	List<Position> freeCorner = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark()=='-') 
		{
		freeCorner.add(p[x-1]);
		}
	}
	return freeCorner;
}	
//------------------the methods below have been not used-------------------------------------------	
public  List<Position> getFreeSide (Board board) 
{
	List<Position> freeSides = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()=='-') { freeSides.add((p[x-1]));}
	}
	return freeSides;
}	



@SuppressWarnings("unused")
public Position getRandomFreeSide(Board board) 
{
	List<Position> freeSides = new ArrayList<>();
	Position [] p = getAllPositions(board);

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()=='-') { freeSides.add((p[x-1]));}
	}
	if (freeSides != null) { return freeSides.get(random.nextInt(freeSides.size()));}
	
	return null;
}	
//-------------------------------------------------------------	
public boolean isOppositeBlocked(Board board, Position p) {
	int cellNo = getCellNo(p);
	int OppCell = getOpposite(cellNo);
	Position opp = getPosition(board, OppCell);
	
	return (opp.getCurrentMark()== '-')? true: false;
}
//-------------------------------------------------------------	

}//end of Model
