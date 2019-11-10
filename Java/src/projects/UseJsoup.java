package projects;
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; 


public class UseJsoup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	String html = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";
		
		Document doc1 = Jsoup.parse(html);
				
		System.out.println(doc1);		

		 Document doc = Jsoup.connect("https://www.msn.com/de-de/?PC=UF01&AR=6").get();  
         String title = doc.title();  
         System.out.println("title is: " + title);  
         Elements links = doc.select("a[href]");  
         for (Element link : links) {  
             System.out.println("\nlink : " + link.attr("href"));  
             System.out.println("text : " + link.text());  
         } 
         
         
	}

}
