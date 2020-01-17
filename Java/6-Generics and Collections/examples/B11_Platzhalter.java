package examples;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

abstract class Tier {}

class Hund extends Tier {}

class Katze extends Tier {}
class Wildkatze extends Katze {}


public class B11_Platzhalter {

	public static void main(String[] args) {
		
		ArrayList<Hund> hunde = new ArrayList<Hund>();
		hunde.add(new Hund());
		hunde.add(new Hund());
		/*
		 * Collection<? extends Tier> coll = hunde
		 * 
		 * 1. Kontrolle: Collection <= IS-A <= ArrayList		: OK
		 * 2. Kontrolle: <? extends Tier> PASST <Hund>			: OK
		 */
		print(hunde);
		
//		addKatzen(hunde); // Compilerfehler
		
		Set<Katze> katzen = new HashSet<Katze>();
		katzen.add(new Katze());
		katzen.add(new Wildkatze()); // Katze e = new Wildkatze()
		/*
		 * Collection<? extends Tier> coll = katzen
		 * 
		 * 1. Kontrolle: Collection <= IS-A <= Set				: OK
		 * 2. Kontrolle: <? extends Tier> PASST  <Katze>		: OK 
		 */
		print(katzen);
		
		addKatzen(katzen);
		 
		Collection<Tier> tiere = new LinkedList<Tier>();
		tiere.add(new Katze());
		tiere.add(new Hund());
		tiere.add(new Wildkatze());
		/*
		 * Collection<? extends Tier> coll = tiere
		 * 
		 * 1. Kontrolle: Collection <= IS-A <= Collection		: OK
		 * 2. Kontrolle: <? extends Tier> PASST <Tier>			: OK 
		 */
		print(tiere);
		
		addKatzen(tiere);

		Deque<Object> objects = new ArrayDeque<>();
		objects.add(new Katze());
		objects.add(new Hund());
		objects.add(22);
		objects.add("hallo");
		
		addKatzen(objects);
		
	} // end of main
	
	/*
	 * Collection<? extends Tier> coll = var;
	 * 
	 * ? extends Tier beschreibt die erlaubten Parametrisierungen für die Variable var die in coll kopiert werden soll. 
	 * 
	 * Hier (mit ? extends Tier) wird die Parametrisierung mit Tier oder mit dem von Tier abgeleitetem Typ erlaubt.
	 * 
	 * Achtung!!!
	 * Mit einer Referenz, die mit ? extends parametrisiert wurde, lassen sich KEINE Methoden aufrufen,
	 * die den Parameter vom generischen Typparameter-Typ haben.
	 * 
	 */
	static void print(Collection<? extends Tier> coll) { 
		for(Object x : coll) {
			System.out.println(x);
		}
	
		coll.add(null);
		// coll.add(new Katze());
		// coll.add(new Hund());
		
		coll.contains(new Hund()); // contains(Object)
		coll.remove(new Katze());  // remove(Object)
		
	}
	
	/*
	 * Collection<? super Katze> coll = var;
	 * 
	 * ? super beschreibt die erlaubten Parametrisierungen für die Variable var die in coll kopiert werden soll.
	 * 
	 *  Hier (mit ? super Katze) wird die Parametrisierung mit Katze oder mit dem Basistyp für Katze erlaubt.
	 */
	static void addKatzen(Collection<? super Katze> coll) {
		coll.add(new Katze());
		coll.add(new Wildkatze());
	}
	
	
}
