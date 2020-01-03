package plusplus_22_138;

public class Q023 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; // Compilation Fail
		int d = (a < b) ? (a < c) ? a : (b < c) ? b :c : a ;
		System.out.println(d);

	}

}
