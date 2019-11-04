package aufgaben;
/*
 * kleine Aufgabe:
 * 
 * 1. Speichern Sie bitte folgende Namen in einem Array namens 'namen':
 * 
 *  Tom, Jerry, Peter, Paul, Mary
 * 
 * 2. 
 * 	  Erzeugen sie eine Klasse 'Person' mit einem Attribut 'name'
 * 
 * 3. Bilden Sie bitte ein Array mit Personen. Die Namen für die Personen
 * 		aus dem Array 'namen' verwenden.
 * 
 */

class Person{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " ";
	}

	
	
	
	
}
public class KleineAufgabeArraysPersonen {

	public static void main(String[] args) {
		String[] namen = { "Tom", "Jerry", "Peter", "Paul", "Mary" };
		for (int i = 0; i < namen.length; i++) {
			System.out.print(namen[i] + " ");
		}
		System.out.println();
		
		Person[] personen = new Person [namen.length];
		for (int i = 0; i < namen.length; i++) {
		personen[i] = new Person(namen[i]);
		}
		
		for (Person person : personen) {
			System.out.print(person);
		}
	}

	

}
