package Casting_4_27_44_51_55_66_96_107_142;

public class Q004 {

	public static void main(String[] args) {
		// Q004
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2; // line n1
		
	//	String s4 = (String) (s3 * s2); // line n2 compiler failer
	//	System.out.println("Sum is " + s4);
		Double s5 = 15.00;
		int s6 = (int) (s5*s2);
	//	int s7 = (int) s5; //compiler failer 
		
		int s8 =  s1;
		int s9 = (int) (s1*s5);
		System.out.println(s9 );
		
	//	Long s10 = (Integer)s1 +s2;// compiler failer
			}
}
