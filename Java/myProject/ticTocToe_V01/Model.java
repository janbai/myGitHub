package ticTocToe_V01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model extends Controller {
	
	Random random = new Random();
	
	private Integer[] corners 					= {1,3,7,9}; 
	private Integer[] sides 					= {2,4,6,8};

	
	public Integer getOpposite(int x) 			{ return 10-x;}
	public Boolean IsCenter (int x) 			{ return (x==5)? true : false;}

	public Boolean IsCenterFree (Board board) 	{ return (board.get(1, 1)=='-')? true : false;}

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
//-------------------------------------------------------------	
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
//-------------------------------------------------------------	
@SuppressWarnings("unused")
public Position getRandomFreeCorner(Board board) 
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
	if (freeCorner != null) 
	{
		return freeCorner.get(random.nextInt(freeCorner.size()));
	}
	return null;
}	
//-------------------------------------------------------------	
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
