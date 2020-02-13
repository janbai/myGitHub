package thread.anfang;


public class B07_ThreadBeenden_interrupt {
	
	
	static class MyExtraThreadLogic implements Runnable {
		
		@Override
		public void run() {
			
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("* laufe...");
				
				try {
					Thread.sleep(100_000_000); 
					// wenn die InterruptedException geworfen wird,
					//wird der Zustand 'interrupted' gelöscht.
					
				} catch (InterruptedException e) {
					System.out.println("* Thread interrupted: " + Thread.currentThread().getId());
					System.out.println("* Ist Thread immer noch interrupted? " + Thread.currentThread().isInterrupted());
					break; // Schleife beenden
				}
				
			}
			
			System.out.println("Methode run ist gleich fertig. Thread: " + Thread.currentThread().getId());
			
		} // end of run
		
	}
	

	public static void main(String[] args) {

		Thread th = new Thread( new MyExtraThreadLogic() );
		th.start();
		
		MyThreadUtils.pause(5000);
		System.out.println("main ruft interrupt auf für den Thread " + th.getId());
		
		th.interrupt(); // den Thread auf 'interrupted' setzen
		
	}

}
