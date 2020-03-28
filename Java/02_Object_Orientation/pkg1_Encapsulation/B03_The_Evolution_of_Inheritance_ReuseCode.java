package pkg1_Encapsulation;

/*
Elements of Types 				Classes 				Interfaces
------------------------------------------------------------------------
Instance variables 				Yes 					Not applicable
Static variables 				Yes						Only constants
Abstract methods				Yes						Yes
Instance methods				Yes						default methods
Static methods					Yes						inherited no, accessible yes 
Constructors					No						Not applicable 
Initialization blocks			No						Not applicable 
 */


// Reuse Code
class GameShape1 {   
	public void displayShape() {
		System.out.println("displaying shape");
		}   // more code } 
}

class PlayerPiece1 extends GameShape1 {   
	public void movePiece() {     
		System.out.println("moving game piece");
	}   // more code } 
}
 
public class B03_The_Evolution_of_Inheritance_ReuseCode {
	public static void main (String[] args) {
		PlayerPiece1 shape = new PlayerPiece1();
		shape.displayShape();
		shape.movePiece();   
		}
	}

