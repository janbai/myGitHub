package Array_Q057;

public class Test {

	public static void main(String[] args) {

		int row = 1;
		int col = 3;
		
		int num[][] = new int[row][col];
		for (int i = 0; i < num.length; i++) {
		for (int j = 0; j < num[i].length; j++) {
		num[i][j] = 10;
		}
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("num[" + i +"][" + j +"] = " + num[i][j] );
			}
		}

	}

}
