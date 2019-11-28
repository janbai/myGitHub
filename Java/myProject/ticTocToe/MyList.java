package ticTocToe;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MyList<T> {
	    private Map<Integer, T> values = new HashMap<>();

	    public void set(int i, T value) {
	        values.put(i, value);
	    }

	    public void letsGo(BiConsumer<? super T, ? super Integer> consumer) {
	        System.out.println("Let's Go");
	        values.entrySet().forEach(e -> consumer.accept(e.getValue(), e.getKey()));
	    }

	    @Override
	    public String toString() {
	        return values.toString();
	    }

	    public static void main(String[] args) {
	        MyList<Integer> myList = new MyList<>();
	        myList.set(0, 0);
	        myList.set(1, 1);
	        myList.set(2, 2);

	        System.out.println(myList.toString());
	        myList.letsGo((e, i) -> myList.set(i, e * 2));
	        System.out.println(myList.toString());

	        // Output:
	        // {0=0, 1=1, 2=2}
	        // Let's Go
	        // {0=0, 1=2, 2=4}
	    }
	}