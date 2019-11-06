package aufgaben.matrix;

import java.util.Random;

public class AufgabeIntMatrix {

	

	public static void main(String[] args) {
Random random = new Random();

		IntMatrix m1 = new IntMatrix(2,3);
		IntMatrix m2 = new IntMatrix(5,3,100);
		IntMatrix m3 = new IntMatrix(5,3,random.nextInt(10));
		
		m2 =IntMatrix.setValueInMatrix(m2,1,2,500);
		IntMatrix m4 = new IntMatrix(5,3,100,200);
		System.out.println(m4);
	}

	
	
	

	


	
}
