package thread;

class MyThread extends Thread{
	String name = "";
	Thread th = new Thread();
	public MyThread(String name) { 
		this.name = name;
		th.setName(name);
		}
	
	@Override
	public void run() {
		System.out.println("Control in MyThread: " + th.getName());// th.getName() == name
		}
	}
class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Control in MyRunnable: " + Thread.currentThread().getName());
	}
}
public class Thread_Creation {
	
	public static void main(String[] args) {

		test_Thread();
		System.out.println("Control in main");
		test_Runnable();
		test_A();
		test_B();
		test_C();
	//	test_D(); // läuft endlos
		
	}//end of main
	


private static void test_D() {
	//läuft endlos
			new Thread( () -> {
				while(true) {
					System.out.println( Thread.currentThread().getId() );
				}
			} ).start();
}//-----------------------------------------
private static void test_C() {
	Runnable target = new Runnable() {
		@Override
		public void run() {
			System.out.println("1.Maus");
		} 
	}; 
	
	new Thread( target ) {
		@Override
		public void run() {
			super.run(); // Maus
			System.out.println("2.Katze"); 
		}
	}.start();
}//-----------------------------------------



private static void test_B() {
	new Thread() {
		@Override
		public void run() {
			System.out.println("run_B");
		}
	};
	System.out.println("test_B"); // 1. (und einzige) Ausgabe
	
}//-----------------------------------------
private static void test_A() {
	new Thread() {
		@Override
		public void run() {
			System.out.println("run_A"); // 1
		}
	}.run();
	
	System.out.println("test_A"); // 2
}//-----------------------------------------
private static void test_Runnable() {
	Runnable target = new MyRunnable();
	new Thread( target,"D").start();
	new Thread( target,"E").start();
	new Thread( target,"F").start();
}//-----------------------------------------
static void test_Thread() {
	Thread thA = new MyThread("A");
	Thread thB = new MyThread("B");
	Thread thC = new MyThread("C");
	thA.start();
	thB.start();
	thC.start();
	
	try {
		thA.start();
	} catch (IllegalThreadStateException e) {
		System.err.printf("%s%s%n","Test Exception (if the status thread != 0): " , e.toString());
	}
}//--------------------------------------
}
