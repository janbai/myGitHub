package nested;


class OuterA {
	
	private static int staticAtt = 1;
	private int att = 2;
	
	private static int getMax() { return 3; }
	
	public static class InnerA {
		private int getMax() { return 4; }
		
		public void test() {
			System.out.println("OuterA.staticAtt: " + OuterA.staticAtt);
			System.out.println("staticAtt: " + staticAtt);
			// System.out.println(att); // Compilerfehler
			//System.out.println("Outer.att: " + OuterA.att);Compilerfehler
			
			System.out.println( "getMax(): " + getMax() ); // 4
			System.out.println( "OuterA.getMax(): " +  OuterA.getMax()); // 3^
			
		}
	}
}



public class B02_StaticInner {

	public static void main(String[] args) {
		
//		InnerA i1; // Compilerfehler
		nested.OuterA.InnerA i1;
		OuterA.InnerA i2;

//		new InnerA(); // Compilerfehler
		new nested.OuterA.InnerA();
		new OuterA.InnerA();

		
		OuterA.InnerA i3 = new OuterA.InnerA();
		i3.test();
	}

}
