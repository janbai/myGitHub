package thread.anfang;


class ValueHolder{
	volatile int value;
}
class Decrement extends Thread{
	ValueHolder holder;
	static Object monitor = new Object();	
	
	public Decrement(ValueHolder holder) {
		this.holder = holder;
	}

	public void run() {
		int  i =0;
		for ( i = 0; i < 1_000_000; i++) {
		synchronized (monitor)	{
				holder.value --;
			}
			
		}
		
			
		}
}//--------------------------------------------------------
public class KleineAufgabe_01 {
	volatile static int value;
	static Object monitor = new Object();
	
static  class Increment extends Thread{
	
		@Override
		public void run() {
			
			int  i =0;
			for ( i = 0; i < 1_000_000; i++) {
				synchronized (monitor)	{
					value ++;
				}
				
			}
			
			//System.out.println("value in the Thread: " + value);
		}
}//-------------------------------------------------------------

	
	public static void main(String[] args) {
		
		//a1();
	//	raceCondition();
		decrement();
	
		
		
		
	}// end of main
	
private static void decrement() {
	ValueHolder holderA = new ValueHolder();
	ValueHolder holderB = new ValueHolder();
	Thread th1 = new Thread(new Decrement(holderA));
	Thread th2 = new Thread(new Decrement(holderA));
	Thread th3 = new Thread(new Decrement(holderB));
	Thread th4 = new Thread(new Decrement(holderB));
	th1.start();
	th2.start();
	th3.start();
	th4.start();
	
	
	try {
		th1.join();
		th2.join();
		th3.join();
		th4.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("value A = " + holderA.value);
	System.out.println("value B = " + holderB.value);	
		
}//-------------------------------------------------------

private static void raceCondition() {
	Thread th1 = new Thread(new Increment());
	Thread th2 = new Thread(new Increment());
	th1.start();
	th2.start();
	
	try {
		th1.join();
		th2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("value in the Main= " + value);
		
}//----------------------------------------------------------

static void a1() {
	Thread t1 = new Thread( () -> {
		for (int i = 0; i < 1_000_000; i++) {
			value++;
			
		}
	});


	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("value= " + value);
}//------------------------------------------------------
}
