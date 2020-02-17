package aufgaben;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Intermediate_Operations {
	static class Tier {
		private String name;

		public Tier(String name) {
			this.name = name;
		}
		public String toString() {
			return "Tier " + name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tier other = (Tier) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		
	}
	
	
	public static void main(String[] args) {

		a1();
		a2();
		a3();
		a4();
		a5();
		a6();
		
		
	}
	private static void a6() {
		System.out.println("A6----------");

		List<String> mailsErsthelfer = Arrays.asList("tom@mycompany.com", "jerry@mycompany.com");
		List<String> mailsIT = Arrays.asList("tom@mycompany.com", "mary@mycompany.com");
		List<String> mailsQM = Arrays.asList("peter@mycompany.com", "jerry@mycompany.com");
		Stream.of(mailsErsthelfer, mailsIT, mailsQM)
		.flatMap(List::stream)
		.map(email -> email.substring(0, email.indexOf('@')))
		.distinct()
		.forEach(System.out::println);
	}
	private static void a5() {
		System.out.println("A5----------");
		Tier[] array = {
				new Tier("Rex"),
				new Tier("Tom"),
				new Tier("Jerry"),
				new Tier("Tom"),
				new Tier("Jerry"),
			};
		
	Arrays.stream(array)
	.distinct()
	.forEach(System.out::println);
		
		
		
	}
	private static void a4() {
		System.out.println("A4----------");
		Supplier<Integer> s = () -> {
			Random random = new Random();
			return random.nextInt(41)-20;
		};
		
		Stream.generate(s)
		.limit(30)
		.filter(x-> x<-15 || x>-10)
		.map(Double::valueOf) // (x -> Double.valueof(x)) (Double::new) (x -> (Double)x)
		.forEach(System.out::println);
		
	}
	private static void a3() {
		System.out.println("A3----------");
List<String> list = Arrays.asList("Tom", "Jerry", "Rex");
		
		//A
		for(String name : list) {
			Tier t = new Tier(name);
			System.out.println(t);
		}
		System.out.println("----------------");
		list.stream()
			//.map(name -> new Tier(name))
			.map(Tier::new)
			.forEach(System.out::println);
	}
	static void a2() {
Integer[] array = { 1, 4, 7, 3, -8 };
		
		//A
		for (Integer x : array) {
			System.out.println( x%2==0 ? "gerade" : "ungerade" );
		}
		System.out.println("-------");
		
		Arrays.stream(array)
		.map(x -> x%2==0 ? "gerade" : "ungerade")
		.forEach(System.out::println);
	}
	
static void a1() {
	
		List<Integer> list = Arrays.asList(13, 15, 17, 19, 21);
		for(Integer x : list) {
			if(x==15 || x==19) {
				System.out.println("Treffer: " + x);
				}
			}
		System.out.println("-------------");
		
		list.stream().filter(x -> x==15 || x==16)
		.forEach(x -> System.out.println("Treffer: " + x));
		}



}
