package selftest_10;



	
		public class MyThread extends Thread {
			 public static void main(String [] args) {
			
				 MyThread1 t = new MyThread1();
			 Thread x = new Thread(t);
			 x.start();
			 }
			 public void run() {
			 for(int i=0;i<3;++i) {
			 System.out.print(i + "..");
			 }
			

	}

}
