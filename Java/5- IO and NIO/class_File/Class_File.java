package class_File;


import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class Class_File {

	

	public static void main(String[] args) throws IOException {
		String fmt = "%-30s%s%n";
		System.out.printf(fmt , "System.getProperties() : " , System.getProperties());
		System.out.println("--------------------------------------");
		String parent = "C:\\Users\\CC-Student\\OneDrive";
		String child = "Links.txt";
		File p1 = new File(parent, child );//parent = null -> CF, child = null -> NullPointerExc
		System.out.printf(fmt , "toString():" , p1.toString());
				
		File path = new File(new File(parent), child);
		System.out.printf(fmt , "equals: " , p1.equals(path));
		
		String pathname = "C:\\Users\\CC-Student\\OneDrive\\Links.txt";
		File p2 = new File(pathname); //
		System.out.printf(fmt , "getAbsolutePath(): " , p2.getAbsolutePath());
		System.out.printf(fmt , "canExecute(): " , p2.canExecute());
		System.out.printf(fmt , "getName() : " , p2.getName());
		System.out.printf(fmt , "getParent(): " , p2.getParent());
		System.out.printf(fmt , "getParentFile(): " , p2.getParentFile());
		System.out.printf(fmt , "getPath(): " , p2.getPath());
		System.out.printf(fmt , "isAbsolute(): " , p2.isAbsolute());
		System.out.printf(fmt , "getAbsolutePath(): " , p2.getAbsolutePath());
		System.out.printf(fmt , "getAbsoluteFile(): " , p2.getAbsoluteFile());
		System.out.printf(fmt , "getCanonicalPath(): " , p2.getCanonicalPath());// add throws IOException
		System.out.printf(fmt , "getCanonicalFile(): " , p2.getCanonicalFile());// add throws IOException
		System.out.printf(fmt , "toURL(): " , p2.toURL());
		System.out.printf(fmt , "toURI(): " , p2.toURI());
		System.out.printf(fmt , "canRead(): " , p2.canRead());
		System.out.printf(fmt , "canWrite(): " , p2.canWrite());
		System.out.printf(fmt , "exists(): " , p2.exists());
		System.out.printf(fmt , "isDirectory(): " , p2.isDirectory());
		System.out.printf(fmt , "isHidden(): " , p2.isHidden());
		
		DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		System.out.printf(fmt , "lastModified(): " , p2.lastModified() + " milliseconds = " + df.format(p2.lastModified()));//milliseconds
		System.out.printf(fmt , "isHidden(): " , p2.isHidden());
		System.out.printf(fmt , "length(): " , p2.length() + " bytes");
		File newF1 = new File(parent, "Links100.txt");
		newF1.createNewFile();
		System.out.printf(fmt , "getAbsoluteFile(): " , newF1.getAbsoluteFile());
		newF1.delete();
		System.out.printf(fmt , "exists(): " , newF1.exists());
		System.out.println();
		
		System.out.println("*** .listRoots(): ");
			File[] roots = File.listRoots();
			for( File rt : roots ) { System.out.printf(fmt , "" , rt);}
			System.out.println();
		
		System.out.println("*** .list(): ");
			File dir1 = new File("C:\\");
			String[] itemNames = dir1.list();
			for(String iName : itemNames) {	System.out.printf(fmt , new String(new char[27]).replace("\0", " ") +"-" , iName);}
		
		System.out.println("*** .listFiles(): ");
			File dir2 = new File("C:\\Windows");
			File[] items = dir2.listFiles();
			for(File n : items) {System.out.printf(fmt , new String(new char[27]).replace("\0", " ") +"-" , n);}
		
			
			System.out.println("*** listFiles(FileFilter)");
			
			FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
			};
			
			File[] subdirs = dir2.listFiles(filter);
			
			for (File subDir : subdirs) {
				System.out.println(subDir);
			}
			
	}

}
