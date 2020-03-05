package class_Files;


import java.io.IOException;
import java.net.URI;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B09_Files_create_delete {

	public static void main(String[] args) {
//		test_createFile();
//		test_createDirectory();
//		test_createDirectories();
		test_delete();
		test_deleteIfExist();
	}
	
	
	static void test_deleteIfExist() {
		System.out.println("*** delete");
		Path path = Paths.get("nichtda");
		try {
			Files.deleteIfExists(path);
			System.out.println("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Files.delete(path );
			System.out.println("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	
	static void test_delete() {
		System.out.println("*** delete");
		Path path = Paths.get("nichtda");
		try {
			Files.delete(path );
			System.out.println("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Files.delete(path );
			System.out.println("a");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			URI uri=null;;
			Paths.get(uri).d
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	static void test_createDirectories() {
		System.out.println("*** createDirectories");
		
		Path dir = Paths.get( "a/b/c/d/e" );
		
		try {
			
			Path result = Files.createDirectories(dir);
			System.out.println("Erzeugt: " + result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Aufräumen 
		 */
		try {
			/*
			 * kleine Aufgabe: löschen Sie die zuvor erzeugten Verzeichnisse a/b/c/d/e mit einer Schleife 
			 */
			Path parent = dir;
			while(parent!= null) {
				System.out.println("Lösche: " + parent);
				Files.delete(dir);
				parent = parent.getParent();
				
			}
				
			
			
			dir = dir.getParent();
			Files.delete(dir); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	static void test_createDirectory() {
		/*
		 * Path createDirectory(Path dir, FileAttribute<?>... attrs)
		 */
		System.out.println("*** createDirectory");
		
		Path dir = Paths.get("zoo"); 

		/*
		 * 1. Wenn es das Verzeichnis zoo nicht gibt, wird es erzeugt
		 */
		try {
			Path result = Files.createDirectory(dir);
			System.out.println("Verzeichnis erstellt: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 2. Falls das Verzeichnis bereits exisitiert, wird die FileAlreadyExistsException geworfen
		 */
		try {
			Files.createDirectory(dir);
			
		} catch (FileAlreadyExistsException e) {
			System.err.println("2. Fehler: " + e);  // Verzeichnis bereits exisitiert
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		/*
		 * 3. Falls eine Datei bereits exisitiert, die genauso heißt wie das anzulegende Verzeichnis,
		 *    wird die FileAlreadyExistsException geworfen
		 */
		try {
			Files.createFile(Paths.get("hunde")); // neue Datei zum Testen
			Files.createDirectory(Paths.get("hunde")); // FileAlreadyExistsException
			
		} catch (FileAlreadyExistsException e) {
			System.err.println("3. Fehler: " + e);  // Gleichnamige Datei bereits exisitiert
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		/*
		 * 4. Damit das Verzeichnis subdir erstellt werden kann, müssen alle Parent-Verzeichnisse
		 *    bereits exisitieren. In diesem Fall lieber die Methode createDirectories verwenden.
		 */
		try {
			
			Files.createDirectory( Paths.get("nichtda/a/b/c/subdir") ); // NoSuchFileException
			
		} catch (IOException e) {
			System.err.println("4. Fehler: " + e);  // NoSuchFileException
			
		}
		
		
		/*
		 * Aufräumen
		 */
		try {
			
			Files.delete(dir);
			Files.delete(Paths.get("hunde"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void test_createFile() {
		/*
		 * Path createFile(Path path, FileAttribute<?>... attrs)
		 */
		System.out.println("*** createFile");

		Path file = Paths.get("tiere.txt");
		System.out.println("file: " + file);
		
		
		/*
		 * 1. Wenn es die Datei tiere.txt nicht gibt, wird sie erzeugt: 
		 */
		try {
			Path result = Files.createFile(file);
			System.out.println("1. Datei erzeugt: " + result); // dasselbe wie file
			
		}  catch (IOException e) {
			e.printStackTrace();
		}

		
		/*
		 * 2. Falls die Datei bereits exisitiert, wird die FileAlreadyExistsException geworfen
		 */
		try {
			Files.createFile(file);
			
		} catch (FileAlreadyExistsException e) {
			System.err.println("2. Fehler: " + e);  // Datei bereits exisitiert
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

		/*
		 * 3. Falls das Zielverzeichnis nicht existiert, wird die NoSuchFileException geworfen
		 */
		try {
			Files.createFile( Paths.get("nichtda/file.txt") );
			
		} catch (IOException e) {
			System.err.println("3. Fehler: " + e);  // java.nio.file.NoSuchFileException: nichtda\file.txt
			
		}
		
		
		/*
		 * Nach den Tests aufräumen
		 */
		try {
			Files.delete(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
