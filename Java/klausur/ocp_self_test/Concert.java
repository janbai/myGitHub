package ocp_self_test;
public class Concert {
static class PowerOutage extends Exception {}
static class Thunderstorm extends Exception {}
public static void main(String[] args) {
try {
new Concert().listen();
System.out.print("a");

} catch(PowerOutage | Thunderstorm e) {
//e = new PowerOutage();
	System.out.println(e.toString());
System.out.print("b");
} finally { System.out.print("c"); }
}
public void listen() throws PowerOutage, Thunderstorm{ }
}