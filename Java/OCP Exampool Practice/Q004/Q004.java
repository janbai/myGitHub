package Q004;
class A {
	  int a = 5;
	  String doA() { return "a1 "; }
	  protected static String doA2() { return "a2 "; }
	}

	class B extends A {
	  int a = 7;
	  String doA() { return "b1 "; }
	  public static String doA2() { return "b2 "; }

	  void go() {
	    A myA = new B();
	    System.out.print(myA.doA() + myA.doA2() + myA.a);
	   
	    B myB = new B();
	   System.out.println();
	    System.out.print(myB.doA() + myB.doA2() + myB.a);
	    try {
	    	 System.out.println();
	    	 B myBA = (B) new A();
			  
			    System.out.print(myBA.doA() + myBA.doA2() + myBA.a);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	   
	  }

	  
	}
public class Q004 {

	public static void main(String[] args) {
	    new B().go();
	  }

}
