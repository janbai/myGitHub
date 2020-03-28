package aufgaben;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class KleineAufgabeOS {

	public static void main(String[] args) {

		/*
		 * 1. OS-Objekt bilden. Der Konstruktor bekommt den Namen (String) und die Version (int)
		 */
		OS os1 = new OS("Mac", 9);
		System.out.println(os1); // Mac 9 

		/*
		 * 2.
		 * Bitte in einem Array Referenzen für folgende OS speichern:
		 * 
		 * 	Linux 3
         *  Windows 95
         *  Mac 9
         *  Linux 1
		 */
		OS[] array = {
			new OS("Linux", 3),	
			new OS("Windows", 95),	
			os1,	
			new OS("Linux", 1),	
		};
		
		/*
		 * 3+.
		 * 
		 * Folgende Aufruf gibt die OS als eine Tabelle aus:
		 * 
		 * | 1. | Linux   |  3 |
		 * | 2. | Windows | 95 |
		 * ...
		 */
		System.out.println("***** Neues Array");
		print(array);
		
		/*
		 * 4. Nach Namen (bei gleichen Namen nach Version) sortieren und ausgeben
		 */
		System.out.println("***** Aufsteigend, natürlich");
		Arrays.sort(array);
		print(array);
		
		/*
		 * 5. Im folgenden wird das Array zufällig gemischt und danach ausgegeben
		 * (cmp ist ein Comparator)
		 */
		System.out.println("***** Zufällig gemischt");
		Random random = new Random(); 
		Comparator<OS> cmp = (osX, osY) -> random.nextInt(3)-1; // -1, 0, 1
		Arrays.sort(array, cmp);
		
		print(array);
		
		/*
		 * 6. Aufgsteigend sortieren und nach OS 'Mac', Version 9 suchen
		 */
		System.out.println("***** Aufsteigend, natürlich");
		Arrays.sort(array);
		print(array);
		
		int pos = Arrays.binarySearch(array, new OS("Mac", 9));
		System.out.println("pos: " + pos);
		
		
		/*
		 * 7. Sortieren Sie bitte absteigend, NUR nach Version!
		 * 
		 */
		System.out.println("***** Absteigend nach Version");
		cmp = (osX, osY) -> osY.getVersion() - osX.getVersion();
		Arrays.sort(array, cmp);
		print(array);
		
		/*
		 * 8. Suchen nach Linux 3
		 */
		System.out.println("** Falsch gesucht nach Linux");
		pos = Arrays.binarySearch(array, new OS("Linux", 3));
		System.out.println("Linux 3 gefunden an der Position: " + pos); // -1
		
		System.out.println("** Richtig gesucht nach Linux");
		pos = Arrays.binarySearch(array, new OS("Linux", 3), cmp);
		System.out.println("Linux 3 gefunden an der Position: " + pos); // 2
		
	} // end of main

	private static void print(OS[] array) {
		System.out.println("*** OS-Array: ");
		int index = 0;
		for(OS os : array) {
			System.out.printf("| %d.| %-8s | %2d |%n", index++, os.getName(), os.getVersion());
		}
		
	}
	
	

}
