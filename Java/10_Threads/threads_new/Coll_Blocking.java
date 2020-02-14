package threads_new;

import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Coll_Blocking {

	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> q1;
		LinkedBlockingQueue<Integer> q2;
		LinkedBlockingDeque<Integer> q3;
		PriorityBlockingQueue<Integer> q4;
		
		test_03();
		
		
		
		
		
	}//end of main
	
	static void test_03() {
		int capacity = 2;
		long timeout = 1;
		TimeUnit unit = TimeUnit.SECONDS;
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

		try {
			queue.offer("a", timeout, unit);
			queue.offer("b", timeout, unit);
			System.out.println("1)" + queue);
			
			boolean erg = queue.offer("c", timeout, unit);
			System.out.println("2)" +queue);
			
			String s = queue.poll(timeout, unit);
			System.out.println("3)" +queue);
			
			queue.poll(timeout, unit);
			System.out.println("4)" +queue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	static void test_02() {
		int capacity = 2;
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

		queue.add("a");
		queue.offer("b");
		
		System.out.println("1)" + queue);
		
		Runnable target = ()-> {
			System.out.println(queue.remove());
		};
		new Thread(target ).start();
			try {
				queue.put("c");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		System.out.println("2)" +queue);
		
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}
	
static void test_01() {
	int capacity = 2;
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity);

	queue.add("a");
	queue.offer("b");
	try {
		queue.add("c");
	} catch (IllegalStateException e) {
		System.out.println(e.toString());
	}
	
	
	System.out.println("1)" + queue);
	
	
	queue.offer("C");
	System.out.println("2)" +queue);
	
	System.out.println(queue.offer("C"));
	
	System.out.println("remove:" + queue.remove());
	System.out.println("poll: " + queue.poll());
	try {
		System.out.println("remove:" + queue.remove());
	} catch (NoSuchElementException e) {
		System.out.println(e.toString());
	}
	
	System.out.println("poll: " + queue.poll());
}
}
