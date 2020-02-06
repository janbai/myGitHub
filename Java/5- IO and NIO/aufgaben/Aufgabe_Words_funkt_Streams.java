package aufgaben;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;



public class Aufgabe_Words_funkt_Streams {
	public static List<String> test_readAllLines(String file) {
	   
	    List<String> lines = Collections.emptyList();
	    try {
	      lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    return lines;
	  }
	
	
	public static void main(String[] args) throws IOException {


		String fileName = "C:\\Users\\CC-Student\\OneDrive\\wordlist\\corncob_caps.txt";
		List<String> englishWords = test_readAllLines(fileName);
		//englishWords.forEach(System.out::println);
		
		//Stream.of(englishWords).forEach(System.out::println);
	
		URI copyFile = URI.create("C:\\Users\\CC-Student\\OneDrive\\wordlist\\copyFile.txt");
		Path path = Paths.get(copyFile );
			     URI u = URI.create("http://www.mieliestronk.com/corncob_caps.txt");
			     try (InputStream in = u.toURL().openStream()) {
			         Files.copy(in, path);
			     }

		
	}
	
	
}
