package calculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;

import org.jsoup.Jsoup;



public class Jsoup_02 {

	public static void main(String[] args) throws IOException {

		  
	        
	        
	  //      [https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland]
	    //    	( https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland )   
	        
	        
	        
	        java.net.URL url = new java.net.URL("https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland");   
			InputStream is = url.openStream();   
			Reader r = new InputStreamReader(is);   
			
			try(BufferedReader in = new BufferedReader( r )) {
				
				StringBuilder sb = new StringBuilder();
				String line;
				
				while( (line = in.readLine()) != null ) {
					sb.append(line).append("\n");
					
				}
				System.out.println(sb);
				
				
			} catch (IOException e) {
				throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
			}
			
			
			
			
			
			
	  
	
	
	}
	
}
