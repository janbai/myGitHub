package write_read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Class_BufferReader {
	private static final String file = "C:\\Users\\HJAN181\\OneDrive\\myFiles\\myWriting.txt";
	public static void main(String[] args) throws FileNotFoundException {


		Reader r= new FileReader(file);
		BufferedReader in = new BufferedReader(r, 32); //buffer size = 32
		String line;

		
		 try {
	       
	         
	         while ((line = in.readLine()) != null) {
	            System.out.println(line);
	         }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}

}
