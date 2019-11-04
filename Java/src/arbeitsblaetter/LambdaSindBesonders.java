package arbeitsblaetter;


interface MyFuncInterface {
	String getString();
}


public class LambdaSindBesonders {

	public static void main(String[] args) {


		class Montag{

			@Override
			public String toString() {
				return "Montag /toString/this: " + this.getClass().getName();
			}
			
		}
System.out.println(new Montag());

Object obj = new Object() {
	@Override
	public String toString() {
		return "Anonyom/toString/this-Klassename:" + this.getClass().getName();
	}
};

System.out.println(obj);

MyFuncInterface var = () -> "Lambda/toString/hat kein this!: "; // + this.getClass().getName();

System.out.println(var.getString());

new LambdaSindBesonders().test();
	}

	void test() {
		MyFuncInterface var = () -> "this des äußern Object: "+ this.getClass().getName();
		System.out.println(var.getString());
	}

}
