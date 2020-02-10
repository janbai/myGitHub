package class_File;
import java.io.File;

public class File_boolean_is_can {

	public static void main(String[] args) {
		
 //**** Throws:SecurityException - If a security manager exists 
		String fmt = "%-20s%s%n";
		String pathname = "C:\\Users\\CC-Student\\OneDrive\\Links.txt";
		File file = new File(pathname); //
		
		System.out.printf(fmt , "canExecute(): " , file.canExecute());
		System.out.printf(fmt , "isAbsolute(): " , file.isAbsolute());
		System.out.printf(fmt , "canRead(): " , file.canRead());
		System.out.printf(fmt , "canWrite(): " , file.canWrite());
		System.out.printf(fmt , "exists(): " , file.exists());
		System.out.printf(fmt , "isDirectory(): " , file.isDirectory());
		System.out.printf(fmt , "isHidden(): " , file.isHidden());
		System.out.printf(fmt , "isFile(): " , file.isFile());
		
		String parent = "C:\\Users\\CC-Student\\OneDrive";
		String child = "Links.txt";
		
		File p1 = new File(parent, child );//parent = null -> CF, child = null -> NullPointerExc
					
		File p2 = new File(new File(parent), child);
		System.out.printf(fmt , "equals: " , p1.equals(p2));
		System.out.printf(fmt , "compareTo: " , p1.compareTo(p2));
		
	}
}
