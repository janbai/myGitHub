package functional_Interface;

import static org.junit.Assert.assertTrue;

import java.util.function.BiPredicate;

import org.junit.Test;

public class PredicateTest {
	@Test
	 public  void BiPredicate_whichIsBigger() {       
	        BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
	        assertTrue(isBigger.test(5, 4));
	        assertTrue(isBigger.negate().test(4, 5));
	    }
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isBigger = (x, y) -> x > y;
        assertTrue(isBigger.test(5, 4));
        assertTrue(isBigger.negate().test(4, 5));
	}

}
