package thread.anfang;

public class Thread_API {
	static final String fmt = "%-30s%s%n";
	public static void main(String[] args) {


		new Thread();
		Runnable target = () ->{};
		new Thread(target);
		String name = "Tom";
		new Thread(name );
		
		new Thread(target,name);
		
		Thread t1 = new Thread();
		System.out.println(t1);
		long id = t1.getId();
		System.out.printf(fmt,"get Id:",t1.getId());
		
		System.out.printf(fmt,"get Name:", t1.getName());
		t1.setName("Jerry");
		System.out.printf(fmt,"get Name:",t1.getName());
		
		System.out.printf(fmt,"get Priority:",t1.getPriority());
		System.out.printf(fmt,"get name:", t1.getPriority());
		
		System.out.printf(fmt,"max Priority:", Thread.MAX_PRIORITY);
		System.out.printf(fmt,"min Priority:", Thread.MIN_PRIORITY);
		System.out.printf(fmt,"normal Priority:", Thread.NORM_PRIORITY);
		System.out.printf(fmt,"the current Thread:", Thread.currentThread());
		
		Thread.yield();
		
		
	}

}
