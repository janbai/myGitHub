package doWhile_20_21_22_110_132_140;

public class Q020 {

	public static void main(String[] args) {
		 int x = 5;
		  while (isAvailable(x)) {
	//		  System.out.print(x);  
	//		System.out.print(x); --x; 	//54321
	// 		System.out.print(x); x--; 	//54321
	// 		System.out.print(x--);		//54321
	// 		System.out.print(--x);		//43210
	// 		--x; System.out.print(x); 	//43210	 
		  
		  } 
	}
		  public static boolean isAvailable(int x) {
			   return x-- > 0 ? true : false;
			  // return (x > 0) ? false: true; //  while loop will not be executed
			   }
}
