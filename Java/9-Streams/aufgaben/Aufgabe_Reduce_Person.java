package aufgaben;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Aufgabe_Reduce_Person {

	static String getMax(String s1, String s2) {
		if(s1.compareTo(s2) > 0 ) {
			return s1;
		}else
			return s2;
	}
	static class Person{
		String vorname, nachname;

		public Person(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}

		@Override
		public String toString() {
			return  vorname + " " + nachname ;
		}
		
		static Person combineMax(Person p1, Person p2) {
			String vorname = getMax(p1.vorname, p2.vorname);
			String nachname = getMax(p1.nachname, p2.nachname);
			return new Person(vorname,nachname);
			
		}
	}
	public static void main(String[] args) {


		List<Person> personen = Arrays.asList( 
				new Person("Tom", "Katze"), 
				new Person("Jerry","Maus"), 
				new Person("Alexander", "Poe")
				);

		
		BinaryOperator<Person> accumulator = Person::combineMax ;
		Person max1 = personen.stream().reduce(accumulator ).get();
		System.out.println("max1: " + max1);
		
		Person identity2 = new Person("","");
		BinaryOperator<Person> accumulator2 = accumulator ;
		Person max2 = personen.stream().reduce(identity2 , accumulator2 );
		System.out.println("max2: " + max2);
		
		BiFunction<Person, Person, Person> accumulator3 = accumulator2 ;
		Person identity3 = identity2;
		BinaryOperator<Person> combiner3 = accumulator2;
		
		Person max3 = personen.stream().reduce(identity3, accumulator3, combiner3 );
		System.out.println("max3: " + max3);
		
		Person identity4 = new Person("","");
		BinaryOperator<Person> accumulator4 = (p1, p2) ->{
			
			return p1;
		};
		System.out.println(identity2== max3);
	}

}
