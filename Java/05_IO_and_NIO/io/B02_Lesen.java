package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class B02_Lesen {

	public static void main(String[] args) {

		try (Reader in = new FileReader("def.txt")) {
			
			char ch;
			
			ch = (char)in.read(); // <- bitte in der Praxis nicht so lesen (ein char pro read-Aufruf)
			System.out.println(ch);
			
			System.out.println(in.read());
			System.out.println(in.read());
			
			System.out.println(in.read()); // -1
			
		} catch (FileNotFoundException e) {
			System.out.println("Fehler beim Öffnen");
			
		} catch (IOException e) {
			System.out.println("Fehler beim Lesen oder Schliessen");
		}

	}

}
