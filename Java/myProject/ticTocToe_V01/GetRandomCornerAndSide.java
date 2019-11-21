package ticTocToe_V01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class GetRandomCornerAndSide {

private static Integer[] corners 				= {1,3}; //1,3,7,9
private static Integer[] sides 					= {}; //2,4,6,8
private static Integer[] validNo 					=  {1,2,3,4,5,6,7,8,9};
public static Integer getOpposite(int x) 			{ return 10-x;}
static Model model = new Model();
	static Random random = new Random();
//-------------------------------------------------------------	

public static  List<Position> getFreeCell (Board board) 
{
	List<Position> freeCell = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

	for (int x : validNo) 
	{
		if(p[x-1].getCurrentMark() == '-') 
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
	
	return (opp.getCurrentMark()== '-')? true: false;
}	
	
//-------------------------------------------------------------	
	
	;
public static  List<Position> getFreeRandomCorners  (Board board) throws UnsupportedOperationException
{
	List<Position> freeCorner = new ArrayList<>();
	Position [] p = model.getAllPositions(board);

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark() == '-') 
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
		if(p[x-1].getCurrentMark()=='-') { freeSides.add((p[x-1]));}
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
	

List<Position> freeCell = getFreeCell(board);
List<Position> openFreeCell = getOpenFreeCell(board,freeCell);
System.out.println("free Open Cell: ");
printList(openFreeCell);

board.set(1, 1, 'o');
board.set(0, 0, 'x');
board.set(0, 1, 'x');
freeCell = getFreeCell(board);
System.out.println("-------------------");
System.out.println("free Open Cell: ");
printList(freeCell);



	}

	public static  List<Position> getOpenFreeCell1 (Board board, List<Position> freeCell) 
	{
		List<Position> openFreeCell = new ArrayList<>();
	
			for (int index = 0; index < 3; index++) {
				Position p = freeCell.get(index);
				int r = p.getRow();
				int c = p.getColumn();
				
				for (int i = 0; i < 3 && i != r; i++) { // check row
					if (p.getCurrentMark() != '-') {
						
					}
				}
			
			
			
			
		}
		return openFreeCell;
	}	



}
