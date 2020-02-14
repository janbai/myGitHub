package thread.anfang;


import threads.Consumer;
import threads.MyThreadUtils;
import threads.Producer;

class Producer extends Thread {
	
	private int daten;
	
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println("Producer produziert...");
			MyThreadUtils.pause(5000); // <- simuliert 'big job'
			daten = 1;
			
			System.out.println("Producer hat neue Daten erzeugt!");
		}
	}
	
	public boolean hatDaten() {
		return daten > 0;
	}
	
	public int getDaten() {
		int back = daten;
		daten = 0;
		return back;
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
