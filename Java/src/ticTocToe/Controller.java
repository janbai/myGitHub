package ticTocToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Controller {
	
	Random random = new Random();
	
	
	private Integer[] corners = {1,3,7,9}; 
	private Integer[] sides = {2,4,6,8};
	private Integer[] a =  {1,2,3,4,5,6,7,8,9};
	private List<Integer> legalNummbers =  Arrays.asList(a);
	private List<Integer> corner1 =  Arrays.asList(corners);
	private List<Integer> side1 =  Arrays.asList(sides);
    
	
	
			
	public boolean legalNummbers(int x) { return (! legalNummbers.contains(x)) ?  true :  false;}
			

	public Integer getOpposite(int x) 	{ return 10-x;}
	public Boolean IsCenter (int x) 	{ return (x==5)? true : false;}
	
	public Boolean IsCorner (int x) 	{ return corner1.contains(x) ? true : false;}
	public Boolean IsSide (int x) 		{ return side1.contains(x) ? true : false;}
		
	public Boolean IsCenterFree (Board board) 	{ return (board.get(1, 1)=='-')? true : false;}
//-------------------------------------------------------------	
public Position getFreeCorner (Board board) 	
{ 
	Position [] p = board.getPositions();
	
	for (int i : corners) {
		if(p[i-1].getCurrentMark()=='-') {
			return p[i-1];
		}
	}
	return null;
}
//-------------------------------------------------------------

@SuppressWarnings("unused")
public Position getRandomFreeCorner(Board board) 
{
	List<Position> freeCorner = new ArrayList<>();
	Position [] p = board.getPositions();

	for (int x : corners) 
	{
		if(p[x-1].getCurrentMark()=='-') 
		{
		freeCorner.add(p[x-1]);
		
		}
		
	}
	
	if (freeCorner != null) {
		return freeCorner.get(random.nextInt(freeCorner.size()));
	}
	return null;
}	
//-------------------------------------------------------------	
	
@SuppressWarnings("unused")
public Position getRandomFreeSide(Board board) 
{
	List<Position> freeSides = new ArrayList<>();
	Position [] p = board.getPositions();

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()=='-') { freeSides.add((p[x-1]));}
	}
	if (freeSides != null) { return freeSides.get(random.nextInt(freeSides.size()));}
	
	return null;
}	

	
	
	
	//getFreeSide
	public Position getFreeSide (Board board) 	
	{ 
		Position [] p = board.getPositions();
		
		for (int i : sides) {
			if(p[i-1].getCurrentMark()=='-') {
				return p[i-1];
			}
		}
		return null;
	}
	
	
	public boolean isOppositeBlocked(Position p) {
		
		return false;
	}



private final String mismatchInput 			= "Eingabefehler! Es soll doch eine Zahl sein!";
private final String gameDraw 				= "Anscheinend haben wir ein Unentschieden!";
private final String congratulation 		= "Herzliche Glückwünsche ! Du bist ein Gewinner";
private final String gameOver 				= "Game Over!";
private final String IllegalNummbers		= "diese Nummmer ist ungültig!";
private final String tryAgain 				= "Versuchen Sie es noch einmal: ";


public void IllegalNummbers() 				{boxBorder(IllegalNummbers);}
public void mismatchInput() 				{boxBorder(mismatchInput);}
public void gameProcess(int player) 		{
	if (player==1) {
		System.out.print("Spieler(" + player + ") choose nummber : ");
	}else {
		System.out.print("Spieler(" + player + ") I will choose : ") ;
	}
}
public void tryAgain() 						{System.out.print(tryAgain);}

public void congradulation() 				{boxBorder(congratulation);}
public void gameOver() 		 				{boxBorder(gameOver);}
public void gameDraw() 		 				{boxBorder(gameDraw);}


void boxBorder(String text) 
{ 
	String str1 = "+";
	String str2 = "-";
	String left  = "|   ";
	String right = "   |";
	int a = -str1.length() + text.length() + left.length() + right.length() - str2.length();
	String line = "+" + new String(new char[a]).replace("\0", "-") + "+";
	System.out.printf("%s%n%s%s%s%n%s%n", line, left, text , right, line); 
}
	
public void welcome(Board board)
{
	
	System.out.printf("%33s%n","+-------------------------+");
	System.out.printf("%33s%n","|        Willkommen       |");
	System.out.printf("%33s%n","|           im            |");
	System.out.printf("%33s%n","|       Tic Tac Toc       |");
	System.out.printf("%33s%n","+-------------------------+");
	System.out.println();
	System.out.printf("%11s%33s%n","Spielfeld","Positionsnummer");
	board.printBoard(); 
	System.out.println("Geben Sie bitte das Positionsnummer ein.");
	System.out.println();
	
}
	
	
	
}
