package interface_InputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Class_Writer {
	private static final String file = "C:\\Users\\HJAN181\\OneDrive\\myFiles\\myWriting.txt";
	public static void main(String[] args) throws IOException {
		//FileWriter_V8();
		FileReader_V8();
		
		char[] cbuf = new char[8];
		
		
			
		
		
		
	}
	
	static void FileReader_V8() throws IOException {
		
		try (Reader in = new FileReader(file)){
			char ch;
			ch = (char) in.read();
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());
				
		}
		catch(FileNotFoundException e) 
		{
			System.err.println("Fahler! beim Öffnen oder Schreiben. " + e.getMessage() );
		}
	}
	static void FileWriter_V8() throws IOException {
		
	try (Writer out = new FileWriter(file)){
		out.write('H');
		out.write('E');
		out.write('L');
		out.write('L');
		out.write('O');
			
	}
	catch(IOException e) 
	{
		System.err.println("Fahler! beim Öffnen oder Schreiben. " +e.getMessage());
	}
	
	
	
}
	
}
