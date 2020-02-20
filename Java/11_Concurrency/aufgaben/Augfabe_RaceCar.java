package aufgaben;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

class RaceCar implements Runnable{
	private String name;
	private List<RaceCar> finish;
	
	
	
	
	public RaceCar(String name, List<RaceCar> finish) {
		this.name = name;
		this.finish = finish;
		CyclicBarrier barrier;
	}

	@Override
	public void run() {
		System.out.println(name + " started.");
		finish.add(this);
		System.out.println(name + " finished.");
		barrier.await();
		
	}
	@Override
	public String toString() {
		return name;
	}

	public Object setBarrier(CyclicBarrier barrier) {
		this.barrier= barrier;
		return null;
	}
}
public class Augfabe_RaceCar {

	public static void main(String[] args) {


		List<RaceCar> finish = new ArrayList<>();
		List<RaceCar> autos = Arrays.asList(
				new RaceCar("VW", finish),
				new RaceCar("Audi", finish),
				new RaceCar("Opel", finish),
				new RaceCar("Mazda", finish)
				);
		
		Runnable showResult = ()->{
			System.out.println("*** Ergebnisse: ");
			for (int i = 0; i < finish.size(); i++) {
				System.out.println((i+1) + ". " + finish.get(i));
			}
		};
		
		CyclicBarrier barrier = new CyclicBarrier(autos.size(), showResult);
		autos.forEach(a -> a.setBarrier(barrier));
	
	}

}
