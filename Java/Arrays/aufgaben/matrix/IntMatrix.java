package aufgaben.matrix;

import java.util.Arrays;
import java.util.Random;

public class IntMatrix {
	
	private int[][] values;
 
	public IntMatrix(int rows, int columns) {
		this.values = new int[rows][columns];
	
	}

	public IntMatrix( int rows , int  columns, int intiValue){
			this(rows,columns);
			for (int i = 0; i < values.length; i++) {
				for (int j = 0; j < values[i].length; j++) {
					values[i][j] = intiValue;
				}
			}
	}
	
	public IntMatrix( int rows , int  columns, int min, int max){
		this(rows,columns);
		Random random = new Random();
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				values[i][j] = random.nextInt(max-min)+ min;
			}
		}
}
	public static IntMatrix setValueInMatrix(IntMatrix array, int r, int c , int val){
		IntMatrix back = new IntMatrix(5,3);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				
			back.values[i][j] = array.values[i][j];
			if(i==r && j==c) {back.values[i][j] = val;}
				
			}
		}
		return back;
	}
	
	
	@Override
	public String toString() {
		// todo: StringBuilder einsetzen
		
		String text = "";
		
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				text = text + values[i][j];
				
				if(j < values[i].length-1) {
					text = text + ", "; 
				}
			}
			text = text + '\n';
		}
		
		return text;
	}
	
	

	
}
 