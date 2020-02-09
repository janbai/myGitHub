package class_File;

import java.io.File;
import java.io.IOException;


public class New_Delete_Copy_Move {
	static final String fmt = "%-30s%s%n";
	
	public static void main(String[] args) throws IOException {

		System.out.println("**********");
		createNewFile();
		

	}
static void createNewFolder() {
	try { 
		  
        // Get the file 
        File f = new File("C:\\Users\\CC-Student\\OneDrive\\myFiles\\program.txt"); 

        // Create new file 
        // if it does not exist 
        if (f.createNewFile()) 
            System.out.println("File created"); 
        else
            System.out.println("File already exists"); 
    } 
    catch (Exception e) { 
        System.err.println(e); 
    } 
}
static void createNewFile() {
	System.out.println("********** create new Folder:");
	String fileName = "newCreatedFile_A.txt";
	String pathName = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
	File newFile =  new File(pathName, fileName );
	System.out.printf(fmt , "getAbsoluteFile(): " , newFile.getAbsoluteFile());
	System.out.printf(fmt , "getName() : " , newFile.getName());
	System.out.printf(fmt , "getParent(): " , newFile.getParent());
	try {
		newFile.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.printf(fmt , "create new Text File: " , newFile.getAbsoluteFile() + " : " + newFile.exists());

}
}
