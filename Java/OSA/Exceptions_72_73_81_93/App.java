package Exceptions_72_73_81_93;
// Q073
public class App {
	String myStr = "7007";
	
	public void doStuff(String str) {
	int myNum = 0;
	//String myStr = ""; // myStr: 9009, myNum: 9009

	try {
	//	String myStr = str; // delete this row : myStr: 7007, myNum: 7007
		String myStr = str; // myStr: 7007, myNum: 9009

		myNum = Integer.parseInt(myStr);
	} catch (NumberFormatException ne) {
	System.err.println("Error");
	}
	
	System.out.println("myStr: " + myStr + ", myNum: " + myNum);
	}
public static void main(String[] args) {
App obj = new App();
obj.doStuff("9009");
}
}