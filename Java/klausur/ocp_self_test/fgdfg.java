package ocp_self_test;
public class fgdfg {
static class PowerOutage extends Exception {}
static class Thunderstorm extends Exception {}
public static void main(String[] args) {
try {
new fgdfg().listen();
System.out.print("a");
} catch(PowerOutage | Thunderstorm e) {
e = new PowerOutage();
System.out.print("b");
} finally { System.out.print("c"); }
}
public void listen() throws PowerOutage, Thunderstorm{ }
}