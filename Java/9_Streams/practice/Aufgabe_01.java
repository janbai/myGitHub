package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import org.junit.experimental.theories.FromDataPoints;

public class Aufgabe_01 {
static class Test{
	static Integer nextInt() {
		return new Random().nextInt();
	}
}
	public static void main(String[] args) {
		
		
		//a1();
		//a2();
		//a3();
		a4();
		
		
		
	}
	
	private static void a4() {
		// TODO Auto-generated method stub
		
	}

	private static void a3() {
		System.out.println("ohne Stream --------");
		int von= 3;
		for (int i = von; i>= 1; i--) {
			System.out.println(i);
		}
		
		
		System.out.println("mit Stream --------");
		Stream.iterate(von,  x -> --x)
		.limit(von)
		.forEach(System.out::println);
		
	}

	static void a2() {
		System.out.println("ohne Stream --------");
		for (int i = 0; i < 10; i++) {
			System.out.println(Test.nextInt());
		}
		
		System.out.println("mit Stream --------");
		Stream.generate(Test::nextInt)
		.limit(3)
		.forEach(System.out::println);
		
		System.out.println("nochmal mit Stream --------");
		Random r = new Random();
		Stream.generate(r ::nextInt)
		.limit(3)
		.forEach(System.out::println);
	
	}
	
	
	
static void a1() {
	List<Integer> list1 = Arrays.asList(1, 2, 3);
	List<Integer> list2 = Arrays.asList(4, 5);
	
	List<List<Integer>> list = Arrays.asList(list1,list2);
	System.out.println("size: " + list.size() + ", Elements: " + list);
	System.out.println("Ohne Stream .............");
	for (List<Integer> e : list) {
		System.out.println("size: " + e.size() + ", Elements: " + e);
	}
	
	System.out.println("mit Stream ........");
	Stream.of(list1,list2)
	.forEach(e ->{
		System.out.println("size: " + e.size() + ", Elements: " + e);
	});
}





}
