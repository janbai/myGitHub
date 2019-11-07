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
	
	public void set(int row, int column, int newValue) {
		values[row][column] = newValue;
	}
		
	public int get(int row, int column) {
		return values[row][column];
	}
	public int getCountRows() {
		return values.length;
	}
	
	public int getCountColumns() {
		return values[0].length;
	}
	
// equals -----------------------------------------------
	public boolean equals(Object obj) { 
		if (!(obj instanceof IntMatrix)) {
			return false;
		}
		IntMatrix m2 = (IntMatrix)obj;
		return equals(m2);
	}
	
public boolean equals(IntMatrix m2) { // Überladen der Methode mit der Signatur equals(Object)
		
		if(m2==null) {
			return false;
		}
		
		if( getCountRows() != m2.getCountRows() || getCountColumns() != m2.getCountColumns() ) {
			return false;
		}
	
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				if( get(row, col) != m2.get(row, col) ) {
					return false;
				}
			}
		}
		
		return true;
	}


// Print Object Array ------------------------------------------
			static void printfore (IntMatrix array) {
				for (int[] subArray : array.values) {
					for (int x : subArray) {
						System.out.print(x + " ");
					}
					System.out.println();
				}
			}// end of printfore
			
			static void printfor (IntMatrix array) {
				
				for (int i = 0; i < array.values.length; i++) {
					for (int j = 0; j < array.values[i].length; j++) {
						
						if(j < array.values[i].length-1) {
							System.out.print(array.values[i][j] + ", ");
							}else {
								System.out.print(array.values[i][j]);
							}
						}
					System.out.println();
				}
			}// end of printfor
			
			@Override
			public  String toString() {
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
			}//end of String toString
			
//----------------------------------------------------------	

	
}
 