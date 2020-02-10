package class_File;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Class_File_get_info {
	
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
		System.out.printf(fmt , "getParentFile(): " , file.getParentFile());
		System.out.printf(fmt , "getPath(): " , file.getPath());
		System.out.printf(fmt , "getAbsolutePath(): " , file.getAbsolutePath());
		System.out.printf(fmt , "long getFreeSpace(): " , file.getFreeSpace() + " bytes");		
		System.out.printf(fmt , "long getUsableSpace(): " , file.getUsableSpace() + " bytes");				
		System.out.printf(fmt , "long getTotalSpace(): " ,file.getTotalSpace() + " bytes");				
		DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		System.out.printf(fmt , "lastModified(): " , file.lastModified() + " milliseconds = " + df.format(file.lastModified()));//milliseconds
		
		System.out.printf(fmt , "length(): " , file.length() + " bytes");
		System.out.printf(fmt , "hashcode: " , file.hashCode());		
		
		test_toPath();
		
		test_getCanonicalPath();
		test_getCanonicalFile();
		test_getCanonicalFile_Exc();
		currentWorkingDirectory();
				
	}
	
static void test_toPath() {
	File f1 = new File("C:\\Users*");
	try { f1.toPath();
		} catch (InvalidPathException e) { System.err.printf(fmt ,"test toPath(): ", e.toString());} //Unchecked exception
	
}
static void test_getCanonicalFile_Exc() {
	
	 try { 
		   File f= new File("\u0000"	); 
            System.out.println(f.getCanonicalFile()); 
	 } 
        catch (IOException e) {System.err.printf(fmt ,"test getCanonicalFile(): " , e.getMessage()); 
        } 
}
static void test_getCanonicalFile() {
	
	 try { 
		   File f= new File("c:/useRs/cc-student/oNedrive/liNks.txt"); 
            File canonicalFile = f.getCanonicalFile(); 
            System.out.printf(fmt , "Original file : " , f.getPath()); 
            System.out.printf(fmt , "Canonical file : "  , canonicalFile.toString()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
}
static void test_getCanonicalPath() {
	
	 try { 
		   File f= new File("c:/Users/cc-student/onedrive"); 
            String canonical = f.getCanonicalPath(); 
            System.out.printf(fmt , "Original file path : " , f.getPath()); 
            System.out.printf(fmt , "Canonical file path : "  , canonical); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
}
static  void currentWorkingDirectory() {
	  String location;
	  File file = new File(".");
	  try {
	    location = file.getCanonicalPath();
	  } 
	  catch (IOException e) {
	    location = file.getAbsolutePath();
	  }
	  System.out.printf(fmt , "Current Working Directory: " , location);
	}

}
