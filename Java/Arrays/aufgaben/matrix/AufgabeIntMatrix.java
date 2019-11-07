package aufgaben.matrix;

import java.util.Random;

public class AufgabeIntMatrix {

	

	public static void main(String[] args) {


		IntMatrix m1 = new IntMatrix(2,3);
		IntMatrix m2 = new IntMatrix(5,3,100);
		IntMatrix m3 = new IntMatrix(5,3,100,200);
		
		System.out.println(m1);
		IntMatrix.printfor(m2);
		System.out.println("--------------");
		IntMatrix.printfor(m3);
		System.out.println("--------------");
		
		m2.set(1, 2, 500);
		IntMatrix.printfore(m2);
		System.out.println("--------------");
		
		int x = m3.get(1, 2);
		System.out.println("m3(1,2) = " + x);
		
		
		/*
		 * test equals
		 */
		
		IntMatrix m4 = new IntMatrix(2, 3);
		
		System.out.println("m1 und m4 sollten gleich sein. equals: " + m1.equals(m4));
		System.out.println("m1 und m2 sollten ungleich sein. equals: " + m1.equals(m2));
		
		m4.set(1, 2, 22);
		
		System.out.println("m1 und m4 sollten nicht mehr gleich sein. equals: " + m1.equals(m4));
		
		
		/*
		 * Arra mit Matrizen
		 */
		
		IntMatrix[] array = new IntMatrix[5];
		
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int rows = random.nextInt(9) + 2;
			int cols = random.nextInt(9) + 2;
			array[i] = new IntMatrix(rows, cols);
		}
		
		for(IntMatrix m : array) {
			System.out.println("*** Matrix ");
			System.out.println(m);
		}
		
		
		
		
	}// end of main

		
}
