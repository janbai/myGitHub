package class_File;

import java.io.File;

public class File_new_delete {
	static final String fmt = "%-30s%s%n";
	
	public static void main(String[] args) {
		
		String pathname = "C:\\Users\\CC-Student\\OneDrive\\Links.txt";
		
		File file = new File(pathname); // File Object
		System.out.printf(fmt , "toString():" , file.toString());
		System.out.printf(fmt , "toURI(): " , file.toURI());
		
		
		System.out.printf(fmt , "getClass(): " , file.getClass());
		
		System.out.printf(fmt , "getAbsoluteFile(): " , file.getAbsoluteFile());
		System.out.printf(fmt , "getName() : " , file.getName());
		System.out.printf(fmt , "getParent(): " , file.getParent());
	}
}
