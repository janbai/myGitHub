package examples;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
class Tier {}
class Hund extends Tier  {}
class Katze extends Tier {}
class wildKatze extends Katze {}





public class WDH02 {
	
	public static void main(String[] args) {
	
		ArrayList<Hund> hunde = new ArrayList<>();
		hunde.add(new Hund());
		hunde.add(new Hund());
		print(hunde);
		//addKatze(hunde);//Compilation Fail
		
		Set<Katze> katzen = new HashSet<Katze>();
		katzen.add(new Katze());
		katzen.add(new Katze());
		print(katzen);
		addKatze(katzen);
		
		Collection<Tier> tiere = new LinkedList<Tier>();
		tiere.add(new Katze());
		tiere.add(new Hund());
		tiere.add(new wildKatze());
		print(tiere);
		addKatze(tiere);
		
		Deque<Object> objects = new ArrayDeque<>();
		objects.add(new Katze());
		objects.add(new Hund());
		objects.add(22);
		objects.add("hallo");
		print(objects);
		addKatze(objects);
		
	}//end of end

	

	static  void print(Collection< ? extends Object  > coll) {
		for (Object x : coll) {
		
			System.out.println(x);
		}
	}
	
	static void addKatze(Collection<? super Katze>coll) {
			coll.add(new Katze());
			coll.add(new wildKatze());
		
	}
	
}
