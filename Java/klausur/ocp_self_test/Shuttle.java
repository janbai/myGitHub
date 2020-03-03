package ocp_self_test;


	class Rocket {
		private void blastOff() { System.out.print("bang "); }
		}
	
public class Shuttle extends Rocket {
	
	public static void main(String[] args) {
		new Shuttle().go();
		
	}//end of main
	
void go() {
	blastOff();
	//Rocket.blastOff(); // line A
}
	
private void blastOff() {
	System.out.print("sh-bang "); 
	}
}