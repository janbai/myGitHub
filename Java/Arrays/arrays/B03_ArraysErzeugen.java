package arrays;

public class B03_ArraysErzeugen {

	public static void main(String[] args) {
	
		/* 
		 * Variante 1
		 */
		int [] arr1 = new int [3];
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;
		
		/* 
		 * Variante 2
		 */
		
		int [] arr2 = {11, 12, 13};
		int[] arr2a = {11, 12, 13, };
		int[] arr2b = {11,
					   12,
					   13,
		};

		/*
		 * Variante 3
		 */
 		int[] arr3 = new int [] {13, 14, 15};
 		sum(arr1);
 		System.out.println(sum(arr1));
 		
 		int sum= sum(arr1);
 		System.out.println(sum);
 		sum= sum(arr2);
 		System.out.println(sum);
 		
//		sum( 12, 13, 14 ); // Compilerfehler. dafür gibt es var-args (später)
		
//		sum( {12, 13, 14} ); // Compilerfehler
 		
 		sum= sum(new int[] {12, 13, 14});
 		System.out.println(sum);
		
 		/*
		 * Unterschide beim Zuweisen
		 */
		
		int[] arr4;
 		arr4 = new int [3];
 	//	arr4 = {0, 0, 0}; // Compeilerfehler: geht nur beim sofortigen Initialisierung
		arr4 = new int [] {0, 0, 0};
		
		
	}//end of main
	
	static int sum(int[] array) {
		int result = 0;
		
		for (int i : array) {
			result +=i;
		}
		return result;	
		}
		
		
	

}
