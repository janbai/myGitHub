package self_test;
class Rocket{
	public void blastoff(){ System.out.println("bang ");}
}
public class Shuttle extends Rocket {
	

	public static void main(String[] args) {
		new Shuttle().go();
	}//end of main
	void go() {
		blastoff();
	super.blastoff();
		
	}
public void blastoff() {System.out.println("sh-bang");}
	
}
