package draft_01;

public class TwoThreads {
private static Object resource = new Object();
private static void delay (long n) {
	try{Thread.sleep(n);}
	catch (Exception e) {System.out.println("Error ");}

}
	public static void main(String[] args) {
		System.out.println("StartMain ");
		new Thread().start();
		delay(1000);
		Thread t2 = new Thread2();
		delay(1000);
		t2.start();
		delay(1000);
		System.out.println("EndMain ");
	}
	static class Thread2 extends Thread{
		public void run() {
			synchronized (resource) {
				System.out.println("Start2 ");
				delay(2000);
				System.out.println("End2 ");
			}
		}
	}

}
