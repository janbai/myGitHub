package class_Files;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Files_copy_move {

	public static void main(String[] args) throws IOException {


		CopyOption options = StandardCopyOption.REPLACE_EXISTING;
		Path target = Paths.get("myFiles4");
		Path source = Paths.get("myFiles4");
		
		try {
			Files.createDirectory(target);
			Files.copy(source, target, options);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
