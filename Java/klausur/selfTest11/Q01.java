package selfTest11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Q01 {

	public static void main(String[] args) {
	//	Q01();
	
	//	Q02();
	//	Q04();
	//testBlockingQueue();	
		
		Q06();
		
		
	}

	private static void Q09() {
		// TODO Auto-generated method stub
		
	}

	
	


	private static void Q06() {
		ConcurrentMap<String,Integer> ages = new ConcurrentHashMap<>();
		ages.put("John", 23);
		//ages.delete("John", 23);
		// ages.deleteIfEquals("John", 23);
		 ages.remove("John", 23);
		// ages.removeIfEquals("John", 23);
		
		System.out.println(ages);
	}


	private static void testBlockingQueue() {
		int capacity = 3;
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity );
		boolean result = queue.add(4);
		System.out.println("1.add:" + result);
		
		boolean result2 = queue.offer(5);
		System.out.println("1.offer:" + result2);
		
		 try {
			 queue.put(6);
			} catch (InterruptedException e1) {
				System.err.println(e1.toString());	
			}
		
		
		 try {
			 queue.offer(7, 2, TimeUnit.SECONDS);
			 
			} catch (InterruptedException e) {
			
			System.err.println(e.toString());	
			}
		 
		 System.out.println(queue);
		 try {
			 queue.add(444);
			 
			} catch (IllegalStateException e) {
			
			System.err.println(e.toString());	
			}
		 Callable<Integer> task = ()->{
			 Thread.sleep(2000);
			 return queue.remove();
		 };
		 
		 ExecutorService service = Executors.newSingleThreadExecutor();
		 service.submit(task);
		 service.shutdown();
		 
		 try {
			 queue.put(8);
			} catch (InterruptedException e) {
				System.err.println(e.toString());	
			}
		 System.out.println(queue);
		 Integer next = queue.poll();
		 System.out.println(next);
		 System.out.println(queue);
		 try {
			queue.take();
		} catch (InterruptedException e) {
			System.err.println(e.toString());	
		}
		 System.out.println(queue);
	}


	private static void Q04() {
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);
		 abq.add(1);
		 abq.offer(2);
		 try {
			abq.put(3);
		} catch (InterruptedException e1) {
			System.err.println(e1.toString());	
		}
		 try {
			abq.offer(1, 5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
		
		System.err.println(e.toString());	
		}
		 abq.forEach(x->System.out.println(x + " "));
	}


	private static void Q02() {
		CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
		cowList.add(4);
		cowList.add(2);
		cowList.add(6);
		
		Iterator<Integer> it = cowList.iterator();
		cowList.remove(2);
		while(it.hasNext()) {
		System.out.print(it.next() + " ");
		}
		
	}

	private static void Q01() {
		CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<>();
		cowList.add(4);
		cowList.add(2);
		Iterator<Integer> it = cowList.iterator();
		cowList.add(6);
		while(it.hasNext()) {
		System.out.print(it.next() + " ");
		}
		
	}

}
