package deutscheStaedte;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TablePrint  {
	
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
	
		
		private void printRahmen(int size,List<Integer> columnsRange,List<Integer> columnsBreite ) {
			for (int i = 0; i < columnsRange.size(); i++) {			 
				System.out.print(rahmen(columnsBreite).get(i)); 
			}														
			System.out.println();									 
		}


	public Document getURL(String urlName) throws UncheckedIOException {
		try {
			Document doc = Jsoup.connect(urlName).get();
			return doc;
			} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}
	
	}	
	public void printListFromWeb (String urlName, List<Integer> columnsRange,List<Integer> columnsBreite) throws IOException {
		Document doc = getURL(urlName);
		
		// Print Title-----------------------------------
		String title = doc.title();
	    System.out.println("Title: " + title);
	    System.out.println();
	    //------------------------------------------
	    
	    Elements rows = new Elements();
		rows = doc.select("table.wikitable:nth-child(19) > tbody > tr"); //table.wikitable:nth-child(19) > right click/ kopieren/ CSS-Selktor    //table.wikitable:nth-child(19)
	 	
		// Print Header ---------------------------------------------------------------------------- 	
			int f = 0;																					
			Elements header = rows.get(0).select("th");	//th header											
				printRahmen(columnsRange.size(),columnsRange,columnsBreite);		//Rahmenlinie oben 
			
					for (int k = 0; k < header.size(); k++) {													 
						if(columnsRange.contains(k)) {															 
							System.out.printf(textFormat(columnsBreite).get(f), header.get(k).text() ); 	 
						f++;																					 
						}																						 
					}																							 
					System.out.println();																		 
			
				printRahmen(columnsRange.size(),columnsRange,columnsBreite);		//Rahmenlinie unter 
			
		//Print Table ------------------------------------------------------------------------------------------
		for (int i = 2; i < rows.size()-2; i++) {
	    	 f = 0;
	    	 Elements columns = rows.get(i).select("td"); //td , th header
		    	for (int k = 0; k < columns.size(); k++) {
		    		if(columnsRange.contains(k)) {
			    		if (k<=1) System.out.printf(textFormat(columnsBreite).get(f), columns.get((k)).text() );	
			    		if (k>1) System.out.printf(textFormat(columnsBreite).get(f), columns.get((k+9)).text() );
			    		f++;
		    		}
		      	}	
			System.out.println();
		}
		printRahmen(columnsRange.size(),columnsRange,columnsBreite);//Rahmenlinie unter 
		
	// die Gesamtbevölkerung finden	-----------------------------------------------------------------------------	
				String str= "";
				 int k = 2;
				 long TotalPapulation=0;
				 	for (int i = 2; i < rows.size()-2; i++) {
				    	
				    	Elements columns = rows.get(i).select("td"); //td , th header
				    	
				    	str =  columns.get((k+9)).text().replace(".", "");
				    	
				    	
				    	TotalPapulation = TotalPapulation + Long.parseLong(str);
				    	
					}
				System.out.println(TotalPapulation);
				System.out.println();
				
		}


	

	
		
	}

	




