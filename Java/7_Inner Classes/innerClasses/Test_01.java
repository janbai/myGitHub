package innerClasses;
class Auto{
	private String hersteller = "VW";
	public Auto() {
		hersteller = "VW";
		this.hersteller = "VW";
		Auto.this.hersteller = "VW";
		
	}
	public Auto(String hersteller) {
		this.hersteller = hersteller;
	}
	
	class Motor{
		public void test() {
			System.out.println(hersteller);
			
		}
	}
}
public class Test_01 {

	public static void main(String[] args) {
		Auto auto = new Auto();
		Auto.Motor motor = new Auto().new Motor();
		motor.test();

		Auto auto2 = new Auto("BMW");
		Auto auto3 = new Auto("Opel");
		
		auto2.new Motor().test();
		auto3.new Motor().test();
		
		class Fahrzeug{
			void fahren() {
				System.out.println("test local.....");
			}
		}
		
		new Fahrzeug().fahren();
		
	}

}
