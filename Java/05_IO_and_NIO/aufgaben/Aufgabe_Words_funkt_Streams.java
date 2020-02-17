package aufgaben;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

import javax.sound.midi.Soundbank;







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
	 static void test_readAllLines1(String file) throws IOException {
		   Path textFile = Paths.get(file);
		   
		   long count;
		   count = Files.lines(textFile)   //Steam<String>
				   		.count();
		   System.out.println("1. Zeilen: " + count);
		   
	    count= Files.readAllLines(textFile)
	    		.stream()
	    		.peek(System.out::println)//????
	    		.count();
	    System.out.println("2. Zeilen: " + count);
	    
	    
	  }
	
	public static void main(String[] args) throws IOException {


		String fileName = "C:\\Users\\HJAN181\\OneDrive\\wordlist\\corncob_caps.txt";
		List<String> englishWords = test_readAllLines(fileName);
		//englishWords.forEach(System.out::println);
		
		//Stream.of(englishWords).forEach(System.out::println);
		
		//walk_find();
		test_readAllLines1(fileName);

		
	}
	
	public static void walk_find() throws IOException {
		Path start = Paths.get("Auto").toAbsolutePath().normalize();
		System.out.println("start: " + start);
		
		long count;
		count = Files.walk(start) //Stream<Path>
					.filter(Files::isDirectory)
					.peek(System.out::println)
					.count();
		System.out.println("1. count: " + count);
		
		BiPredicate<Path, BasicFileAttributes> matcher = (path, atts) -> Files.isDirectory(path);
		int maxDepth = Integer.MAX_VALUE;
		count = Files.find(start, maxDepth, matcher)
						.count();
		
		System.out.println("2. count: " + count);
	}
	
}
