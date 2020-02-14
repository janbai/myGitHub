package thread.anfang;

public class WDH_03 {
	static void doStuff(int x) {
		Object a = x >0 ? String.class : WDH_03.class;
		Object b = x > 0 ? String.class : WDH_03.class;
		synchronized (a) {
			MyThreadUtils.pause(1000);
		synchronized (b) {
			
		}	
		}
		System.out.println(x);
	}
	public static void main(String[] args) {
		
		Runnable targetA = () -> doStuff(1);
		Runnable targetB = () -> doStuff(-1);
		
		new Thread(targetA).start();
		new Thread(targetB).start();
		System.out.println("main");
	}

}
