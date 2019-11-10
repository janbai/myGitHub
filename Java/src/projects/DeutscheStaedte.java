package projects;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TableFormat{
	
	public List<String> textFormat (List<Integer>columnsBreite ){
		List<String> arr = new ArrayList<>();
		arr.add("|%-" +columnsBreite.get(0) + "s|");
			for (int i = 1; i < columnsBreite.size(); i++) {
				arr.add("%" +columnsBreite.get(i) + "s|"); 
			}
		return arr;
	}
	
	public List<String> rahmen (List<Integer>columnsBreite ){
		String ch1="-", ch2="+";
		List<String> arr = new ArrayList<>();
		int a =Math.abs(columnsBreite.get(0));
		arr.add(ch2 + new String(new char[a]).replace("\0", ch1) + ch2);
			for (int i = 1; i < columnsBreite.size(); i++) {
				a =Math.abs(columnsBreite.get(i));
				arr.add(new String(new char[a]).replace("\0", ch1) + ch2); 
			}
		return arr;
	}
		
}// end of TableFormat


public class DeutscheStaedte {

static void printListFromWeb (String html, List<Integer> columnsRange,List<Integer> columnsBreite) throws IOException {
	// Title-----------------------------------
	Document doc = Jsoup.connect(html).get();
	String title = doc.title();
    System.out.println("Title: " + title);
    System.out.println();
    //------------------------------------------
    
    Elements rows = new Elements();
	rows = doc.select("table.wikitable:nth-child(19) > tbody > tr"); //table.wikitable:nth-child(19) > right click/ kopieren/ CSS-Selktor    //table.wikitable:nth-child(19)
 
	TableFormat frmt = new TableFormat();
		
	// Print Header ---------------------------------------------------------------------------- //|		
	int f = 0;																					
	Elements header = rows.get(0).select("th");	//th header											
	
	//Rahmenlinie oben ----------------------------------------------//|
			for (int i = 0; i < columnsRange.size(); i++) {			 //|
				System.out.print(frmt.rahmen(columnsBreite).get(i)); //|
			}														 //|
			System.out.println();									 //|
	//---------------------------------------------------------------//|
			
	
	for (int k = 0; k < header.size(); k++) {													 //|
		if(columnsRange.contains(k)) {															 //|
			System.out.printf(frmt.textFormat(columnsBreite).get(f), header.get(k).text() ); 	 //|
		f++;																					 //|
		}																						 //|
	}																							 //|
	System.out.println();																		 //|
	//-------------------------------------------------------------------------------------------//|
	
	
	//Rahmenlinie unter ---------------------------------------------//|
			for (int i = 0; i < columnsRange.size(); i++) {			 //|
				System.out.print(frmt.rahmen(columnsBreite).get(i)); //|
			}														 //|
			System.out.println();									 //|
	//---------------------------------------------------------------//|
	
	//Print Table ------------------------------------------------------------------------------------------//|
	for (int i = 2; i < rows.size()-2; i++) {
    	 f = 0;
    	Elements columns = rows.get(i).select("td"); //td , th header
    	for (int k = 0; k < columns.size(); k++) {
    		if(columnsRange.contains(k)) {
	    		if (k<=1) System.out.printf(frmt.textFormat(columnsBreite).get(f), columns.get((k)).text() );	
	    		if (k>1) System.out.printf(frmt.textFormat(columnsBreite).get(f), columns.get((k+9)).text() );
	    		f++;
    		}
      	}	
		System.out.println();
	}//------------------------------------------------------------------------------------------------------//|
    
	//Rahmenlinie unter ---------------------------------------------//|
			for (int i = 0; i < columnsRange.size(); i++) {			 //|
				System.out.print(frmt.rahmen(columnsBreite).get(i)); //|
			}														 //|
			System.out.println();									 //|
	//---------------------------------------------------------------//|
			String str= "";
			 int k = 2;
			long Gesamtbevölkerung=0;
			for (int i = 2; i < rows.size()-2; i++) {
		    	
		    	Elements columns = rows.get(i).select("td"); //td , th header
		    	
		    	str =  columns.get((k+9)).text().replace(".", "");
		    	
		    	
		    	Gesamtbevölkerung = Gesamtbevölkerung + Long.parseLong(str);
		    	
			}//------------------------------------------------------------------------------------------------------//|
			System.out.println(Gesamtbevölkerung);
			System.out.println();
}//end of printListFromWeb


	public static void main(String[] args) throws IOException {
		
		String html ="https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
		
		List<Integer> columnsRange = new ArrayList <>(); //List<Integer> columnsRange = Arrays.asList(0, 1, 11, 16);
		columnsRange.add(0);
		columnsRange.add(1);	
		columnsRange.add(2); //column 11: 2+9 für 2018
		columnsRange.add(3);
		columnsRange.add(4);
		columnsRange.add(7); 	// column 16 :für Bundslands
		
		List<Integer> columnsFormat = new ArrayList<>();
		columnsFormat.add(15);
		columnsFormat.add(-25);
		columnsFormat.add(15);
		columnsFormat.add(25);
		columnsFormat.add(25);
		columnsFormat.add(-45);
		
		
		printListFromWeb(html,columnsRange,columnsFormat) ;
		
		columnsRange.remove(5);
		columnsRange.remove(4);
		columnsRange.remove(3);
		columnsRange.remove(1);
		columnsRange.remove(0);
		
		printListFromWeb(html,columnsRange, columnsFormat) ;
    
	}//End of main

}//end of DeutscheStaedte
