package class_File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Class_File_list_listFiles {
	static final String fmt = "%-30s%s%n";
	public static void main(String[] args) {
		
	// test_listRoots();
	// test_list();
	// test_listFiles();
	// test_listFiles_Filter();
	 test_list_Filter();
	 

	}
static void test_listRoots() {
	
	System.out.println("*** .listRoots(): ");
	File[] roots = File.listRoots();
	for( File rt : roots ) { System.out.printf(fmt , "" , rt);}
	System.out.println();
}

static void test_list() {
	System.out.println("*** .list(): ");
	File dir = new File("C:\\");
	String[] itemNames = dir.list();
	for(String iName : itemNames) {	System.out.printf(fmt , new String(new char[27]).replace("\0", " ") +"-" , iName);}

}
static void test_list_Filter() {
	System.out.println("*** list(FileFilter)");
	File dir = new File("C:\\Users\\CC-Student\\OneDrive");
	String name = "OneDrive";
	FilenameFilter filter = new FilenameFilter() {
		

		@Override
		public boolean accept(File dir, String name) {
			// && dir.isDirectory()
			return name.toLowerCase().contains("link");
		}
	};
	
	String[] names = dir.list(filter);
	
	for (String subDir : names) {
		 System.out.printf(fmt , "" ,subDir);
	}	

}

static void test_listFiles() {
	System.out.println("*** .listFiles(): ");
	File dir = new File("C:\\Windows");
	File[] items = dir.listFiles();
	for(File n : items) {System.out.printf(fmt , new String(new char[27]).replace("\0", " ") +"-" , n);}
}

static void test_listFiles_Filter() {
	System.out.println("*** listFiles(FileFilter)");
	File dir = new File("C:\\Users\\CC-Student\\OneDrive");
	FileFilter filter = new FileFilter() {
		@Override
		public boolean accept(File pathname) {
			return pathname.isDirectory();
		}
	};
	
	File[] subdirs = dir.listFiles(filter);
	
	for (File subDir : subdirs) {
		 System.out.printf(fmt , "" ,subDir);
	}
}
}
