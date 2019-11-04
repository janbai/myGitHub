package aufgaben;

public class AufgabeArrays2D {

	public static void main(String[] args) {


		int[][] arr = createArray(4, 5);
		printArray(arr);
		System.out.println("----------------------");
		
		arr[1][1]=5;
		printArray(arr);
		System.out.println("----------------------");
		
		int[][] arr1 = createArray(4, 5, 2);
		System.out.println("----------------------");
		
		setValue(arr,3);
		printArray(arr);
		System.out.println("----------------------");
		
		setValue(arr,0);
		printArray_ch(arr,',');
		
		System.out.println("----------------------");
		createBorderedArray(5, 5, 'x');
		System.out.println("----------------------");
		createBorderedArray(5, 5, '+');
		
		
	}// end of main
	
	static void createBorderedArray (int rows, int columns, char ch) {
		char [][] array = new char [rows][columns];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i>0 && j>0 && i<array.length-1  && j<array[0].length-1 ) {
					array[i][j] = ' ';
				} else {
					array[i][j] = ch;
				}
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}// end of createBorderdArray
	
	static void printArray_ch (int [][] array, char ch) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				if(j < array[i].length-1 ) System.out.print(ch +" ");
			}
			System.out.println();
		}
	}// end of printArray_ch
	
	static int [][] setValue(int [][]array , int value) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = value;
			}
		}
		return array;
	}// end of setValue
	
	static int[][] createArray (int rows, int columns, int value) {
		int [][] array = new int [rows][columns];
		for (int[] subArray : array) {
			for (int x : subArray) {
				x=value;
				System.out.print(x + " ");
			}
			System.out.println();
		}
		return array;
	}// end of createArray
	
	static void printArray(int [][] array) {
		for (int [] subArray : array) {
			for (int x : subArray) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}// end of printArray
	
static int [][] createArray(int rows , int columns){
	int [][] array = new int [rows][columns];
	return array;
}// end of createArray
}
