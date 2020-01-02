package doWhile_20_21_110_132_140;

public class Q132 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50 };
		int x = array.length;
		printArray_1(array,x); // 50 40 30 20 10 
	//	printArray_2(array,x); // ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
	//	printArray_3(array,x); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	//	printArray_4(array,x); // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		printArray_5(array,x);
		

	}

	static void printArray_1(int[] array,int x) {
		
		while (x > 0) {
			x--;
			System.out.print(array[x] + " ");
			}
		System.out.println();
	}
	
static void printArray_2(int[] array,int x) {
		
	do {
		x--;
		System.out.print(array[x] + " ");
		} while (x >= 0);// while (x >= 1)
	System.out.println();
	}

static void printArray_3(int[] array,int x) {
	
	while (--x >= 0) { // while (--x >= 0) and delete the x-- *
		System.out.print(array[x] + " ");
		x--; // *
		}
	System.out.println();
}

static void printArray_4(int[] array,int x) {
	
	do {
		//  --x; insert here and while (x > 0)
		System.out.print(array[x] + " ");
		
		} while (x >= 0); 
	System.out.println();
}

static void printArray_5(int[] array,int x) {
	
	while (x > 0) {
		System.out.print(array[--x] + " ");
		}
	System.out.println();
}

}
