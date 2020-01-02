package Q080;

class Caller {
//private void init() 	// Compilation fails (private modifier)
 void init()			// Initialized : Started : Initialized : 
{ 
System.out.print("Initialized : ");
}
public void start() {
init();
System.out.print("Started : ");
}
}
public class TestCall {
public static void main(String[] args) {
Caller c = new Caller();
c.start();
c.init();
}
}