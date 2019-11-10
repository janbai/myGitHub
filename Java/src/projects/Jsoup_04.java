package projects;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import personen.Person;

public class Jsoup_04 {

	public static void main(String[] args) throws IOException {
		 URL url = new URL("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland");
		    Document doc = Jsoup.parse(url, 3000);

		    ArrayList<String> downServers = new ArrayList<>();
		    Element table = doc.select("table").get(0); //select the first table.
		    Elements rows = table.select("tr");

		    for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
		        Element row = rows.get(i);
		        Elements cols = row.select("td");

		        if (cols.get(3).text().equals("Titan")) {
		            if (cols.get(7).text().equals("down"))
		                downServers.add(cols.get(5).text());

		            do {
		                if(i < rows.size() - 1)
		                   i++;
		                row = rows.get(i);
		                cols = row.select("td");
		                if (cols.get(7).text().equals("down") && cols.get(3).text().equals("")) {
		                    downServers.add(cols.get(5).text());
		                }
		                if(i == rows.size() - 1)
		                    break;
		            }
		            while (cols.get(3).text().equals(""));
		            i--;
		        }
		    }
		    System.out.println(downServers);

	}
	public static void printtable(Person[] personen) {
		
		String fmt = "|%5s|%15s|%15s|%15s|%15s|%n";
		
		System.out.printf(fmt, "Nr.", "Vorname", "Nachname","Postleitzahl", "Geburtsjahr" );
		System.out.println("=======================================================================");
		for (int i = 0; i < personen.length; i++) {
			Person p = personen[i];
			System.out.format(fmt, i+1, p.getVorname(), p.getNachname(),p.getPostleitzahl(), p.getGeburtsjahr());
		}
		
	}
}
