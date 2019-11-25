package trainingpool;



public class ABCD {
	
	static public void foo() {
	    String [] args = new String[2];
	    args[0] = "hello";
	    args[1] = "every";

	    System.out.println("Output: " + args[0] + args[1]);
	}
		
	
	public static void main(String[] args)  {
		
	String answer = "Y";
	
		System.out.println(answer.compareTo("y")==0); 
		System.out.println(answer.equalsIgnoreCase("y"));
		System.out.println(answer.equals("y"));
		
	}//end of main
}
