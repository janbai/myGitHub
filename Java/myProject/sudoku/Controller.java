package sudoku;


import java.util.Arrays;
import java.util.List;


public class Controller {

public final char blank						= '-';	
public final char playerMark		 		= 'x'; 
public final char machineMark				='o';
public Integer[] validNumber 				= {1,2,3,4,5,6,7,8,9};
public Integer[] corners 					= {1,3,7,9}; 
public Integer[] sides 						= {2,4,6,8};
private Integer[] modeNumber					= {1,2,3};
private String [] validAnswer				= {"y", "yes", "j", "ja", "n","no","nein","nie"}; 
 
private List<Integer> legalNumbers 			= Arrays.asList(validNumber);
private List<Integer>legalMode				= Arrays.asList(modeNumber);
private List<String>legalAnswer				= Arrays.asList(validAnswer);

private final String illegalNumbers			= "Diese Nummer ist illegal!";	
private final String illegalMode			= "Diese Mode ist illegal!";
private final String illegalAnswer			= "Dieser Eintrag ist illegal!";

private final String mismatchInput 			= "Eingabefehler! Es soll doch eine Zahl sein!";
private final String mismatchMode 			= "Eingabefehler! Es soll doch 1, 2 oder 3 sein!";
private final String mismatchAnswer			= "Eingabefehler! Es soll doch y oder n sein!";

private final String tryAgain 				= "Versuchen Sie es noch einmal: ";
private final String gameDraw 				= "Anscheinend haben wir ein Unentschieden!";
private final String congratulation 		= "Herzliche Glückwünsche ! Du bist ein Gewinner";
private final String gameOver 				= "Game Over!";
private final String usedNumber				= "Diese Nummer ist besetzt.";
private String[] welcome 					= {"Willkommen", "im", "Tic Tac Toe"};
private String  chooseMode					= "Bitte wählen Sie den Spielemodus: ";
private String gameMode						= "Game Mode : [1]einfach, [2]mittel, [3] hart";
private String firstMessage 				= "Geben Sie bitte das Positionsnummer ein:";
private String [] wantcontinueExit			= {"willst du nochmal spielen?","[Y] Spiel nochmal", "zum Verlassen eine beliebige Taste drücken"};
private String goodbye						= "Danke, dass du das Tic Tac Toe Spiel benutzt. Bis später und auf Wiedersehen.";
public boolean isIllegalNumbers(int x) 		{ return (! legalNumbers.contains(x)) ?  true :  false;}
public boolean isIllegalMode(int x)			{ return (! legalMode.contains(x)) ?  true :  false;}
public boolean isLegalAnswer (String x)		{ return ( legalAnswer.contains(x)) ?  true :  false;}

public void illegalNumbers() 				{ boxBorder(illegalNumbers);}
public void illegalMode() 					{ boxBorder(illegalMode);}
public void illegalAnswer() 				{ boxBorder(illegalAnswer);}

public void mismatchInput() 				{ boxBorder(mismatchInput);}
public void mismatchMode() 					{ boxBorder(mismatchMode);}
public void mismatchString() 				{ boxBorder(mismatchAnswer);}

public void usedNumber() 					{ boxBorder(usedNumber);}
public void tryAgain() 						{ System.out.print(tryAgain);}
public void congradulation() 				{ boxBorder(congratulation);}
public void gameOver() 		 				{ boxBorder(gameOver);}
public void gameDraw() 		 				{ boxBorder(gameDraw);}
public void welcome () 						{ boxBorder( 10, 1, welcome);}
public void header () 						{ System.out.printf("%11s%33s%n","Spielfeld","Positionsnummer");}
public void rahmen() 						{ System.out.printf("%s%n","++-----------++-----------++-----------++");}
public void rahmen1() 						{ System.out.printf("%s%n","++===+===+===++===+===+===++===+===+===++");}
public void firstMassage () 				{ System.out.println(firstMessage);}
public void wantcontinueExit()				{ boxBorder(15,1,wantcontinueExit);}
public void goodbye()						{ boxBorder(goodbye);}

//-------------------------------------------------------------
public void chooseMode()					{ boxBorder(gameMode); System.out.print(chooseMode);}
//-------------------------------------------------------------
public void gameProcess(int player) 		
{
	if (player==1) {System.out.print("Spieler(" + player + ") choose nummber : ");}
	else { System.out.print("Spieler(" + player + ") I will choose : ");}
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
static void boxBorder( int alignment, int tab, String[] text) 
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

}//end of Controller
