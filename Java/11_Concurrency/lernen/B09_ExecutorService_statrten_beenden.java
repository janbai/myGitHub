package lernen;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class B09_ExecutorService_statrten_beenden {

	public static void main(String[] args) {


		ExecutorService service = Executors.newSingleThreadExecutor();
		Runnable command1 = () -> {
			System.out.println("run1");
			};
			Runnable command2 = () -> {
				System.out.println("run2");
				};
			service.execute(command1);
			service.execute(command2);
			service.execute(command1);
			service.execute(command2);
			service.execute(command1);
			service.execute(command2);
			service.shutdown();
			List<Runnable>commands = service.shutdownNow();
			System.out.println(commands.size());
			System.out.println("main");	
	}

}
