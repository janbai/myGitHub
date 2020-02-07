package aufgaben;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Files_Attribute {
	static final String fmt = "%-20s%s%n";
	
	static void attributes() throws IOException {
		
		Path path = Paths.get("C:\\Users\\HJAN181\\OneDrive\\Links.txt");
		System.out.println("**** Attributes");
		BasicFileAttributes basicAtts = null;
		DosFileAttributes dosAtts = null;
		PosixFileAttributes posiAtts = null;
		Object objAtts = Files.getAttribute(path, "size");
		System.out.println(Files.getAttribute(path, "basic:size"));
		System.out.println(Files.getAttribute(path, "dos:creationTime"));
		System.out.println(Files.getAttribute(path, "dos:hidden"));
		
		
	}
	public static void main(String[] args) throws IOException {
Path pathname = Paths.get("C:\\Users\\HJAN181\\OneDrive\\Links.txt");
		
		
FileTime lastModified = Files.getLastModifiedTime(pathname);
System.out.printf(fmt , "lastModified(): " , lastModified  );
	lastModified = FileTime.from(0,TimeUnit.DAYS);
	System.out.printf(fmt , "lastModified(): " , lastModified  );
	
	
	BasicFileAttributeView view = Files.getFileAttributeView(pathname, BasicFileAttributeView.class);
	
	System.out.println(view.toString());

	
	FileTime lastAccessTime = null;
	FileTime createTime = null;
	FileTime lastModifiedTime = FileTime.from(Instant.now());
	view.setTimes(lastModifiedTime , lastAccessTime, createTime);
	lastModified = Files.getLastModifiedTime(pathname);
	System.out.println(lastModified);
		
	BasicFileAttributes atts = view.readAttributes();
	System.out.println(atts.lastAccessTime());
	System.out.println(atts.creationTime());
	
	attributes();
	}

}
