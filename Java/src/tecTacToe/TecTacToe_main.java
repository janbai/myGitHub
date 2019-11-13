package tecTacToe;

import java.util.Scanner;

public class TecTacToe_main {
	private static  void position() {
		int[] pos= new int[2];
		int x = 0;
		Scanner sc = new Scanner( System.in );
		x = sc.nextInt();
		
	int y= 0;
	for (int i = 1; i <= 3; i++) { 
        for (int j = 1; j <= 3; j++) { 
        	if(x < y++) System.out.println(x + "(" + j + " " + i + ")");
                   
              
           
         
          
        } 
       
   } 
	
	
		//System.out.println(pos[0] +" " +  pos[1]);
		 //return pos;
	//System.out.println(y);
	}
	
	
	public static void main(String[] args) {
TicTacToe game = new TicTacToe(); 
		
		game.placeMark(0,0); 
		game.printBoard(); 

		while (!game.isBoardFull()){
			position();
			
			if (game.checkForWin()) { 
				System.out.println("We have a winner! Congrats!"); 
					System.exit(0); 
						} else if (game.isBoardFull()) { 
							System.out.println("Appears we have a draw!"); 
								System.exit(0); 
									game.changePlayer(); 
			}
		}
		if (game.checkForWin()) { 
			System.out.println("We have a winner! Congrats!"); 
				System.exit(0); 
					} else if (game.isBoardFull()) { 
						System.out.println("Appears we have a draw!"); 
							System.exit(0); 
								game.changePlayer(); 
			// Repeat steps again for placing mark and checking game status... 
								
		}
 
		
		
		
	}
}
