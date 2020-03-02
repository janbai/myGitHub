package nested;

//Auto sollte auch public sein
class Auto {
	private String hersteller = "VW";
	
	public Auto() {
		hersteller = "VW";
		this.hersteller = "VW"; // dasselbe
		Auto.this.hersteller = "VW"; // dasselbe
		
		new Motor(); 
		this.new Motor(); // dasselbe 
		Auto.this.new Motor(); // dasselbe 
	}
	
	public Auto(String hersteller) {
		this.hersteller = hersteller;
		Auto.this.hersteller = hersteller; // dasselbe
	}

	public class Motor {
		public void test() {
			System.out.println("*** test");
			// System.out.println(this.hersteller);
			// System.out.println(Motor.this.hersteller);
			System.out.println("hersteller: " + hersteller);
			System.out.println("Auto.this.hersteller: " + Auto.this.hersteller);
		}
	}
}


public class B03_Inner_not_static {

	public static void main(String[] args) {
		Auto.Motor m1;
		
//		m1 = new Auto.Motor();
		m1 = new Auto().new Motor();
		m1.test(); // VW

		Auto.Motor m2 = new Auto("BMW").new Motor();
		m2.test(); // BMW
		
		Auto a1 = new Auto("Opel");
		Auto.Motor m3 = a1.new Motor();
		m3.test(); // Opel
	}

}
