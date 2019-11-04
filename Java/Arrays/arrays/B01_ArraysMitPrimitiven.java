package arrays;

public class B01_ArraysMitPrimitiven {

	public static void main(String[] args) {
		
		int [] arr1 = new int [100];
		
	
		System.out.println(arr1[1]);
	// System.out.println(arr1[100]); // ArrayIndexOutOfBoundsException
		
		short [] arr2 =  {1,2,3}; // // Geht mit int-Literalen
		System.out.println(arr2); // address of the array
		
		short x = 2;
		short [] arr3 = { 1 , x , 3}; 
		System.out.println(arr3[1]);
		
		int y = 3;
	//	short [] arr4 = { 1, 2, y}; // Unresolved compilation problem: Exception:Type mismatch: cannot convert from int to short
	
		//  int[]arr4 = new short[50]; //   Type mismatch: cannot convert from short[] to int[]
		//  short []arr5 = new int [10]; // Type mismatch: cannot convert from int[] to short[]
			
		
		
	}

}
