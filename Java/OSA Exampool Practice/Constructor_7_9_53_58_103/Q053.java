package Constructor_7_9_53_58_103;

class Vehicle1 {
int x;

	Vehicle1() {
		this(10); // line n1
	}
	Vehicle1(int x) {
		this.x = x;
	}
}

class Car1 extends Vehicle1 {
	int y;
	
	Car1() {
	//  line n2
	//	this(20); 	// 10:20
	//	super(20); 	// 20:0
		// 10:0
	
		this(20); 
		
	}

	Car1(int y) {
		this.y = y;
	}

	public String toString() {
		return super.x + ":" + this.y;
	}
}

public class Q053 {
	
	public static void main(String[] args) {
	
		Vehicle1 y = new Car1();
		System.out.println(y);
}
}
