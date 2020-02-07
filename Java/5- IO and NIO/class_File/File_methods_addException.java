package class_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class File_methods_addException {
	static final String fmt = "%-30s%s%n";
	
	public static void main(String[] args) throws IOException {


		String child = "File_A";
		String parent = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
		File file =  new File(parent, child );
		
		
		

		
		
		File newF1 = new File(parent, "Links100.txt");
		newF1.createNewFile();
		System.out.printf(fmt , "getAbsoluteFile(): " , newF1.getAbsoluteFile());
		newF1.delete();
		System.out.printf(fmt , "exists(): " , newF1.exists());
	}

}
