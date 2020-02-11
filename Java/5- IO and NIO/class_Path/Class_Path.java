package class_Path;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Class_Path {
	static final String fmt = "%-40s%s%n";
	static final String pathName = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
	public static void main(String[] args)  {
		getPath_Of("C:", "Users","CC-Student","OneDrive","myFiles");
		
		getPath_of("http://www.mieliestronk.com/corncob_lowercase.txt");
		
		getfileSystem("C:", "Users","CC-Student","OneDrive","myFiles");
		test_Methods();
	}
	
	private static void test_Methods() {
		Path path = Paths.get(pathName);
		System.out.printf(fmt,"is Absolute:", path.isAbsolute());
		System.out.printf(fmt,"get Root:", path.getRoot());
		System.out.printf(fmt,"get File Name:", path.getFileName());
		System.out.printf(fmt,"get Parent:", path.getParent());
		System.out.printf(fmt,"get Name Count:", path.getNameCount());
		
		try{ System.out.printf(fmt,"get Name:", path.getName(2));}
		catch (IllegalArgumentException e) { System.err.printf(fmt,"get Name:", e.toString());}
		
		try{
			Path subPath = path.subpath(0, 2);
			System.out.printf(fmt,"Sub Path: ", subPath.toString());
		}catch (IllegalArgumentException e) { System.err.printf(fmt,"Sub Path:", e.toString());}
		
		System.out.printf(fmt,"starts with C:", path.startsWith("C:\\"));
		System.out.printf(fmt,"starts with C:", path.endsWith("myFiles\\"));
		
		Path path1 = Paths.get("C:\\A\\B\\..\\C\\..\\D\\E\\F\\..\\G\\H");
		System.out.printf(fmt,"normalize:", path1.normalize());
		
		Path path2 = Paths.get("C:\\A\\B\\.\\C\\.\\D\\E\\F\\.\\G\\H");
		System.out.printf(fmt,"normalize:", path2.normalize());
		
		
		try{
			Path passedPath = Paths.get("*My Documents");
			Path resolvePath = path.resolve(passedPath);// if passedpath is String no need to throw exception
			System.out.printf(fmt,"Resolve Path: ", resolvePath.toString());
		}catch (InvalidPathException e) { System.err.printf(fmt,"Resolve Path:", e.toString());}
		
		
	}

	private static void getfileSystem(String first, String ...more) {
			Path path = null;
		try { path = Path.of(first, more);} 
		
        catch (IllegalArgumentException e) 		{ System.err.println(e.getMessage());} 
		catch (FileSystemNotFoundException e) 	{ System.err.println(e.getMessage());} 
        catch (SecurityException e) 			{ System.err.println(e.getMessage());} 
		System.out.printf(fmt,"Separator used for FileSystem:", path.getFileSystem().getSeparator() );
		System.out.printf(fmt,"Roots Directories used for FileSystem:", path.getFileSystem().getRootDirectories() );
		System.out.printf(fmt,"is read only:", path.getFileSystem().isReadOnly());

		
	}
	private static void getPath_Of(String first, String ...more) {
		Path path = null;
		
		try { 
			path = Path.of(first, more);
	        } 
	        catch (InvalidPathException e) { 
	            System.err.println(e.getMessage()); 
	        } 
		System.out.printf(fmt,"Path.of:", path.toString() );
	}
	
	private static void getPath_of(String str)  {
		Path path = null;
		URI	uri = null;
		try { 
			uri =  new URI(str);
			path = Path.of(uri.getSchemeSpecificPart());
		
	        } 
		catch (URISyntaxException e) 		{ System.err.println(e.getMessage());} 
	        catch (IllegalArgumentException e) 		{ System.err.println(e.getMessage());} 
			catch (FileSystemNotFoundException e) 	{ System.err.println(e.getMessage());} 
	        catch (SecurityException e) 			{ System.err.println(e.getMessage());} 
		System.out.printf(fmt,"get the path:", path.toString() );
		
	}

}
