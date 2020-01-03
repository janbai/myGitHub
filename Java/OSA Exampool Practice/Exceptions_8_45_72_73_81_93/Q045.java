package Exceptions_8_45_72_73_81_93;

// OutOfMemoryError: Java heap space
import java.util.ArrayList;

public class Q045 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
		while (true) {
		myList.add("My String");
		}
		} catch (RuntimeException re) {
		System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
		System.out.println("Caught a Exception");
		}
		System.out.println("Ready to use");
		}
}