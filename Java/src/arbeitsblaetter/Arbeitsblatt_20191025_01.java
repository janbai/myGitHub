package arbeitsblaetter;

import java.util.ArrayList;
import java.util.Random;

public class Arbeitsblatt_20191025_01  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list =	new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("A1)---------------------");
		printIntegerList(list);
		
		ArrayList<Integer> listGerade =	filtern(list);
		
		
	}
	
	private static ArrayList<Integer> filtern(ArrayList<Integer> list, String logik){
		ArrayList<Integer> arr =	new ArrayList<>();
		logik="gerade";
		for (Integer value : list) {
			
			arr.add(i);
		}
		return list;
	}
	
	
	private static void printIntegerList(ArrayList<Integer> intlist) {
		for (int index = 0; index < intlist.size();index++) {
			
			System.out.print(intlist.get(index) + " ");
			//System.out.printf(" %02d. %3d %n",index+1, intlist.get(index));
		}
	}//End of printArrayList
	
	
}
