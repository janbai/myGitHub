package ocp_self_test;

public class Clumsy {
 public static void main(String[] args) {
 int j = 7;
 assert(++j > 7);
 assert(++j > 8): "hi";
 assert(j > 10): j=12;
 assert(j==12): doStuff();
 assert(j==12): new Clumsy();
 }
 static int doStuff() {
	return 0; 
	
 }
 }