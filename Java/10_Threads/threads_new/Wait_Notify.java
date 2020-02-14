package threads_new;

import thread.anfang.MyThreadUtils;

public class Wait_Notify {

	public static void main(String[] args) {
		Object monitor = Wait_Notify.class;
		Runnable target = ()-> {
			System.out.println("waiting .......");
			MyThreadUtils.pause(2000);

			synchronized (monitor) {
				monitor.notify();
				
			}
			
		};
		
		new Thread(target).start();
		System.out.println("main is  waiting...........");
		try {
			synchronized (monitor) {
				monitor.wait();
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("main again......");
		
	}//end of main

}
