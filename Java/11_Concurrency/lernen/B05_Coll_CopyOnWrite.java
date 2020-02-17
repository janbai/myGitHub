package lernen;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class B05_Coll_CopyOnWrite {

	public static void main(String[] args) {

		
		/*
		 * Achtung! Sehr langsam beim Hinzufügen neuer Elemente!
		 * 
		 * 'add, set, and so on are implemented by making a fresh copy of the underlying array' 
		 * 
		 * Vorteile:
		 * 
		 * 	- threadsicher
		 *  - lesen wird nicht unnötig synchronisiert
		 *  
		 *  Gedacht für den Einsatz:
		 *  
		 *  	häufiger Lesezugriffe mit 'get', seltenes Erweitern mit 'add'
		 */
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		
		CopyOnWriteArraySet Set = new CopyOnWriteArraySet<>();
		
		

	}

}
