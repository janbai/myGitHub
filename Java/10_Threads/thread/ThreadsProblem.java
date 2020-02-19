package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import lernen.MyThreadUtils;

public class ThreadsProblem {

	static void scheduledPools() {
		int corePoolSize = 1;
		ScheduledExecutorService service = Executors.newScheduledThreadPool(corePoolSize);
		long delay = 2 ;
		TimeUnit unit = TimeUnit.SECONDS ;
		Callable<Integer> callable = ()->{
			System.out.println("call ");
			return 12;
		};
		
		System.out.println("Callable registriert. in ca.2 Sek geht es los....");
		service.schedule(callable, delay, unit );
		
		Runnable runnable = ()-> {
			System.out.println("run ");
		};
		System.out.println("Runnable registriert. in ca.2 Sek geht es los....");
		service.schedule(runnable, delay, unit );
		
		System.out.println("*** main warten 3 Sek....");
		MyThreadUtils.pause(3000);
		System.out.println("main geht weiter...");
		long initialDelay = 1;
		long period = 2;
		service.scheduleAtFixedRate(runnable, initialDelay, period, unit);
		
		MyThreadUtils.pause(6000);
		System.out.println("*** main fährt des Service tunter");
		service.shutdown();
	}
	public static void main(String[] args) {
		scheduledPools();

	}

}
