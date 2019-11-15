package copyTicTacToe;

//

//File: TicTacToe.java

//Auth: Brian W. Howell

//Date: 20 January 2014

//Desc: Tic-Tac-Toe driver initializes the MVC.

//



public class TicTacToe

{

public static void main( String[] args )

{

    TicTacToeView view = new TicTacToeView();

    TicTacToeModel model = new TicTacToeModel();

    @SuppressWarnings("unused")

    TicTacToeController controller = new TicTacToeController( view, model );

    view.setVisible( true );

}// end of main



} // end of class TicTacToe
	