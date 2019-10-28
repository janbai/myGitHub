package personen;

import java.util.Arrays;



public class Person_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person [] personen = {
				new Person("Houssam","Janbai","73033",1972),
				new Person("Rabeaa","Saleem","73033",1972),
				new Person("Adam","Janbai","73033",2008),
				new Person("Eva","Janbai","73033",2011),
		};

		System.out.println("*** Nicht sortiert: ");
		Person.printPersonen(personen);
		

		System.out.println("*** Natürlich aufsteigend sortiert: ");
		Arrays.sort(personen);
		Person.printPersonen(personen);
	}

}
