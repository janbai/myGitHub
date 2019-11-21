package ticTocToe_V01;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicTacToe_Main {
static Controller message = new Controller();
	
private static Scanner scanner;
static int player= 1;


private static int eingabeNummer() 
{
	int p = 0;
	while(p<1 || p>9) {
		try 
		{
			scanner = new Scanner(System.in);
			p = scanner.nextInt();
			if(message.legalNummbers(p)) 	{ message.IllegalNummbers(); message.tryAgain();}
		} 
		catch (InputMismatchException e)  	{ message.mismatchInput(); message.tryAgain();}
		}
	return p;
}

//--------------------------------Tec Tac Toe main----------------------------------------------------------------
	
public static void main(String[] args) throws InterruptedException {
		
		TicTacToe game = new TicTacToe();
		Board board = new Board(3,3);
		board.reset(); 
		message.welcome(board);
				
		Machine comp = new Machine();
		Position pos = new Position();
	
		while (!board.isBoardFull())
		{
			int row, col;
			int scnanner = 0;
			message.gameProcess(player);
			
			if (player==2) {
				//TimeUnit.SECONDS.sleep(1);
				System.out.println(board.getCellNo(pos));
				row = pos.getRow();
				col = pos.getColumn();
			}else 
			{
				scnanner= eingabeNummer();
				row = board.getCoordinate(scnanner)[0];
				col = board.getCoordinate(scnanner)[1];
			}
				boolean checkPlace = game.checkPlace(board, row, col); 
				game.placeMark(board, row, col);
				game.changePlayer();
				board.printBoard(); 
				
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
				
				if (checkPlace) player = (player ==1) ? 2 : 1;
				if (player == 2) pos = comp.strategy_01(board);
		}
		
	}//end of main

}
