package tecTacToe;

public class TicTacToe {
	
	private char[][] board;  
    private char currentPlayerMark; 
 
	public  TicTacToe() { 
	        board = new char[3][3]; 
	        currentPlayerMark = 'x'; 
	        resetBoard(); 
	   }
	    public void resetBoard() { 
	    	for (int i = 0; i < 3; i++) { 
	          for (int j = 0; j < 3; j++) { 
	               board[i][j] = '-'; 
	           } 
	    	}
	   } 

	   public void printBoard() { 
		   int y=1; 
		   
	       System.out.printf("%s%30s%n","-------------","-------------"); 
	       for (int i = 0; i < 3; i++) { 
	    	   int j=0;
	          System.out.print("| "); 

	           for (j = 0; j < 3; j++) { 
	               System.out.print(board[i][j] + " | "); 
	          } 
 	        	   System.out.printf("%18s","| ");   
	          
	        	   for (j = 0; j < 3; j++) { 
	        	   if (board[i][j] != '-') {
	        		   System.out.print(" " + " | "); 
	        		   y++;
	        	   }else {
	        		   System.out.print(y++ + " | "); 
	        	   }
  	          } 
	           System.out.println(); 
	           System.out.printf("%s%30s%n","-------------","-------------"); 
	        } 
	   } 
	   public boolean isBoardFull() { 
	       boolean isFull = true; 
	       for (int i = 0; i < 3; i++) { 
	           for (int j = 0; j < 3; j++) { 
	              if (board[i][j] == '-') { 

	                   isFull = false; 
	               } 
	           } 
	      } 
	       return isFull; 
	  } 

	   public boolean checkForWin() { 
	        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin()); 

	   } 
	
	   private boolean checkRowsForWin() { 
	       for (int i = 0; i < 3; i++) { 
	           if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) { 
	               return true; 
	            } 
	       } 

	        return false; 
	   }

	   private boolean checkColumnsForWin() { 
	      for (int i = 0; i < 3; i++) { 

	           if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) { 
	             return true; 
	            } 
	        } 
	      return false; 
 	    } 
  
	    private boolean checkDiagonalsForWin() { 
	      return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true)); 
	  } 
	    
	  private boolean checkRowCol(char c1, char c2, char c3) { 

	      return ((c1 != '-') && (c1 == c2) && (c2 == c3)); 
	    } 

	   public void changePlayer() { 
		   if (currentPlayerMark == 'x') {
			   currentPlayerMark = 'o';       
		   }else { 
		   		currentPlayerMark = 'x'; 
		   	} 
	   } 
	     
	    public boolean placeMark(int row, int col) { 
	    
	    	if (board[row][col] != '-')  {
	    		System.out.println("diese nummer ist ungültig, Versuchen Sie es noch einmal.");
            			return false;
           
	    	}else if ( (row >= 0) && (row < 3) && (col >= 0) && (col < 3) && (board[row][col] == '-')){	
           		board[row][col] = currentPlayerMark; 
           			return true; 
	    	}
	    	
	     return false;
 	     } 

	    public void printwelcome(){
	    	System.out.printf("%33s%n","+-------------------------+");
			System.out.printf("%33s%n","|      Willkommen im      |");
			System.out.printf("%33s%n","|       Tic Tac Toc       |");
			System.out.printf("%33s%n","|     für zwei Spieler    |");
			System.out.printf("%33s%n","+-------------------------+");
			System.out.println();
			System.out.printf("%11s%33s%n","Spielfeld","Positionsnummer");
			printBoard(); 
			System.out.println("Sie sind Spieler 1 und ich bin Spieler 2");
			System.out.println("Geben Sie bitte das Positionsnummer ein.");
			System.out.println();
		}
}
