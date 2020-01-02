package Constructor_007_053_058_103;

class Vehicle {
int x;

	Vehicle() {
		this(10); // line n1
	}
	Vehicle(int x) {
		this.x = x;
	}
}

class Car extends Vehicle {
	int y;
	
	Car() {
	//  line n2
	//	this(20); 	// 10:20
	//	super(20); 	// 20:0
	//	super();	// 10:0
		
	}

	Car(int y) {
		this.y = y;
	}

	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class Q053 {
	
	public static void main(String[] args) {
	
		Vehicle y = new Car();
		System.out.println(y);
}
}
