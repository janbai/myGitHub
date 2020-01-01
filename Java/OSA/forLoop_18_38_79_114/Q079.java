package forLoop_18_38_79_114;

public class Q079 {

	public static void main(String[] args) {
		int n [] [] = {{1, 3}, {2, 4}};

		print_1(n);
		
	}

	static void print_1(int[][] n) {
		
		System.out.println();
		for (int i = n.length-1; i >= 0; i--) {
		for (int y : n[i]) {
		System.out.print (y);
		}
		}
		
	}
}
