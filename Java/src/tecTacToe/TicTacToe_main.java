package tecTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe_main {
	
private static Scanner scanner;
private static int player= 1;

private static int eingabeNummer() 
{
	int p = 0;
	try 
	{
		scanner = new Scanner(System.in);
		p = scanner.nextInt();
		} 
	catch  
	(InputMismatchException e) 
	{
		System.out.println("Eingabefehler! Es soll doch eine Zahl sein!");
		}
	return p;
	}

private static int[] positionsNnummer(int x) 
{
	int[] pos= new int[2];
	int y= 0;
	
	for (int i = 0; i < 3; i++) 
	{
		for (int j = 0; j < 3; j++) 
		{ 
			y++;
			if(y ==x) 
			{
				pos[0] = i;
				pos[1] = j;
				break;
				}
			} 
		}
	return pos;
	}

	


	
public static void main(String[] args) 
{
	TicTacToe spiel = new TicTacToe();
	spiel.printwelcome();
	while (!spiel.istBrettspielVoll())
	{
		System.out.print("Spieler(" + player + ") wählen : ");
			
			int p= eingabeNummer();	
			int row = positionsNnummer(p)[0];
			int col = positionsNnummer(p)[1];
			boolean checkPlace = spiel.checkPlace(row, col); 
			spiel.placeMark(row, col);
			spiel.changePlayer();
			spiel.printBoard(); 
			
			if (spiel.checkGewinner()) { 
				System.out.println("***********************************************"); 
				System.out.println("**  Spieler " + player + " ist der Gewinner! Glückwunsch! **"); 
				System.out.println("***********************************************"); 
				System.exit(0);
				}
			else if (spiel.istBrettspielVoll()) 
			{
				System.out.println("Anscheinend haben wir ein Unentschieden!");
				System.exit(0);
				}
			if (checkPlace) player = (player ==1) ? 2 : 1;
	}
 								
}// end of main

}
