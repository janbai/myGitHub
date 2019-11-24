package trainingpool;

public class Question_002 {

	

	    static String s = "";

	    public static void m0(int a, int b) {
	        s += a;
	        m2();
	        m1(b);
	    }

	    public static void m1(int i) {
	        s += i;
	    }

	    public static void m2() {
	        throw new NullPointerException("aa");
	    }

	    public static void m() {
	        m0(1, 2);
	        m1(3);
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            m();
	        } catch (Exception e) {
	        }
	        System.out.println(s);
	
	}

}
