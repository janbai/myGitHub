package ticTocToe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GetRandomCornerAndSide {

static Controller message 				= new Controller();
static Model model 						= new Model();
private static Integer[] corners 		= message.corners;
private static Integer[] sides 			= message.sides;
private static Integer[] validNo 		=  message.validNumber;
private static final char blank 				= message.blank;

public static Integer getOpposite(int x) 			{ return 10-x;}

	static Random random = new Random();
//-------------------------------------------------------------	

public static  List<Position> getFreeCell (Board board) 
{
	List<Position> freeCell = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

	for (int x : validNo) 
	{
		if(p[x-1].getCurrentMark() == blank) 
		{
		freeCell.add(p[x-1]); 
		}
	}
	return freeCell;
}	

public static  List<Position> getOpenFreeCell (Board board, List<Position> freeCell) 
{
	List<Position> OpenFreeCell = new ArrayList<>();

	for (Position p : freeCell) 
	{
		if( isOppositeBlocked(board, p) )
		{
			
			OpenFreeCell.add(p);
		}
	}
	return OpenFreeCell;
}	
//-------------------------------------------------------------	
	
public static boolean isOppositeBlocked(Board board, Position p) {
	int cellNo = model.getCellNo(p);
	int OppCell = getOpposite(cellNo);
	Position opp = model.getPosition(board, OppCell);
	
	return (opp.getCurrentMark()== blank)? true: false;
}	
	
//-------------------------------------------------------------	
public static  Position getOpenFreeRandomCell (Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenCell = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

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
//-------------------------------------------------------------	
	
public static  Position getOpenFreeRandomCorners (Board board) throws UnsupportedOperationException
{
	List<Position> freeOpenCorner = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

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
//-------------------------------------------------------------	

public static  Position getOpenFreeRandomSides (Board board) 
{
	List<Position> freeOpenSides = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

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
//-------------------------------------------------------------	
	
public static  List<Position> getFreeRandomCorners (Board board) throws UnsupportedOperationException
{
	List<Position> freeCorner = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark() == blank) 
		{
		freeCorner.add(p[x-1]); 
		}
	}
	Collections.shuffle(freeCorner);
	return freeCorner;
}	
//-------------------------------------------------------------	
public static  List<Position> getFreeRandomSides (Board board) 
{
	List<Position> freeSides = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()==blank) { freeSides.add((p[x-1]));}
	}
	Collections.shuffle(freeSides);
	return freeSides;
}	
//-------------------------------------------------------------	

static void printList(List<Position> list){
	
	for (Position position : list) {
		int r = position.getRow();
		int c= position.getColumn(); 
		System.out.print(r + " " + c);
		
		
	}
	
	Collections.shuffle(list);
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Board board = new Board(3,3);
board.reset();
/*
		List<Position> freeCorners = getFreeRandomCorners(board);
		List<Position> freeSides = getFreeRandomSides(board);
		System.out.println("free Shuffle Corners: ");
		if (freeCorners.size() != 0) { printList(freeCorners);}
		else {System.out.println("null");}
		Collections.shuffle(freeCorners, random);
		System.out.println("shuffle-------------------");
		
		printList(freeCorners);
		if (freeSides.size() != 0) { printList(freeCorners);}
		else System.out.println("null");
		System.out.println("free Shuffle Sides: ");
		printList(freeSides);
		Collections.shuffle(freeSides, random);
		System.out.println("shuffle-------------------");
		printList(freeSides);
*/		
	
	}


}
