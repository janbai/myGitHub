package draft_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Map;


public class Q_13 {

	public static void main(String[] args)   {

		try {
			File file = new File("autos.txt");
					FileWriter fw100 = new FileWriter(file);
					BufferedWriter out = new BufferedWriter( fw100 );
					
					out.write("VW Golf");

					out.close();

			} catch(IOException e) {
				System.out.println("IOE abgefangen"); 
			}catch(RuntimeException e) {
				
			}

		
	Integer a = 1;
	a++;
	System.out.println("a: " +a);
		
				
			}


}
