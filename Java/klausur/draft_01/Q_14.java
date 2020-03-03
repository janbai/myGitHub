package draft_01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface DozentDAO {
	void setAlter(int alter);
	Dozent findById(int  id);
	void create(Dozent d);
	void create(Connection c, Dozent d); 

}

class Dozent{}
public class Q_14 {
	static void method() throws InterruptedException {
				Thread t = new Thread();
				t.start();
				t.sleep(2000);
				t.join();
				System.out.println("hallo");
			}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		new Thread(  () -> {System.out.println("sssss");}  ).start();
		new Thread(  () -> {System.out.println("sssss");}  ).run();
		
		new Thread() { 
			public void run() {
				System.out.println("sssss");
			}
		 }.start();
		
		

		
	}

}
