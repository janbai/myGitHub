package thread.anfang;

class IncrementValue{
	private int value;
	public synchronized void increment() {
		value++;
	}
	public int getValue() {
		return value;
	}
}



class IncrementStaticValue{
	private static int value;
	public synchronized static void increment() {
		
			value++;
		
		
	}
	
	public static int getValue() {
		return value;
	}
}
public class Synchonrized_Methode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
