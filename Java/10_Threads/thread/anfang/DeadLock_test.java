package thread.anfang;
class DeadLock extends Thread{
	static final Object m1 = new Object();
	static final Object m2 = new Object();
	
	@Override
	public void run() {
	synchronized (m1) {	
		System.out.println("m1");
		synchronized (m2) {	System.out.println("m1:m2");}
	}
	
	
	synchronized (m2) { 
		System.out.println("m2");
		synchronized (m1) { System.out.println("m2:m1");}
	
	}
	
	}//end of run
}



public class DeadLock_test {

	
	
	
	public static void main(String[] args) {

		new DeadLock().start();
		new DeadLock().start();
		 

	}

}
