package thread.anfang;

public class Thread_Sleep {

	public static void main(String[] args) {

	System.out.println("Start...");	
		long millis = 2000;

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
System.out.println("Fertig...");

			
	}

}
