package thread;

public class Class_Thread_API {
	static final String fmt = "%-52s%s%n";
	public static void main(String[] args) {


		Thread th = new Thread();
		
		System.out.printf(fmt,"The minimum priority that a thread can have:", Thread.MIN_PRIORITY);
		System.out.printf(fmt,"The default priority that is assigned to a thread:", Thread.NORM_PRIORITY);
		System.out.printf(fmt,"The maximum priority that a thread can have:", Thread.MAX_PRIORITY);
		System.out.printf(fmt,"the currently executing thread:", Thread.currentThread());
		
		System.out.printf(fmt,"The Object:",th);
		
		System.out.printf(fmt,"get Id:",th.getId());
		
		System.out.printf(fmt,"get Name:", th.getName());
		th.setName("Jerry");
		System.out.printf(fmt,"get Name:",th.getName());
		
		System.out.printf(fmt,"get Priority:",th.getPriority());
		System.out.printf(fmt,"get name:", th.getPriority());
		
		
		
		
		Thread.yield();

	}

}
