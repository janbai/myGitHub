package thread.anfang;
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("run");
		
	}
	
}


public class Thread_starten {

	public static void main(String[] args) {

		frage_4();
		
		
	
		
	}
	static void frage_4() {
		new Thread( ()-> {
			while(true) {
				System.out.println(Thread.currentThread().getId());
			}
			
		}).start();
	}
		
		
	
	static void frage_3() {
		Runnable target = new Runnable() {
			@Override
			public void run() {
				
				System.out.println("Maus");
				
			}
		};
		new Thread (target) {
			@Override
			public void run() {
				super.run();// Maus
				System.out.println("katze");
				
			}
		}.start();
		
		
	}
	
	static void frage_2() {
		new Thread () {
			@Override
			public void run() {
				System.out.println("run");
				
			}
		}.run();
		System.out.println("main");
		
	}
static void frage_1() {
	new Thread () {
		@Override
		public void run() {
			System.out.println("run");
			
		}
	};
	System.out.println("main");
	
}
}
