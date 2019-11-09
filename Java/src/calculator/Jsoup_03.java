package calculator;
import org.jsoup.Jsoup;

import personen.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jsoup_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		org.jsoup.select.Elements rows = new org.jsoup.select.Elements();
		 

		List<Integer> columnsRange = Arrays.asList(0, 1, 11, 16);
		String[] formatList = {"|%-10s" , "|%-25s" , "|%15s" , "|%-45s|" };
		String fmt = "|%-10s|%-25s|%15s|%-45s|%n";
		List<String> stadt = new ArrayList<>();
		
		
		System.out.printf(fmt, "Range", "Name", "Einwohnerzahl ","Großstadt" );
	//	System.out.println("1234567891123456789212345678931234567894123456789512345678961234567897123456789812345678991234567890");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		org.jsoup.nodes.Document doc = Jsoup.connect("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland").get();
	    rows = doc.select("table.wikitable:nth-child(19) > tbody > tr"); //table.wikitable:nth-child(19) > tbody:nth-child(2) > tr:nth-child(1)
	       
	      
        for (int i = 2; i < rows.size(); i++) {
        	int f = 0;
        	org.jsoup.select.Elements columns = rows.get(i).select("td");
        	
			for (int k = 0; k < columns.size(); k++) {
					if(columnsRange.contains(k)) {
						if (k== 1) stadt.add(columns.get(k).text());
					System.out.printf(formatList[f], columns.get(k).text() );
					f++;
				}
			}
			System.out.println();
		}
	        
     /*   for(org.jsoup.nodes.Element row :rows) {
            j++;
        	if(j<3) continue;
        	org.jsoup.select.Elements columns = row.select("td");
            int i = 0;
            for (org.jsoup.nodes.Element column:columns)
            {
            	if((i == 0 || i == 1  || i== 11 || i == 16) && column.text().replaceAll(" ","") != "") {
            		System.out.printf(fmt1, column.text() );
            	}
                i++;
            }
            System.out.println();
        }
	*/
		
        for (String string : stadt) {
        	System.out.println(string + " ");
			
		}
        
	}



}
