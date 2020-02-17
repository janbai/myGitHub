package examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class  Generic_Methode  {

	static <T extends Comparable<T>> T getMax1(T a , T b) {
		if(a.compareTo(b)>0) {
			return a;
		}
		return b;
	}
	public static void main(String[] args) {
		
		Integer x3 = getMax1(2,3);
		Long x4 = getMax1(2L,3L);
		Double x5 = getMax1(2.3, 5.7);
		Number x6 = getMax1(12, 5);
	
		String x7 = getMax1("a","B");
		
		System.out.println(x3 );
		System.out.println(x4 );
		System.out.println(x5 );
		System.out.println(x6 );
		System.out.println(x7 );
		
		
	}

}
