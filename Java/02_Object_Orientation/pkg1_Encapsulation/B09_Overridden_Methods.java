package pkg1_Encapsulation;

abstract class Parent{
	public void playChess() {
		System.out.println("Child playing chess with his parent");
		}
	
	public void playLego() {
		System.out.println("Child playing Lego with his parent ");
		}

	
	public abstract void doHomeWork();	// Parent ask children to do the homework
	/*
	 * 
	 * all Children subtypes should have a doHomeWork() method defined in a unique way
	 * child has no choice: You	must implement the method in the subtype
	 */
										
}
class Child extends Parent{
	
	public void playLego() {
		System.out.println("Child playing Lego ");
		}

	@Override				// so you have to come up with your own doHomeWork() method implementation!"
	public void doHomeWork() {
		System.out.println("Child doing his homework without his parents help");
	}
	
	public void goOutSide() {
		System.out.println("Child go outside with his parent");
	}
	
}


public class B09_Overridden_Methods {

	public static void main(String[] args) {
		Child Adam = new Child();
		Child Eva = new Child();
		Parent PJ = new Child();
		Adam.doHomeWork();
		Eva.playLego();
		
		Adam.playChess();
		Adam.playLego();
		Adam.goOutSide();
		PJ.goOutSide();// PJ cannot go outside alone witout his parents
	}

}
