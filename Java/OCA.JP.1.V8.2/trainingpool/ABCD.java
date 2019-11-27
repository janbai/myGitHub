package trainingpool;



public class ABCD {
	
	public static final int MIN = 1;
	
	public static void main(String[] args)  {
		int x = args.length;
		System.out.println(x);
		
		if (checkLimit(x)) { // line 1
		System.out.println("Java SE");
		} else {
		System.out.println("Java EE");
		}
		System.out.println(x);
		
		for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
	}//end of main

public static boolean checkLimit(int x) {
	return (x >= MIN) ? true : false;
	}
}
