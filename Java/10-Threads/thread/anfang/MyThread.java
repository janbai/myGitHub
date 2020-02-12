package thread.anfang;

import java.util.Random;
class RunnableDemo implements Runnable{

	@Override
	public void run() {
		Random random = new Random();
		long sum = 0;
        for (int i=0; i<10_000_000 ; i++)       	sum += random.nextInt(10)+1;
        
        Thread current = Thread.currentThread();
        System.out.println(current.getName() + " :" +sum);
	}
	
	 
}
public class MyThread extends Thread  {
	public void run()  
    {  
		 
    }  
	public static void main(String[] args) {

		Runnable r1 = new RunnableDemo();  
		Runnable r2 = new RunnableDemo(); 
		Thread t1 = new Thread(r1);  
		Thread t2 = new Thread(r2); 
       
		t1.setName("Tom");
        t2.setName("Jerry");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        // this will call run() method  
        t1.run();  
        t2.run();  
        for (int i=0; i<10; i++)  
        {  
            // Control passes to child thread  
            t1.yield();  
            System.out.println(Thread.currentThread().getName() + " in control");  
        }  

	}

}
