package functional_Interface;

class Activate implements Runnable{

	@Override
	public void run() {
	System.out.println("run from class implements Runnable..........");
		
	}
	
	
}
public class Runnable_Interface {

	public static void main(String[] args) {
		
		
		activate( () -> {
			System.out.println("Runnable Interface..............");
		    } );

		Runnable r1 = new Runnable() {

			@Override
			public void run() {	System.out.println("anonyme Kasse.....");}
		};
		
		Runnable r2 = () -> {System.out.println("Lambda.....");};
		
		activate(r1);
		activate(r2);
		
		activate(
			new Runnable() {
				public void run() {	System.out.println("activate: anonymos Klasse...");}
			}	
		);
		
		activate(
				() -> {System.out.println("activate: Lambda.....");}
			);
		
		Activate a1 = new Activate();
		a1.run();
		
		
	}//end of main

	static void activate(Runnable r) {r.run();}
	
}
