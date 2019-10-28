package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Affe{
	
	public class AffeCmp implements Comparator<Affe>{	
	private String name;
	private int groesse;
	
	public Affe(String name, int groesse) {
		
		this.name = name;
		this.groesse = groesse;
	}
	@Override
	public String toString() {
		return name + ", " + groesse ;
	}
	
	
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	@Override
	public int compare(AffeCmp o1, AffeCmp o2) {
		// TODO Auto-generated method stub
		return o1.getGroesse()-o2.getGroesse();
	}
		
	
	
	
	
}

	
}





	
	

	

public class KleineAufgabeInnerlasse {
	private static void print(ArrayList<Affe> list) {
		for (int index = 0; index < list.size();index++) {
			
			System.out.println(list.get(index) + " ");
			//System.out.printf("| %5s | | %5s |%n",index+1, list.get(index));
		}
	}//End of printArrayList

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Affe> list =	new ArrayList<>();	
		
		
		list.add(new Affe("Affe1",50));
		list.add(new Affe("Affe2",55));
		list.add(new Affe("Affe3",80));
		list.add(new Affe("Affe4",40));
		list.add(new Affe("Affe5",38));
		
		print(list);
		
		
		
		Collections.sort(list,new AffeCmp());
		System.out.println(">TopLevelKlasse Comparator_list: " + list);
			
		
	}

}
