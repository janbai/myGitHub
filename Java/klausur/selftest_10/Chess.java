package selftest_10;

public class Chess implements Runnable {
 public void run() {
 move(Thread.currentThread().getId());
 }
 // insert code here
  void move(long id) {
 System.out.print(id + " ");
 System.out.print(id + " ");
}
public static void main(String[] args) {
 Chess ch = new Chess();
 new Thread(ch).start();
 new Thread(new Chess()).start();
 }
 }