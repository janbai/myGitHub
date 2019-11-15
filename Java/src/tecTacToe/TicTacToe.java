package tecTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class TicTacToe {
	

void ungültigeNummer() 	{System.out.println("diese Nummmer ist ungültig, Versuchen Sie es noch einmal.");}
void rahmen()			{System.out.printf("%s%30s%n","-------------","-------------"); }	
	
private char[][] brettspiel;  
private char aktuelleSpielermarke; 
final Integer[] a1 = {1,3,7,9}; 
final Integer[] a2 = {2,4,6,8};
final int center = 5;
final List<Integer> corners =  Arrays.asList(a1);
final List<Integer> sides =  Arrays.asList(a2); 


public TicTacToe()
{ 
    brettspiel = new char[3][3]; 
    aktuelleSpielermarke = 'x'; 
    resetBoard();
    }

Integer getOpposite(int x) 	{ return 10-x;}
Boolean IsCorner (int x) 	{ return false;}
Boolean IsSide (int x) 		{ return false;}
Boolean IsCenter (int x) 	{ return false;}
 
 
 


 
public void resetBoard() { 
		
	for (int i = 0; i < 3; i++) 
	{ 
	    for (int j = 0; j < 3; j++)
	    { 
	     brettspiel[i][j] = '-';
	     }
	    }
	} 

public void printBoard()
{ 
int y=1; 
int j=0;
	rahmen();
	
	for (int i = 0; i < 3; i++)
		{
		System.out.print("| "); 
		
		for (j = 0; j < 3; j++)
			 { 
			 System.out.print(brettspiel[i][j] + " | "); 
			 }
		
		System.out.printf("%18s","| ");
		        
		for (j = 0; j < 3; j++) 
		{
			if (brettspiel[i][j] != '-') {
				System.out.print(" " + " | "); 
				y++;
			}else {
				System.out.print(y++ + " | "); 
			}
		}
		System.out.println(); 
		rahmen();
		}
	} 
	   
public boolean istBrettspielVoll() 
{ 
	boolean istVoll = true;
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{ 
			if (brettspiel[i][j] == '-') 
			{
				istVoll = false;
				}
			}
		}
	return istVoll;
	} 

public boolean checkGewinner() 
{
	return(	checkZeilen() || checkSpalten() || checkDiagonalen());
	} 

private boolean checkZeilen() 
{
	for (int i = 0; i < 3; i++) 
	{
		if (checkRowCol(brettspiel[i][0], brettspiel[i][1], brettspiel[i][2]) == true) 
		{
			return true;
		} 
	 }
	return false;
	}

private boolean checkSpalten()
{
	for (int i = 0; i < 3; i++) 
	{
		if (checkRowCol(brettspiel[0][i], brettspiel[1][i], brettspiel[2][i]) == true) 
		{
			return true;
			} 
		}
	return false;
	} 
  
private boolean checkDiagonalen()
{
	return (	(checkRowCol(brettspiel[0][0], brettspiel[1][1], brettspiel[2][2]) == true) 
			 ||	(checkRowCol(brettspiel[0][2], brettspiel[1][1], brettspiel[2][0]) == true));
	} 
	    
private boolean checkRowCol(char c1, char c2, char c3) 
{ 
	return ((c1 != '-') && (c1 == c2) && (c2 == c3));
	} 

public void changePlayer() 
{ 
	aktuelleSpielermarke = (aktuelleSpielermarke == 'x') ? 'o' : 'x';
	} 
	     
public boolean checkPlace(int row, int col) 
{ 
	if (brettspiel[row][col] != '-')  
	{
		
		return false;
		}
	else if	( (row >= 0) && (row < 3) && (col >= 0) && (col < 3) && (brettspiel[row][col] == '-'))
	{
		
		return true;
		}
	return false;
	} 
public void placeMark(int row, int col) 
{
	if (checkPlace(row,col)) 
		brettspiel[row][col] = aktuelleSpielermarke;
	else ungültigeNummer();
	
	
}

public void printwelcome()
{
	System.out.printf("%33s%n","+-------------------------+");
	System.out.printf("%33s%n","|      Willkommen im      |");
	System.out.printf("%33s%n","|       Tic Tac Toc       |");
	System.out.printf("%33s%n","|     für zwei Spieler    |");
	System.out.printf("%33s%n","+-------------------------+");
	System.out.println();
	System.out.printf("%11s%33s%n","Spielfeld","Positionsnummer");
	printBoard(); 
	System.out.println("Geben Sie bitte das Positionsnummer ein.");
	System.out.println();
	}
}
