package concurrency;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

import lernen.MyThreadUtils;
class RaceCar implements Runnable {
	private String name;
	private List<RaceCar> finish;
	
	public RaceCar(String name, List<RaceCar> finish)  {
		this.name = name;
		this.finish = finish;
	}

	public void run() {
		System.out.println(name + " started.");
		
		finish.add(this);
		System.out.println(name + " finished.");
	}
	public String toString() {
		return name;
	}
}
public class Test_CyclicBarrier {
static AtomicInteger count = new  AtomicInteger(0);
	
	public static void main(String[] args) {
		int parties =2;
		
		Runnable barrierAction = ()-> System.out.println("Brriere durchbrochen! " + Thread.currentThread().getId());
		CyclicBarrier barrier = new CyclicBarrier(parties, barrierAction );
		//System.out.print("Car" +  Thread.currentThread().getId());
		count.set(0);
		Runnable target = ()-> {
			for (int i = 0; i < 1000; i++) {
				//count.getAndIncrement();
				System.out.print( ":" + Thread.currentThread().getId());
				MyThreadUtils.pause(10);
			}
			System.out.println();
			//System.out.println(count + "   Thread " + Thread.currentThread().getId() + " kommt zu der Barriere");
			try {
				barrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("Thread " + Thread.currentThread().getId() + " get weiter..");
		};
		
		new Thread(target).start();
		new Thread(target).start();
		new Thread(target).start();
		new Thread(target).start();
		//MyThreadUtils.pause(1000);

		
		
	}//end of main

}
