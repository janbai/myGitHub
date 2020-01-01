package plusplus_22_138;

public class Q138 {
	public static void main(String[] args) {
	int x = 1;
	int y = 0;
	
	if (x++ > ++y) {
		System.out.print("Hello ");
	} else {
		System.out.print("Welcome ");
	}
	
		System.out.print("Log " + x + ":" + y);
	}
}