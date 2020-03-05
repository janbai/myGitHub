package ocp_self_test;
interface I1 {
default int doStuff() { return 1; }}

interface I2 {default int doStuff() { return 2; }}

public class MultiInt implements I1, I2 {
	
public static void main(String[] args) {
new MultiInt().go();
}

void go() {
System.out.println(doStuff());
}

int doStuff() {
return 3;
}

}