package synchronization;
 
public class Test {

	public static void main(String[] args) throws ClassNotFoundException {

classMethod();

	}
	static void classMethod() throws ClassNotFoundException {
		Class cl = Class.forName("Test");
		synchronized (Test.class) {
		System.out.println("Hello");
		}
		}
}
