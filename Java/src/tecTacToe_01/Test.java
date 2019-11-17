package tecTacToe_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	static char[][] board = {{'o','x','o'},{'x','-','x'},{'o','x','o'}};
	
	
	
	public static void main(String[] args) {
		TicTacToe spiel = new TicTacToe();
		spiel.printwelcome();
	/*	Board board = new Board(3,3);
		board.reset();
		board.printBoard();
		
		char aktuelleSpielermarke = 'o';
		
		Maschine comp = new Maschine();
			
		
	*/	
		
	}//end of main
	
	
	/*
	for (int i = 0; i < brettspiel.length; i++) {
		for (int j = 0; j < brettspiel[0].length; j++) {
			System.out.print(brettspiel[i][j] + " ");
		}
		System.out.println();
	}
	
	char aktuelleSpielermarke = 'o';
	
	Maschine comp = new Maschine();
	int[] checkRow = comp.checkRows(aktuelleSpielermarke, brettspiel);
	System.out.println("-------------");
	System.out.println(checkRow[0] + "|" + checkRow[1]);
	
	int[] checkCol = comp.checkColumns(aktuelleSpielermarke, brettspiel);
	System.out.println("-------------");
	System.out.println(checkCol[0] + "|" + checkCol[1]);
	
	
	int[] checkDia = comp.checkDiagonal(aktuelleSpielermarke, brettspiel);
	System.out.println("-------------");
	System.out.println(checkDia[0] + "|" + checkDia[1]);
	
			
	for (int i = 1; i < 10; i++) {System.out.println(i + " <Opposite> " + comp.getOpposite(i));}
		
	for (int i = 1; i < 10; i++) {System.out.println(i + " <IsCenter> " + comp.IsCenter(i));}
	for (int i = 1; i < 10; i++) {System.out.println(i + " <isCorner> " + comp.IsCorner(i));}
	for (int i = 1; i < 10; i++) {System.out.println(i + " <IsSide> " + comp.IsSide(i));}
	*/
	
	
	
}
