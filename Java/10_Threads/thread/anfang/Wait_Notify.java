package thread.anfang;

class Producer extends Thread{
	private int daten;
	
	@Override
	public void run() {
	System.out.println("Producer produzieren ....");
	MyThreadUtils.pause(5000);
	System.out.println("Producer hat neue Daten erzeugt...");
	}
	boolean hatDaten() {
		return daten >0 ;
		
	}
	
	public int getDaten() {
		int back = daten;
		daten = 0;
		return back;
	}
}
class Consumer extends Thread{
	private Producer producer;
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
	while(true) {
		if(producer.hatDaten())
			System.out.println("Consumer hat nichts neues");
			int daten = producer.getDaten();
		System.out.println("Consumer hat neue Daten erhalten und verarbeiten sie");
		
	}
	}
}
public class Wait_Notify {

	public static void main(String[] args) {


		Producer p1 = new Producer();
		p1.start();
		
		Consumer c1 = new Consumer(p1);
		Consumer c2 = new Consumer(p1);
		c1.start();
		c2.start();
		

	}

}
