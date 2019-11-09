package calculator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jsoup_03 {

	public static void main(String[] args) throws IOException {
		
		
		String html ="https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
		
		Document doc = Jsoup.connect(html).get();
		String title = doc.title();
	    System.out.println("Title: " + title);
	    System.out.println();
		Elements rows = new org.jsoup.select.Elements();
		rows = doc.select("table.wikitable:nth-child(19) > tbody > tr"); 							//table.wikitable:nth-child(19) > right click/ kopieren/ CSS-Selktor    //table.wikitable:nth-child(19)
		List<Integer> columnsRange = Arrays.asList(0, 1, 11, 16);
		List<String> stadt = new ArrayList<>();
//----------------------------------------------------------------------------------		
		int a=15, b=25, c=15, d=45;
		String s1="|%-15s", s2="|%-25s", s3="|%15s", s4="|%-45s|";
		String ch1="-";
		String ch2="+";
		
		String[] formatList = {s1 , s2 , s3 , s4 };
		String fmt = s1 + s2+ s3 + s4 + "%n";									// "|%-15s|%-25s|%15s|%-45s|%n";
		
				String f1= new String(new char[a]).replace("\0", ch1);
				String f2= new String(new char[b]).replace("\0", ch1);
				String f3= new String(new char[c]).replace("\0", ch1);
				String f4= new String(new char[d]).replace("\0", ch1);
				System.out.println(ch2 + f1 + ch2 + f2 +ch2 + f3 + ch2 + f4 + ch2);
			System.out.printf(fmt, "Range (2018)", "Name", "Einwohnerzahl ","Großstadt" );
				System.out.println(ch2 + f1 + ch2 + f2 +ch2 + f3 + ch2 + f4 + ch2);
		
		  
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
			if( i < rows.size()-2)  System.out.println();
		}
        System.out.println(ch2 + f1 + ch2 + f2 +ch2 + f3 + ch2 + f4 + ch2);
        System.out.println();
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
