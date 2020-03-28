package draft_01;

public class X implements Runnable{
private int x;
private int y;
	public static void main(String[] args) {
		X that = new X();
		(new Thread(that)).start();
		(new Thread(that)).start();
	}

	@Override
	public void run() {
		for (; ; ) {
			synchronized (this) {
				x++;
				y++;
				System.out.println(Thread.currentThread().getId());
			}
		
		System.out.println("x= " + x + " : y= "+ y);
		}
	}

}
