package thread.anfang;

public class MyThreadUtils {

	public static void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
