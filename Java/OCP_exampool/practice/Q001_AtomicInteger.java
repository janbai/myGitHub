package practice;

import java.util.concurrent.atomic.AtomicInteger;

public class Q001_AtomicInteger {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		AtomicInteger status = new AtomicInteger();
		
		int oldstatus = status.get();
		System.out.println("oldstatus: " + oldstatus); // 0
		
		Runnable target = () -> {
			for (int i = 0; i < 1_000_000; i++) {
				int newstatus = status.incrementAndGet();
				 if(status.compareAndSet(oldstatus, newstatus)) {
			        System.out.println("New Status:" + newstatus);	
			        }
			}
		};
		
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Status: " + status); // 2000000

	}

}
