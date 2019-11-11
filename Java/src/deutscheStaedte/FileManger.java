package deutscheStaedte;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UncheckedIOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FileManger {


public static void save(String text, String fileName) throws UncheckedIOException {
	try(PrintWriter out = new PrintWriter(fileName)) {
		out.print(text);
	} catch (FileNotFoundException e) {
		throw new UncheckedIOException("Text kann nicht gespeichert werden", e);
	}
}

public static String loadFromFile(String fileName) {
	try {
		FileReader r = new FileReader(fileName);
		
		return read(r);
		
	} catch (IOException e) {
		throw new UncheckedIOException("Kann den Text nicht laden", e);
	}
}
private static String read(Reader r) throws IOException {

	try(BufferedReader in = new BufferedReader( r )) {
		
		StringBuilder sb = new StringBuilder();
		String line;
		while( (line = in.readLine()) != null ) {
			sb.append(line).append("\n");
		}
		
		return sb.toString();
	}
}

}
