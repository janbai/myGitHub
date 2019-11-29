package sudoku;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class TicTacToe_Main {
	
private static Controller message 	= new Controller();
public static int counter			= 0;
private static int player= 1;





private static Board board = new Board(9,9);

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
		
	
	
	board.set(0,2,'8');
	board.set(0,3,'7');
	board.set(0,8,'3');
	
	board.set(1,2,'1');
	board.set(1,5,'2');
	board.set(1,6,'8');
	board.set(1,7,'4');
	board.set(1,8,'9');

	board.set(2,2,'4');
	board.set(2,3,'6');
	board.set(2,4,'9');

	board.set(3,5,'3');
	board.set(3,6,'9');
	board.set(3,8,'5');
	
	board.set(4,0,'3');
	board.set(4,5,'9');
	board.set(4,8,'6');
	
	board.set(5,0,'6');
	board.set(5,5,'4');
	
	board.set(6,1,'5');
	board.set(6,3,'4');
	board.set(6,6,'3');
	board.set(6,7,'1');

	board.set(7,1,'1');
	board.set(7,4,'2');
	board.set(7,7,'8');
	
	board.set(8,4,'3');
	board.set(8,5,'5');
	board.set(8,6,'6');
	
	board.printBoard(); 
	
		
	}//end of main ********************************************************
static void playTecTacToe() {
	int playMode = 0;
	
	board.reset();
	
	counter=0;
	player= 1;
	board.printBoard(); 
	
	
}
//-------------------------------------------------------------------------------

	static  int solveBlock(List<Integer>x, List<Integer>y, List<Integer>z) {
		
//	if( (x[0]==y[0] || x[1]==2|| x[2]==3) && (y[0]==1 || y[1]==2 ) && (z[1]==1 || z[1]==2 ) ) 
				
			
		
		
		return (Integer) null;
	}
	




}//end of TicTacToe Classe
