package thread.anfang;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WDH_Monitor {
static class Person{
	int alter;
	void incrementAlter() {
		alter++;
		
	}
}
	public static void main(String[] args) {


		Person p1 = new Person();
		Runnable target = () -> {
			synchronized (p1) {
				
			} {
				
			}{
				p1.incrementAlter();
			}
			
		};

List<Thread> threads = Stream.generate( ()-> new Thread(target)).limit(1000).collect(Collectors.toList());
threads.forEach(Thread::start);
threads.forEach( t-> {
	try {
		t.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
});
	System.out.println(p1.alter);
	}//end of main

}
