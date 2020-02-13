package thread.anfang;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Printer extends Thread{
	static Object monitor = new Object();	
	private char ch;
	private int row, column;
	public Printer(char ch, int row, int column) {
		this.ch = ch;
		this.row = row;
		this.column = column;
	}
	
	@Override
	public void run() {
		for ( int i = 0; i < column; i++) {
			synchronized (monitor) {
					
			for (int j = 0; j < row; j++) {
				System.out.print(ch);;
			}
			
			System.out.println();	
			}
		}	

	}
}
public class KleineAufgabe_02 {

	public static void main(String[] args) {
		
		Printer p1 = new Printer('a', 10, 20);
		
		Printer p2 = new Printer('*', 17, 30);
		
		p1.start();
		p2.start();
		
		try {
			p1.join();
			p2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
			}//end of main
		
		

	

}
