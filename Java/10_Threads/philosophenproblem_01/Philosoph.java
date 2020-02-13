package philosophenproblem_01;

import thread.anfang.MyThreadUtils;

public class Philosoph implements Runnable{

	private String name;

	public Philosoph(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println(name + " denket nach ...");
			MyThreadUtils.pause(2000);
			
			System.out.println(name + " bekommt Hunger ...");
			System.out.println(name + " isst ...");
			MyThreadUtils.pause(5000);
			System.out.println(name + " nimmt die linke Gabel ...");
			System.out.println(name + " nimmt die rechte Gabel ...");
			
		}
		
	}
}
