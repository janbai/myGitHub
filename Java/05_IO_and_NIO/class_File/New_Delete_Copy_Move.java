package class_File;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class New_Delete_Copy_Move {
	static final String fmt = "%-30s%s%n";
	static final String pathName = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
	
	
	
	static void openDir(Path dir) {
		try {
			Desktop.getDesktop().open(dir.toFile());
			
		} catch (Exception e) {
			System.err.println("Kann das Verzeichnis nicht öffnen: " + dir);
		}
	}
	public static void main(String[] args) throws IOException {

	//	createNewFile();
	//	createNewFolder();
	//	createTempFile();
	//	deleteFile("File_C");
	//	deleteFile("File_A.txt");
	//	deleteOnExitFile("File_A.txt");
	//	createDirectories();
	//	renameToFile("File_A.txt", null);
	//	createTempFile();
	//	book_Example_01();
	//	book_Example_02();
		book_Example_03();
		
	}
	private static void book_Example_03() {
		byte[] in = new byte[50]; // bytes, not chars!
		int size = 0;
		FileOutputStream fos = null;
		FileInputStream fis = null;
		File file = new File("fileWrite3.txt");
		try {
		fos = new FileOutputStream(file); // create a FileOutputStream
		String s = "howdy\nfolks\n";
		fos.write(s.getBytes("UTF-8")); // write characters (bytes)
		// to the file
		fos.flush(); // flush before closing
		fos.close(); // close file when done
		fis = new FileInputStream(file); // create a FileInputStream
		size = fis.read(in); // read the file into in
		System.out.print(size + " "); // how many bytes read
		for(byte b : in) { // print the array
		System.out.print((char)b);
		}
		fis.close(); // again, always close
		} catch(IOException e) {
		e.printStackTrace();
		}
		Path path = FileSystems.getDefault().getPath(".");
		openDir(path);
	}
	private static void book_Example_02() {
		char[] in = new char[50]; // to store input
		int size = 0;
		try {
		File file = new File( // just an object
		"fileWrite2.txt");
		FileWriter fw =
		new FileWriter(file); // create an actual file
		// & a FileWriter obj
		fw.write("howdy\nfolks\n"); // write characters to
		// the file
		fw.flush(); // flush before closing
		fw.close(); // close file when done
		FileReader fr =
		new FileReader(file); // create a FileReader
		// object
		size = fr.read(in); // read the whole file!
		System.out.print(size + " "); // how many characters read
		for(char c : in) // print the array
		System.out.print(c);
		fr.close(); // again, always close
		} catch(IOException e) { }
		Path path = FileSystems.getDefault().getPath(".");
		openDir(path);
	}
	private static void book_Example_01() {
		try { // warning: exceptions possible
			boolean newFile = false;
			File file = new File // it's only an object
			("fileWrite1.txt");
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile); // already there?
			System.out.println(file.exists()); // look again
			} catch(IOException e) { }
		String currentDirectory = System.getProperty("user.dir");
		System.out.println("Working Directory = " + currentDirectory);
		Path myPath = Paths.get(currentDirectory);
		Path path = FileSystems.getDefault().getPath(".");
		openDir(path);
	}
	private static void createTempFile() throws IOException {
Path testSourceDir = Files.createTempDirectory("ocp_source");
		
		Files.createFile(testSourceDir.resolve("file.txt"));
		Files.createDirectory(testSourceDir.resolve("subdir"));
		Files.createFile(testSourceDir.resolve("subdir").resolve("file2.txt"));
		
		
		System.out.println("Source dir: " + testSourceDir);
		
		Path testTargetDir = Files.createTempDirectory("ocp_target");
		
		System.out.println("Target dir: " + testTargetDir);
		
//		Files.move(testSourceDir, testTargetDir, StandardCopyOption.REPLACE_EXISTING);
		Files.copy(testSourceDir, testTargetDir, StandardCopyOption.REPLACE_EXISTING);

		openDir(testSourceDir);
		openDir(testTargetDir);
			
		
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
