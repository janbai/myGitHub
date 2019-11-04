package arrays;

class Giraffe{
	String name = "Phelix";
}

public class B07_MehrdiumArraysNochmal {

	public static void main(String[] args) {

		int [] arr1; // 0 Object;
		int [][] arr2 = new int [5][]; // 1 Object
		int [][][][][][] arr3 = new int [2][][][][][]; // 1 Object
		int [][][] arr4 = new int [2][3][4]; // 1 + 2 + 2*3 = 9 Objecte
		int [][][] arr5 = new int [3][2][6]; // 1 + 3 + 3*2 = 10 Objecte
		
		String [] arr6 = new String [3]; // 1 Object
		String [][][] arr7 = new String [3][2][5]; // 10 Objecte
		
		Giraffe [] arr8 = new Giraffe [10]; // 1 Object
		arr8[0] = new Giraffe();
		Giraffe [][] arr9 = new Giraffe [1][2]; // 1+ 1 = 2 Objecte
	//	arr9[1] = arr8; // ArrayIndexOutOfBoundsException
		arr9[0] = arr8;
		
		System.out.println(arr8[0]);  // array address
		System.out.println(arr9[0][0]); // array address
		
		System.out.println(arr8[0].name);
		System.out.println(arr9[0][0].name);
		
		
	}

}
