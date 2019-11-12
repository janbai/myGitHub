package arbeitsblaetter;

public class testMathUtils {

	public static void main(String...strings) {
		// TODO Auto-generated method stub
		testAdd();
		testAddFailsOnIntegerOverflow();
		
	}
	static void testAdd() {
		int expected = 5;
		int actual = mathUtils.add(2, 5);
		
		if ( expected != actual) {
			throw new AssertionError("add: erwartet 7, aber:" + actual);
		}	
		System.out.println("add: OK");
	}
	
	
	static void testAddFailsOnIntegerOverflow() {
		try {
			mathUtils.add(1, Integer.MAX_VALUE);
			throw new AssertionError("OK");
		} catch (IllegalArgumentException e) {
			System.out.println("add mit OverFlow: OK" );
		}
		
		
	}
	
}
