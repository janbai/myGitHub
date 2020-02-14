package threads_new;

import thread.anfang.MyThreadUtils;

class Producer extends Thread {
//	Object mutex = new Object();
	static int bigJob() {
	MyThreadUtils.pause(5000);	
	return 1;
	
	}
	private int daten;
	
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println("Producer produziert...");
			
			
			int temp = bigJob();
			synchronized (this) {
				
				daten = temp;
				this.notifyAll();
			}
			
			
			System.out.println("Producer hat neue Daten erzeugt!");
		}
	}
	
	public boolean hatDaten() {
		synchronized (this) {
			return daten > 0;
		}
	
	}
	
	public int getDaten() {
		
		synchronized (this) {
			int back = daten;
			daten = 0;	
			return back;
		}
		 
		
	}
}


class Consumer extends Thread {
	private Producer producer;
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		
		while(true) {
			if(!producer.hatDaten()) {
				System.out.println("Consumer hat nichts neues");
				synchronized (producer) {
					try {
						producer.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			} else {
				int daten = producer.getDaten();
				System.out.println("Consumer hat neue Daten erhalten und verarbeitet sie: " + daten);
			}
		}
	}
}

public class B14_wait_notify {

	public static void main(String[] args) {

		
		Producer p1 = new Producer();
		p1.start();
		
		Consumer c1 = new Consumer(p1);
		Consumer c2 = new Consumer(p1);
		c1.start();
		c2.start();

	}

}
