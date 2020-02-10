package class_File;

import java.io.File;
import java.io.IOException;

public class New_Delete_Copy_Move {
	static final String fmt = "%-30s%s%n";
	static final String pathName = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
	public static void main(String[] args) throws IOException {

		createNewFile();
		createNewFolder();
		createTempFile();
	//	deleteFile("File_C");
	//	deleteFile("File_A.txt");
		deleteOnExitFile("File_A.txt");
		createDirectories();
		renameToFile("File_A.txt", null);
	
	}
	private static void createTempFile() {
		
		
	}
	private static void renameToFile(String name1, String name2) {
		System.out.println();
		System.out.println("********** renameTo new name:");
		File oldName =  new File(pathName, name1 );
		
		try {
			File newName =  new File(pathName, name2 );
			boolean result = oldName.renameTo(newName);
			if (result) 
				System.out.printf(fmt ,"The file was renamed:", newName.getName()); 
	        else
	            System.out.println("the file is already renamed."); 
			
		} catch (NullPointerException e) {
			System.err.println(e.toString());
		}catch (SecurityException e) {	
			System.err.println(e.toString());
		}
		
	}
	private static void createDirectories() {
		System.out.println();
		System.out.println("********** create new folder:");
		String directory = "A\\B\\C\\D";
		
		File newFile =  new File(pathName , directory );
		
		try {
			if (newFile.mkdirs()) 
				System.out.printf(fmt ,"new directory was created:", newFile.getAbsoluteFile()); 
	        else
	            System.out.println("the directory is already existsed."); 
		} catch (SecurityException e) {
			System.err.println(e.toString());
		}
		
	}
	private static void deleteOnExitFile(String fileName) {
		System.out.println();
		System.out.println("********** delete a folder:");
		
		File file =  new File(pathName , fileName );
		
		try {
			if (file.exists()) { 
				file.deleteOnExit();
				System.out.printf(fmt ,"The file was deleted on exit:", file.getAbsoluteFile()); 
				
			} else
	            System.out.println("The folder is not existsed."); 
		} catch (SecurityException e) {
			System.err.println(e.toString());
		}
}
private static void deleteFile(String fileName) {
	System.out.println();
	System.out.println("********** delete a folder:");
	
	
	File file =  new File(pathName , fileName );
	
	try {
		if (file.delete()) 
			System.out.printf(fmt ,"The folder was deleted:", file.getAbsoluteFile()); 
        else
            System.out.println("The folder is not existsed."); 
	} catch (SecurityException e) {
		System.err.println(e.toString());
	}
	
		
	}
private static void createNewFolder() {
	System.out.println();
	System.out.println("********** create new folder:");
	String folderName = "Folder_01";
	
	File newFile =  new File(pathName , folderName );
	
	try {
		if (newFile.mkdir()) 
			System.out.printf(fmt ,"new folder was created:", newFile.getAbsoluteFile()); 
        else
            System.out.println("the folder is already existsed."); 
	} catch (SecurityException e) {
		System.err.println(e.toString());
	}
}
private static void createNewFile() {
	System.out.println();
	System.out.println("********** create new file:");
	String fileName = "File_A.txt";
	File newFile =  new File(pathName, fileName );
	
	try {
		if (newFile.createNewFile()) 
			System.out.printf(fmt ,"new file was created:", newFile.getAbsoluteFile()); 
        else
            System.out.println("the file is already existed."); 
		
	} catch (IOException e) {
		System.err.println(e.toString());
	}catch (SecurityException e) {
		System.err.println(e.toString());
	}
	
	
}
}
