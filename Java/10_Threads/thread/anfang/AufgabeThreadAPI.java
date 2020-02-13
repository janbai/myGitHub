package thread.anfang;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AufgabeThreadAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a1();
		//a2();
		//a3();
		a4();
		
		
	}
private static void a4() {
	class PrintChar implements Runnable{
		char ch;

		public PrintChar(char ch) {
			this.ch = ch;
		}
		public void run() {
			System.out.println(ch);
		}
	}
		for (char ch = 'A'; ch < 'Z'; ch++) {
			
			PrintChar target = new PrintChar(ch);
			new Thread(target).start();
			
		}
		
	}
private static void a3() {
		Runnable target = () -> System.out.println(Thread.currentThread().getId());
		List<Thread> list = Stream.generate( () -> new Thread(target))
								.limit(37)
								.collect(Collectors.toList());
		list.forEach(th -> System.out.println(th.getId()));
		//list.forEach(Thread::start);
	}
private static void a1() {
	new Thread() {
		public void run() {
			System.out.println(getName() + " : " + getId());
			MyThreadUtils.pause(1000);	
		}
	}.start();
		
	}
static void a2() {
	Runnable target = () -> {
		while(true) {
			Thread th = Thread.currentThread();
			System.out.println(th.getId() + " : " + Thread.currentThread().getId());
			MyThreadUtils.pause(1000);
		}
	};
	new Thread(target).start();
}
}
