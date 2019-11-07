package arbeitsblaetter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterUndFinally {

	public static void main(String[] args) {


		String newfile ="C:\\Users\\HJAN181\\Desktop\\Auto.txt";
		
		PrintWriter out1 = null;
		try {
			out1 = new PrintWriter(newfile);
			out1.println("VW");
			out1.println("VW");
			out1.println("VW");
			out1.println("VW");
		} catch (IOException e) {
			System.out.println("Fehler beim Erzeugen der Datei!");
			e.printStackTrace();
		}finally {
			
		}

	}

}
