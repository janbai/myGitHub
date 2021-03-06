package Q082;

public class TestField {
	int x;
	int y;

public void doStuff(int x, int y) {
	this.x = x;
	y = this.y;
}

public void display() {
	System.out.print(x + " " + y + " : ");
}
	public static void main(String[] args) {
		TestField m1 = new TestField();
		m1.x = 100; // line n1
		m1.y = 200; // line n2
		TestField m2 = new TestField();
		m1.doStuff(m1.x, m1.y); 
		m1.display();// 100 200 :
		m2.display();//  0 0 : 
		
		System.out.println();
		
		m2.doStuff(m1.x, m1.y); 
		m1.display();// 100 200 : 
		m2.display();// 100 0 : 
		System.out.println();
		m2.x = 100; 
		m2.y = 150; 
		m2.doStuff(m2.x, m2.y); 
		m1.display(); // 100 200 : 
		m2.display(); // 100 150 : 
	}
}