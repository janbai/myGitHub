package ticTocToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Controller {
	
Random random = new Random();
	
private Integer[] corners 					= {1,3,7,9}; 
private Integer[] sides 					= {2,4,6,8};
private Integer[] validNo 					=  {1,2,3,4,5,6,7,8,9};
private List<Integer> legalNummbers 		=  Arrays.asList(validNo);

private final String IllegalNummbers		= "diese Nummmer ist Illegal!";		
private final String mismatchInput 			= "Eingabefehler! Es soll doch eine Zahl sein!";
private final String tryAgain 				= "Versuchen Sie es noch einmal: ";
private final String gameDraw 				= "Anscheinend haben wir ein Unentschieden!";
private final String congratulation 		= "Herzliche Glückwünsche ! Du bist ein Gewinner";
private final String gameOver 				= "Game Over!";
private final String UsedNumber				= "Diese Nummer ist besetzt.";

public Integer getOpposite(int x) 			{ return 10-x;}
public Boolean IsCenter (int x) 			{ return (x==5)? true : false;}

public Boolean IsCenterFree (Board board) 	{ return (board.get(1, 1)=='-')? true : false;}

public boolean legalNummbers(int x) 		{ return (! legalNummbers.contains(x)) ?  true :  false;}

public void UsedNumber() 					{boxBorder(UsedNumber);}

public void IllegalNummbers() 				{boxBorder(IllegalNummbers);}
public void mismatchInput() 				{boxBorder(mismatchInput);}
public void tryAgain() 						{System.out.print(tryAgain);}

public void congradulation() 				{boxBorder(congratulation);}
public void gameOver() 		 				{boxBorder(gameOver);}
public void gameDraw() 		 				{boxBorder(gameDraw);}
//-------------------------------------------------------------	
@SuppressWarnings("unused")
public Position getRandomFreeCorner(Board board) 
{
	List<Position> freeCorner = new ArrayList<>();
	Position [] p = board.getAllPositions();

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
	Position [] p = board.getAllPositions();

	for (int x : sides) 
	{
		if(p[x-1].getCurrentMark()=='-') { freeSides.add((p[x-1]));}
	}
	if (freeSides != null) { return freeSides.get(random.nextInt(freeSides.size()));}
	
	return null;
}	
//-------------------------------------------------------------	
public boolean isOppositeBlocked(Board board, Position p) {
	int cellNo = board.getCellNo(p);
	int OppCell = getOpposite(cellNo);
	Position opp = board.getPosition(board, OppCell);
	
	return opp.isChance();
}
//-------------------------------------------------------------	
public void gameProcess(int player) 		{
	if (player==1) {
		System.out.print("Spieler(" + player + ") choose nummber : ");
	}else {
		System.out.print("Spieler(" + player + ") I will choose : ");
	}
}
//-------------------------------------------------------------	
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
//-------------------------------------------------------------		
static void boxBorder(String[] text) 
{ 
		int longestString = 0;
		for (int i = 0; i < text.length-1; i++) 
		{
			longestString = (text[i].length()>text[i+1].length()) ? text[i].length() : text[i+1].length();
		}
		
		int linLen = longestString + 10;
		String line = "+" + new String(new char[linLen]).replace("\0", "-") + "+";
		System.out.print("\t\t");
		System.out.printf("%s%n", line); 
		
		for (int i = 0; i < text.length; i++) {
			System.out.print("\t\t");
			int strLen = text[i].length();
			
			int alignment_left = (linLen - strLen)/2;
			int alignment_right = (linLen - strLen)/2 + (linLen +2 - strLen)%2;
			
			String l = new String(new char[alignment_left]);
			String r = new String(new char[alignment_right]);
			System.out.printf("%s%s%s%n","|", l +text[i] +r ,"|");
			
	}
		System.out.print("\t\t");
		System.out.printf("%s%n", line); 
}
//-------------------------------------------------------------	
static void boxBorder(String[] text, int alignment, int tab) 
{
	int longestString = 0;
	for (int i = 0; i < text.length-1; i++) 
	{
		longestString = (text[i].length()>text[i+1].length()) ? text[i].length() : text[i+1].length();// find the longest string in array
	}
	
	int linLen = longestString + alignment;
	String line = "+" + new String(new char[linLen]).replace("\0", "-") + "+";
	String tabNo=""	;
	
	if(tab>0) { for (int i = 0; i < tab; i++) {	tabNo +="\t";}} //tab Nr.
		
	System.out.print(tabNo);
	
	System.out.printf("%s%n", line); //--------------------------------------Rahmenlinie oben
	
	for (int i = 0; i < text.length; i++) {
		System.out.print(tabNo);
		int strLen = text[i].length();
		
		int alignment_left = (linLen - strLen)/2;
		int alignment_right = (linLen - strLen)/2 + (linLen +2 - strLen)%2;
		
		String l = new String(new char[alignment_left]);
		String r = new String(new char[alignment_right]);
		System.out.printf("%s%s%s%n","|", l +text[i] +r ,"|");
	}
	System.out.print(tabNo);

	System.out.printf("%s%n", line); //--------------------------------------Rahmenlinie unter
}
//-------------------------------------------------------------	
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
//-------------------------------------------------------------		
	
	
}
