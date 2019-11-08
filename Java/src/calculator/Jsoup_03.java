package calculator;
import org.jsoup.Jsoup;

import personen.Person;

import java.io.IOException;

public class Jsoup_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		 org.jsoup.nodes.Document doc = Jsoup.connect("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland").get();
	        org.jsoup.select.Elements rows = doc.select("tr");
	        for(org.jsoup.nodes.Element row :rows)
	        {
	            org.jsoup.select.Elements columns = row.select("td");
	            for (org.jsoup.nodes.Element column:columns)
	            {
	            	
	                System.out.print(column.text() + "  ");
	            }
	            System.out.println();
	        }
		
		
	}

	
	public static void printPersonen(Person[] personen) {
		
		String fmt = "|%5s|%15s|%15s|%15s|%15s|%n";
		
		System.out.printf(fmt, "Nr.", "Vorname", "Nachname","Postleitzahl", "Geburtsjahr" );
		System.out.println("=======================================================================");
		for (int i = 0; i < personen.length; i++) {
			Person p = personen[i];
			System.out.format(fmt, i+1, p.getVorname(), p.getNachname(),p.getPostleitzahl(), p.getGeburtsjahr());
		}
		
	}
}
