package innerClasses;
class Zoo{
	
	class Hund{
		public String toString() { return "Hund aus dem Zoo: " + Zoo.this;}
	}
	
	static class Katze{}
	
	Object att = new Object() {
		public String toString() { return "Object aus dem Zoo " + Zoo.this;}
	};
	
	static Object  staticAtt = new Object() {};
	
	static void staticMethod() {
		class Affe{}
		new Object() {};
	}
	
	void Method() {
	class Zebra{
		public String toString() { return "Zebra aus dem Zoo: " + Zoo.this;}
		
	}
	
	new Object() {
		public String toString() { return "Object aus dem Zoo: " + Zoo.this;}
	};
	}
}


public class Test_05 {

	public static void main(String[] args) {
			
		new Zoo().new Hund();
		new Zoo.Katze();
		Object x = new Zoo().att;
		System.out.println(x);
		Object y = Zoo.staticAtt;
	}

}
