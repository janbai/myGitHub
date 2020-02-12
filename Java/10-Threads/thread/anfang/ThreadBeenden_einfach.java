package thread.anfang;



public class ThreadBeenden_einfach {
static void pause(long millis) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
	static class MyExtraThreadLogic implements Runnable{
		boolean lauft = true;
		
		@Override
		public void run() {
			while(true) {
				System.out.println("lauft.....");
				pause(1000);
			}
			//System.out.println("Extra-Thread wird " + Thread.currentThread().getId() );
		}
		
	}
	public static void main(String[] args) {
		MyExtraThreadLogic logic = new MyExtraThreadLogic();
		Thread th = new Thread(logic);
		th.start();
		pause(5000);
		System.out.println("main beendet den Extra-Thread" + th.getId());
		
		logic.lauft = false;
		th.interrupt();
	}

}
