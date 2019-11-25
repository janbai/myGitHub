package ticTocToe_V01;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TicTacToe_Main {
	
private static Controller message 	= new Controller();
public static int counter			= 0;
private static int player= 1;




private static TicTacToe game = new TicTacToe();
private static Board board = new Board(3,3);
private static Model model	= new Model();
private static Machine comp = new Machine();
private static Position pos = new Position();
private static Scanner scanner;

private static int inputInt(int From, int To) 
{
	int p = 0;
	while(p<From || p>To) {
		try 
		{
			scanner = new Scanner(System.in);
			p = scanner.nextInt();
			if (To ==9) {if(message.isIllegalNumbers(p)) 	{ message.illegalNumbers();; message.tryAgain();}}
			if (To ==3) {if(message.isIllegalMode(p)) 	{ message.illegalMode(); message.tryAgain();}}
		} 
		catch (InputMismatchException e)  	
		{
			if (To ==9) {message.mismatchInput(); message.tryAgain();}
			if (To ==3) {message.mismatchMode(); message.tryAgain();}
		}
	}
	return p;
}
private static String inputStr() 
{
	
	scanner = new Scanner(System.in);
	String answer = scanner.next().toLowerCase().substring(0,1);
	return answer;
}

//******************************Tec Tac Toe main**************************
	
public static void main(String[] args) throws InterruptedException {
		
	
		message.welcome();
		playTecTacToe();
		
		
	}//end of main ********************************************************
static void playTecTacToe() {
	int playMode = 0;
	
	board.reset();
	game.currentActualMark = message.playerMark;
	counter=0;
	player= 1;
	board.printBoard(); 
	message.chooseMode();
			
	playMode= inputInt(1,3);
			
	message.firstMassage();
	startPlay(playMode);
	
}
//-------------------------------------------------------------------------------
static void startPlay (int playMode) {
	
	
	
	int row, col;
	int scanner = 0;
	
	while (!board.isBoardFull())
	{
		
		message.gameProcess(player);
			counter ++;
		if (player==2) {
			System.out.println(model.getCellNo(pos));
			row = pos.getRow();
			col = pos.getColumn();
		}else 
		{
			scanner= inputInt(1,9);
			row = model.getCoordinate(scanner)[0];
			col = model.getCoordinate(scanner)[1];
		}
		
			boolean checkPlace = game.checkPlace(board, row, col); 
			game.placeMark(board, row, col);
			game.changePlayer();
			board.printBoard(); 
			System.out.println("counter =" + counter);
			playStatus(row, col);
			
			if (checkPlace) player = (player ==1) ? 2 : 1;
			
			if (player == 2) 
			{
					switch(playMode)
					{
					case 1: 
						pos = comp.easyMode(board);break;
					case 2:
						pos = comp.mediumMode(board); break;
					case 3:
						pos = comp.hardMode(board,counter); break;
					}
			}
				
	}
}
//-------------------------------------------------------------------------------
static void playStatus(int row, int col) {

	if (game.checkGewinner(board) && player == 1) 
	{ 
		message.congradulation();
		wantToContinueExit();
		}else if (game.checkGewinner(board) && player == 2) 
	{
		message.gameOver();
		wantToContinueExit();
		}
	else if (board.isBoardFull()) 
	{
		message.gameDraw();
		wantToContinueExit();
		}
}
//------------------------------------------------------------------------------

static void wantToContinueExit() {
	
	message.wantcontinueExit();
	String answer = inputStr();

	if (answer.compareTo("y")==0) //if (answer.equalsIgnoreCase("y"))// if (answer.equals("y"))
	{ 
		playTecTacToe();
		
	}else {
		message.goodbye();
		System.exit(0);
	}
}




}//end of TicTacToe Classe
