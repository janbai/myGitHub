package aufgaben;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test_Move {

	static Path testSource;
	static {
		
		Path src = Paths.get("abc.txt");
		
		try {
			testSource = Files.copy(src, src.getParent().resolve("buchstaben"), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
			//e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println(testSource);
		boolean result;
		result= Files.isRegularFile(testSource);
		System.out.println("result: " + result);
		System.out.println(Files.size(testSource));
	result = Files.isExecutable(testSource);
	System.out.println(result);

	}

}
