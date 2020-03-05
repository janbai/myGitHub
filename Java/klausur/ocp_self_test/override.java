package ocp_self_test;

interface i1 {
void doStuff(int x);
}
class Patton {
void stuff(String s) {
System.out.println("stuff ");
}
}
public class override extends Patton implements i1 {
public static void main(String[] args) {
new override().doStuff(1);
new override().stuff("x");
}
	@Override
	void doStuff(int x) {
	
		System.out.print("doStuff ");
	}
@Override
void stuff(String s) {
System.out.println("my stuff ");
}
}