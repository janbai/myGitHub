package selftest_10;

public class Q6 {

	public static void main(String[] args) throws InterruptedException {
		Object objB = new Object();
Thread threadA = new Thread("threadA") {
	@Override
	public void run() {
		
		synchronized (objB) {
			
		
		try {
			System.out.println("vor");
			wait(2000);
			System.out.println("nach");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
};
	
threadA.start();

Thread.sleep(1000);
synchronized (threadA) {
objB.notify();	
System.out.println("main vor sleep(3000");
Thread.sleep(3000);
}

	}

}
