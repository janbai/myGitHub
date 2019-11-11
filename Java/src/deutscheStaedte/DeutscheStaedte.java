package deutscheStaedte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class DeutscheStaedte {


	public static void main(String[] args) throws IOException  {
		
		String urlName ="https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
		
		
		List<Integer> columnsRange = new ArrayList <>(); //List<Integer> columnsRange = Arrays.asList(0, 1, 11, 16);
		columnsRange.add(0); // 0 :Columns No. 1 in website
		columnsRange.add(1);	
		columnsRange.add(2); //column No. 11 in website: 2+9 (für 2018)
		columnsRange.add(3);
		columnsRange.add(4);
		columnsRange.add(7); 	// column 16 in website :für Bundslands
		
		List<Integer> columnsBreite = new ArrayList<>();
		columnsBreite.add(15); // die erste Spaltenbreite
		columnsBreite.add(-25);// die zweite Spaltenbreite
		columnsBreite.add(15);
		columnsBreite.add(25);
		columnsBreite.add(25);
		columnsBreite.add(-45);
		
		TablePrint print1 =new TablePrint();
		print1.printListFromWeb(urlName,columnsRange,columnsBreite) ;
		
		columnsRange.remove(5);
		columnsRange.remove(4);
		columnsRange.remove(3);
		columnsRange.remove(1);
		columnsRange.remove(0);
		
		print1.printListFromWeb(urlName, columnsRange, columnsBreite);
		
	}//End of main

}//end of DeutscheStaedte
