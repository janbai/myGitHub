package arbeitsblaetter;

public class Throwable_Exceptions {

	public static void main(String[] args) {

		try {
			System.out.println(5/0);
			//int [] arr = new int [1];
			//System.out.println(arr[1]);
			
		//	Integer x = null;
		//	int y =x; // x.intValue();
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		Throwable t1 = new ArithmeticException ("ae");
	RuntimeException rt1 = new NullPointerException("npe");
	
	
	System.out.println(rt1.getMessage());
		
	t1.printStackTrace();	
	rt1.printStackTrace();
	
	
	}

}
