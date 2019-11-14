package tecTacToe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe_main {
	
	private static Scanner scanner;


	private static int move() {
		int p = 0;
		try {
			scanner = new Scanner(System.in);
			p = scanner.nextInt();
		} catch  (InputMismatchException e) {
			System.out.println("Eingabefehler! Es soll doch eine Zahl sein!");
			
		}
		return p;
	}
	
	private static int[] position(int x) {
		int[] pos= new int[2];
		int y= 0;
		for (int i = 0; i < 3; i++) { 
		    for (int j = 0; j < 3; j++) { 
		    	y = y + 1; 
		    	if(y ==x) {
		    		pos[0] = i;
		    		pos[1] = j;
		    		
		    			break;
		    	}
		     } 
		}
	return pos; 
	}
	
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe(); 
		game.printwelcome();
		 int player= 1;
		while (!game.isBoardFull()){
			System.out.print("Spieler(" + player + ") wählen : ");
			
			int p= move();	
			int row = position(p)[0];
			int col = position(p)[1];
			boolean b = game.placeMark(row,col); 
			game.changePlayer();
			game.printBoard(); 
			
			if (game.checkForWin()) { 
				System.out.println("*******************************************"); 
				System.out.println("**  Wir haben einen Sieger! Glückwunsch! **"); 
				System.out.println("*******************************************"); 
					System.exit(0); 
						} else if (game.isBoardFull()) { 
							System.out.println("Anscheinend haben wir ein Unentschieden!"); 
								System.exit(0);
			}
			 
			if (b) {if (player== 1 ){player=2;}else { player=1;}}}
 								
}// end of main

}
