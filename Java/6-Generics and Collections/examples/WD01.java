package examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class WD01 {

	public static void main(String[] args) {


		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		System.out.println(deque);
		deque.add(1);
		System.out.println(deque);
		
		deque.push(5);
		System.out.println(deque);
		
		System.out.println(deque.peek());
		System.out.println(deque.element());
		System.out.println(deque.poll());
		System.out.println(deque.remove());
		deque.remove();
		deque.remove();
		deque.remove();
		System.out.println(deque.remove());
		System.out.println(deque.poll());
		
		//System.out.println(deque.remove());
		System.out.println(deque.offerFirst(7));
		
		System.out.println(deque.peekLast());
		System.out.println(deque.peekLast());
		
	}

}
