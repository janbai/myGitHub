package aufgabe_Autos;

import java.util.*;

public class AufgabeCollectionsAutos {

	public static void main(String[] args) {


        /*
         * A3
         */
        VW vw1 = new VW("Golf", 1990);
		System.out.println(vw1); //VW. Modell: Golf, Baujahr 1990
		
		VW vw2 = new VW("Polo", 2012);
		VW vw3 = new VW("Golf", 2007);
        
		
		/*
		 * A4, A5
		 */
		System.out.println("*** A4, A5");

		LinkedList<VW> listVW = new LinkedList<>();
		listVW.add(vw1);
		listVW.add(vw2);
		listVW.add(vw3);
		
		listVW.add(vw1);
		listVW.add(new VW("Golf", 1990));
		
		print(listVW); 
		
		HashSet<VW> hashSetVW = new HashSet<>(listVW); // HashSet(Collection<? extends E> c)
		
		print(hashSetVW); // 3
		
		TreeSet<VW> treeSetVW = new TreeSet<>(listVW);
		
		print(treeSetVW); // 3
		
		PriorityQueue<VW> queueVW = new PriorityQueue<>(listVW);
		
		print(queueVW);
		
		System.out.println("-------------- PriorityQueue leeren: ");
		while(!queueVW.isEmpty()) {
			System.out.println(queueVW.remove());
		}
		
		
		/*
		 * A6
		 */

		System.out.println("*** A6");
		
		BMW bmw1 = new BMW("Z4", 2000);
        System.out.println(bmw1); //BMW. Modell: Z4, Baujahr 2000
        
        BMW bmw2 = new BMW("Z6", 2015);
        
        ArrayList<BMW> listBMW  = new ArrayList<>();
        listBMW.add(bmw1);
        listBMW.add(bmw2);
        listBMW.add(new BMW("Z4", 2000));
		
        print(listBMW);
        
        HashSet<BMW> hashSetBMW = new HashSet<BMW>(listBMW);
        
        print(hashSetBMW);
        
        TreeSet<BMW> treeSetBMW = new TreeSet<BMW>(listBMW);
        
        print(treeSetBMW);
        
        ArrayDeque<BMW> dequeBMW = new ArrayDeque<BMW>(listBMW);
        
        print(dequeBMW);
        
        
        /*
         * A7
         */
        System.out.println("*** A7.");
        
        System.out.println("hashSetBMW.contains(bmw1): " + hashSetBMW.contains(bmw1)); // true
        
        
        /*
         * A8.
         */
        System.out.println("*** A8");
        
        System.out.println("VORHER. bmw1: " + bmw1);
        bmw1.setBaujahr(2222);
        System.out.println("NACHHER. bmw1: " + bmw1);
        
        System.out.println("hashSetBMW.contains(bmw1): " + hashSetBMW.contains(bmw1)); // false
        
        /*
         * A9.
         */
        System.out.println("*** A9");
        
        listVW.add(new VW("Polo", 2200));
        
        print(listVW);
        	
        /*
         * A10
         */
        
        System.out.println("*** A10. Falsche Suche in einer nicht-sortierten Liste");
        
        int pos = Collections.binarySearch(listVW, new VW("Polo", 2200));
        System.out.println( "nach Polo 2200 suchen: " + pos); // 5 (nur zufällig, die Liste sollte sortiert werden) 
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 2012));
        System.out.println( "nach Polo 2012 suchen: " + pos); // -6 (nicht gefunden, die Liste sollte sortiert werden)
        
        
        /*
         * A11
         */
        System.out.println("*** A11. ");
        
        Collections.sort(listVW);
        
        System.out.println("---- aufsteigend sortiert:");
        print(listVW);
        
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 2200));
        System.out.println( "nach Polo 2200 suchen: " + pos); // 5
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 2012));
        System.out.println( "nach Polo 2012 suchen: " + pos); // 4
    
        
        /*
         * A12
         */
        System.out.println("*** A12. ");
        
        Collections.sort(listVW, Comparator.reverseOrder());
        Collections.sort(listVW, Collections.reverseOrder());
        
        System.out.println("---- absteigend sortiert:");
        print(listVW);
        
        /*
         * A13
         */
        System.out.println("*** A13. ");
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 2200)); // Falsch
        System.out.println( "Falsch nach Polo 2200 suchen: " + pos); // -7
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 2200), Comparator.reverseOrder()); //
        System.out.println( "Richtig nach Polo 2200 suchen: " + pos); // 0
        
        
        /*
         * A14
         */
        System.out.println("*** A14. ");
        
        pos = Collections.binarySearch(listVW, new VW("Polo", 3300), Comparator.reverseOrder()); 
        System.out.println( "Richtig nach Polo 3300 suchen: " + pos); // -1
        
	} // end of main

	
	static void print(Collection<? extends Auto<?>> autos) {
		System.out.println("-------- " + autos.getClass());
		
		int i = 0;
		for(Auto<?> a : autos) {
			System.out.printf("%d. %s %n", i++, a);
		}
		
		/*
		 * auch OK:
		 * 
		Iterator<Auto> iterator = autos.iterator();
		for (int i = 0; i < autos.size(); i++) {
			System.out.printf("%d. %s %n", i, iterator.next());
		}
		*/
	}


	
	
	
	static void testComparable() {
		
		BMW bmw1 = new BMW("Z4", 2000);
		VW vw1 = new VW("Golf", 1990);
		
//		vw1.compareTo(bmw1);
//		bmw1.compareTo(vw1);
		
		List<Auto<?>> listAutos = new ArrayList<>();
		
		listAutos.add(new BMW("Z4", 2000));
		listAutos.add(new VW("Golf", 2003));
		
		/*
		 * Ich möchte, dass das Sortieren der eventuell gemischten Autos (VW und BMW) nicht erlaubt ist
		 */
		// Collections.sort(listAutos); // <T extends Comparable<? super T>> void sort(List<T> list)
		
		ArrayList<BMW> listBMW  = new ArrayList<>();
        listBMW.add(new BMW("Z5", 2000));
        listBMW.add(new BMW("Z4", 2000));
		
        /*
         * Liste mit BMW muss sortierbar sein
         */
        Collections.sort(listBMW);
        
        
        LinkedList<VW> listVW = new LinkedList<>();
		listVW.add(new VW("Polo", 1990));
		listVW.add(new VW("Golf", 1990));

		/*
         * Liste mit VW muss sortierbar sein
         */
        Collections.sort(listVW);
	}
}
