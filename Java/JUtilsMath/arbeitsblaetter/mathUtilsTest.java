package arbeitsblaetter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mathUtilsTest {

	@Test
	void testAdd() {
		int expected = 5;
		int actual = mathUtils.add(2, 3);
	//	assertEquals(expected, actual);
		assertEquals(expected, actual,"2 + 3 muss doch ergeben");
		
	}
@Test
	void testAddExceptions() {
		assertThrows(IllegalArgumentException.class, () -> {
			mathUtils.add(1, Integer.MAX_VALUE);
		});
	}
	
}
