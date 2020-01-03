package Constructor_7_9_53_58_103;

class Vehicle {
String type = "4W";
int maxSpeed = 100;

Vehicle(String type, int maxSpeed) {
this.type = type;
this.maxSpeed = maxSpeed;
}

public Vehicle() {
	// TODO Auto-generated constructor stub
}
}
class Car extends Vehicle {
	String trans;
	
	
	Car(String trans) { // line n1
		super();
		this.trans = trans;
		}


	public Car(String type, int maxSpeed, String trans) {
	//	super(type, maxSpeed);
		this.trans = trans;
	}





}
public class Q007 {
//And given the code fragment:
public static void main(String[] args) {
Car c1 = new Car("Auto");
Car c2 = new Car("4W", 150, "Manual");
//System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
//System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
}
}