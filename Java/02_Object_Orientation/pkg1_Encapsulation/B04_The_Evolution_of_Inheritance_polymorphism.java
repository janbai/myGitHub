package pkg1_Encapsulation;
interface Animatable {
public void animate();
}

class GameShape {
public void displayShape() {
System.out.println("displaying shape");
}
// more code
}
/*
 * ■ PlayerPiece that passes the IS-A test for both the GameShape class and the Animatable interface
 * ■ 4 reference types: Object, GameShape, PlayerPiece, and Animatable
 * 
 */


class PlayerPiece extends GameShape implements Animatable{
public void movePiece() {
System.out.println("moving game piece");
}

@Override
public void animate() {
	System.out.println("animating...");
}

//more code

}
class TilePiece extends GameShape {
public void getAdjacent() {
System.out.println("getting adjacent tiles");
}
// more code
}
public class B04_The_Evolution_of_Inheritance_polymorphism {
	public static void main (String[] args) {
	PlayerPiece player = new PlayerPiece();
	TilePiece tile = new TilePiece();
	doShapes(player);
	doShapes(tile);
	
	Object o = player;
	GameShape shape = player;
	Animatable mover = player;
	shape.displayShape();
	player.displayShape();
	player.animate();
	
	
	}
public static void doShapes(GameShape shape) {// can be passed any subtype of GameShapes
	shape.displayShape();
}
}

