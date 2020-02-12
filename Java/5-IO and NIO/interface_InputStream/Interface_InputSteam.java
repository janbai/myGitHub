package interface_InputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;

public class Interface_InputSteam {
	 private static final String FILE_TO = "C:\\Users\\HJAN181\\OneDrive\\Links.txt";
	
	 
	 public static void main(String[] args) throws MalformedURLException, IOException {
		 URI u = URI.create("https://www.google.com/");
	        try (InputStream inputStream = u.toURL().openStream()) {
	            File file = new File(FILE_TO);
	            copyInputStreamToFile(inputStream, file);
		
	        	}
		

}


	private static void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {

		try (FileOutputStream outputStream = new FileOutputStream(file)) {

	            int read;
	            byte[] bytes = new byte[1024];

	            while ((read = inputStream.read(bytes)) != -1) {
	                outputStream.write(bytes, 0, read);
	            }
		}	
	}
}