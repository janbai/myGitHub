package functional;

import java.util.ArrayList;

interface Filter {
	public abstract boolean istOk(int value);
}

	class FilterGerade implements Filter {
		@Override
		public boolean istOk(int value) {
			return value %2 == 0;
		}
	}//End of FilterGerade
	
	class FilterPositive implements Filter {
		@Override
		public boolean istOk(int value) {
			return value > 0;
		}
	}//End of FilterPositive
	
	class FilterStartMitEins implements Filter {
		@Override
		public boolean istOk(int value) {
			String valueAsString = String.valueOf( Math.abs(value) );
			return valueAsString.charAt(0) == '1';
		}
	}

public class AufgabeFiltern_interface {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("list: " + list);

		ArrayList<Integer> listGerade = filtern(list, new FilterGerade());
		System.out.println("list gerade: " + listGerade); // 12, 14, -4
	
		ArrayList<Integer> listPositive = filtern(list, new FilterPositive());
		System.out.println("list positive: " + listPositive); // 12, 13, 14, 15, 77
		
		ArrayList<Integer> listStartenMit1 = filtern(list, new FilterStartMitEins());
		System.out.println("list mit Zahlen die mit 1 starten: " + listStartenMit1); // 12, 13, 14, 15
	
	} // end of main

	static ArrayList<Integer> filtern(ArrayList<Integer> list, Filter filter) {
		ArrayList<Integer> back = new ArrayList<>();
		
		for (Integer value : list) {
			if( filter.istOk(value) ) {
				back.add(value);
			}
		}
		return back;
	}
}






















