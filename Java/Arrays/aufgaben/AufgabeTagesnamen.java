package aufgaben;

public class AufgabeTagesnamen {

	public static void main(String[] args) {
	

		/*
		 * A1. Erzeugen Sie 4 folgende Arrays:
		 */
		
		// a1:
		// Montag, Dienstag, Mittwoch, Donnerstag, Freitag
		
		
		String [] a1 = { "Montag" , "Dienstag" , "Mittwoch" , "Donnerstag" , "Freitag"};

		// a2:
		// Mo, Di, Mi, Do, Fr
		String [] a2 = { "Mo" , "Di" , "Mi" , "Do" , "Fr"};
		
		// a3:
		// Samstag, Sonntag
		String [] a3 = { "Samstag" , "Sonntag"};
		
		// a4:
		// Sa, So
		String [] a4 = { "Sa" , "So"};
		
		/*
		 * Bitte alle 4 Arrays in einem String[][] speichern
		 * und danach alle Inhalte aus dem String[][] ausgeben.
		 */
		
		String [][] array2D = new String [4][];
		
		array2D[0] = a1;
		array2D[1] = a2;
		array2D[2] = a3;
		array2D[3] = a4;
		for (String[] subArray : array2D) {
			for (String s : subArray) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
		String [][] nochEinArray2D = {a1, a2, a3, a4};
		for (String[] subArray : nochEinArray2D) {
			for (String s : subArray) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		
		
	}// End of main

}
