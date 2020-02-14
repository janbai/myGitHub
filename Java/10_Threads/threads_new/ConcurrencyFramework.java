package threads_new;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyFramework {

	
	public static void main(String[] args)  {
		// testThreadSafty();
		//api();
	List<Integer> source = new ArrayList<>();
	source.add(5);
	source.add(7);
	//test_03(source);
		
	List<Integer> listSynch = Collections.synchronizedList(source);
	//test_03(listSynch);
	CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>(source);
	test_03(copyList);
	System.out.println(copyList);	
	
	ConcurrentLinkedDeque<Integer> conDeque = new ConcurrentLinkedDeque<>(source);
	//test_03(conDeque);
	
	ConcurrentSkipListMap<Integer, String> mapA;
	ConcurrentMap<Integer, String> mapB;
	
	
	
	
	}//end of main
	
	
private static void test_03(Collection<Integer> coll) {
	System.out.println(coll.getClass());
	for (Integer x : coll) {
		System.out.println(x);
		coll.add(9);
	}
		
	
	
	
	}


private static void test_02() {
		ConcurrentLinkedQueue<Integer> queue;
		ConcurrentLinkedDeque<Integer> deque;
		ConcurrentSkipListSet<Integer> skipSet = new ConcurrentSkipListSet<Integer>();
		skipSet.add(11);
		skipSet.add(-7);
		skipSet.add(10);
		skipSet.add(-5);
		skipSet.add(25);
		System.out.println(skipSet);
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
		Map<Integer,String> map = Collections.synchronizedMap(new TreeMap<>());
		CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>();
		
		
		Runnable taskA = () -> {
			
			for (int i = 0; i < 1_00; i++) {
				list.add(i);
				System.out.println(i);
			}
		};
		
		Runnable taskB = () -> {
			for (int i = 0; i < 1_00; i++) {
				if(!list.isEmpty()) {
					list.remove(i);
					System.out.println(i);
				}
					
				
				
			}
		};
		
		
		//new Thread(taskA).start();
		//new Thread(taskB).start();
	}

	
	
	
	
	
	
	
	private static void test_01() {
		
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		Set<Integer> set = Collections.synchronizedSet(new HashSet<>());
		Map<Integer,String> map = Collections.synchronizedMap(new TreeMap<>());
		CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>();
		
		
		Runnable taskA = () -> {
			
			for (int i = 0; i < 1_00; i++) {
				list.add(i);
				System.out.println(i);
			}
		};
		
		Runnable taskB = () -> {
			for (int i = 0; i < 1_00; i++) {
				if(!list.isEmpty()) {
					list.remove(i);
					System.out.println(i);
				}
					
				
				
			}
		};
		
		
		new Thread(taskA).start();
		new Thread(taskB).start();
	}


	private static void api() {
		AtomicInteger x = new AtomicInteger();
		System.out.println(x);
		AtomicInteger y = new AtomicInteger(12);
		System.out.println(y);
		System.out.println(x.get());
		x.set(25);
		System.out.println(x.getAndIncrement());
		System.out.println(x.incrementAndGet());
		int delta = 3;
		System.out.println(x.getAndDecrement());
		System.out.println(x.decrementAndGet());
		System.out.println(x.addAndGet(delta));
		System.out.println(x.getAndAdd(delta));
		System.out.println();
	}

	public static void testThreadSafty() throws InterruptedException {
		
		AtomicInteger x = new AtomicInteger();
		x.set(12);
		int value = x.get();
		System.out.println(value);
		Runnable target = () -> {
			for (int i = 0; i < 1_000_000; i++) {
				x.getAndIncrement();
				
			}
			
		};
		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(x);

	}

}
