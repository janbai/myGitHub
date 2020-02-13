package thread.anfang;

import java.util.Random;

class SummeBerechnen extends Thread{
	volatile double summe = 0;
	@Override
	public void run() {
		
		Random r = new Random();
		for (int i = 0; i < 1_000_000; i++) {
			summe += r.nextDouble();
			
		}
		
		System.out.println("Summe in the Thread: " + summe);
	}
}
public class Thread_join {

	
	public static void main(String[] args) {

		SummeBerechnen s1 = new SummeBerechnen();
		SummeBerechnen s2 = new SummeBerechnen();
		
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Summe in the Main: " + (s1.summe+ s2.summe));
		

	}

}
