package ticTocToe_V01;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TicTacToe_Main {
	
private static Controller message = new Controller();

//private static Scanner scanner = new Scanner(System.in);

private static int player= 1;
private static TicTacToe game = new TicTacToe();
private static Board board = new Board(3,3);
private static Model model	= new Model();
private static Machine comp = new Machine();
private static Position pos = new Position();

private static int inputNr() 
{
Scanner scanner = new Scanner(System.in);
	int p = 0;
	while(p<1 || p>9) {
		try {   p = scanner.nextInt();
			if(message.legalNummbers(p)) 	{ message.IllegalNummbers(); message.tryAgain();}} 
		catch (InputMismatchException e)  	{ message.mismatchInput(); message.tryAgain();}}
	return p;
}
	
//--------------------------------Tec Tac Toe main----------------------------------------------------------------
	
public static void main(String[] args) throws InterruptedException {
		
		
		message.welcome();
		
		board.reset();
		board.printBoard(); 
		message.firstMassage();
		
		startPlay();
		
		
	}//end of main

static void startPlay () {
	
	
	while (!board.isBoardFull())
	{
		int row, col;
		int scanner = 0;
		message.gameProcess(player);
	
		if (player==2) {
			System.out.println(model.getCellNo(pos));
			row = pos.getRow();
			col = pos.getColumn();
		}else 
		{
			scanner= inputNr();
			row = model.getCoordinate(scanner)[0];
			col = model.getCoordinate(scanner)[1];
		}
		
			boolean checkPlace = game.checkPlace(board, row, col); 
			game.placeMark(board, row, col);
			game.changePlayer();
			board.printBoard(); 
			
			playStatus(row, col);
			
			if (checkPlace) player = (player ==1) ? 2 : 1;
			if (player == 2) pos = comp.strategy(board);
	}
}
static void playStatus(int row, int col) {
	
	
	if (game.checkGewinner(board) && player == 1) 
	{ 
		message.congradulation();
		System.exit(0);
	}else if (game.checkGewinner(board) && player == 2) 
	{
		message.gameOver();
		System.exit(0);
	}
	else if (board.isBoardFull()) 
	{
		message.gameDraw();
		System.exit(0);
	}
	
}



}
