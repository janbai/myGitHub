package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class TopLevelCmp implements Comparator<Integer>{

	
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
	
	
}


public class Loesungswege_mit_Sprachmitteln {

	
	private static class NestedCmp implements Comparator<Integer>{

		
		public int compare(Integer o1, Integer o2) {
			
			return o2-o1;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<Integer>();

       
        list.add(13);
        list.add(22);
        list.add(-7);
        list.add(0);
       
     

		Collections.sort(list,new TopLevelCmp());
		System.out.println(">TopLevelKlasse Comparator_list: " + list);
			
		Collections.sort(list,new NestedCmp());
		System.out.println(">>Innere Klassen Comparator_list: " + list);
			
		class LocalCmp implements Comparator<Integer>{
			public int compare(Integer o1, Integer o2) {
			return o2-o1;
			}
		}// End of LocalCmp
		
		Collections.sort(list,new LocalCmp());
		System.out.println(">>>Local Comparator_list: " + list);
		
	
		Comparator<Integer> anonymeCmp= new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
				}
		};
		Collections.sort(list,anonymeCmp);
		System.out.println(">>>>Anonyme Comparator_list: " + list);
		
		Collections.sort(list,new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
				}
			
		});
		
		System.out.println(">>>>>Anonyme Comparator_list: " + list);
		
		Collections.sort(list, (i1, i2) -> i2-i1);
		
		System.out.println(">>>>>lambda Comparator_list: " + list);
		
	}

	
	
}
