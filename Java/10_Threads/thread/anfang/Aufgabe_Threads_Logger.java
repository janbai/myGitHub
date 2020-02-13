package thread.anfang;
class MyLogger {
	private StringBuilder sb = new StringBuilder();
	//private StringBuffer sb = new StringBuffer();
	
	public void addMessage(String caller, String message) {
		synchronized (this) {
		sb.append(caller)
		  .append(" - ")
		  .append(message)
		  .append("\n");
		}
	}
	
	public String getLog() {
		return sb.toString();
	}
} 

class MyService extends Thread{
	
	private MyLogger logger;
	
	public MyService(MyLogger logger) {
		this.logger = logger;
	}

	@Override
	public void run() {
		
	for (int i = 0; i < 100; i++) {
	//	synchronized (logger) {
		logger.addMessage(getName(), "Message" + (i+1));
	//	}
	}
	}
}
public class Aufgabe_Threads_Logger {

	

	public static void main(String[] args) throws InterruptedException {


		MyLogger logger = new MyLogger();
		
		Thread t1 = new MyService(logger);
		Thread t2 = new MyService(logger);
		//new MyService(new MyLogger()).start();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("*** main");
		System.out.println(logger.getLog());
	}

}
