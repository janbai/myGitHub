package doWhile_20_21_22_110_132_140;

public class Q022 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
		
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		// int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; // Compilation fails
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c: x; 
		System.out.println("d= " + d);//100
		
		int e = (a < b) ? b : (a < c)? c : (b < c) ? b : c;
		System.out.println("e= " + e);//102
		
		int f = (a < b) ? a : (a < c)? c : (b < c) ? b : 0;
		System.out.println("f= " + f);//100
	}

}
