package aufgaben;

import java.util.Random;


public class AufgabeArrays {

	public static void main(String[] args) {
		
		
		int[] arr = createArray(2, 15, 30);
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		printArray(arr);
		
		char[] umlaut = deutscheUmlaute();
		String umlautToString = java.util.Arrays.toString(umlaut);
		System.out.println(umlautToString);
		
		char[] buchstaben = deutscheBuchstaben();
		String buchstabenToString = java.util.Arrays.toString(buchstaben);
		System.out.println(buchstabenToString);
		
		
		
		
	}//End of main

	static char[] deutscheBuchstaben() {
		System.out.println("#### A4");
		int len = 'z' - 'a' + 5;
		char [] letters = new char [len];
		for (char ch = 'a'; ch <= 'z'; ch++) {
			letters[ch - 'a'] = ch;
		}
		letters[len -4] ='ä';
		letters[len -3] ='ö';
		letters[len -2] ='ü';
		letters[len -1] ='ß';
		
		return letters;
	}
	
static char [] deutscheUmlaute() {
	System.out.println("#### A3");
	return new char[] { 'ä', 'ö', 'ü' };
}
	
static void printArray(int[] array) {
	System.out.println("#### A2");
	for (int x : array) {
		System.out.print(x + " ");
	}
	System.out.println();
}//End of printArray

static int [] createArray(int min, int max, int length) {
	System.out.println("#### A1");
	int [] newArray = new int [length];
	Random random = new Random();
	for (int i = 0; i < newArray.length; i++) {
		newArray[i] = random.nextInt(max - min ) + min;	
	}
	return newArray;
}//end of createArray


}
