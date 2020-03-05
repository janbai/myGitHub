package ocp_self_test;

class Mammal {
 String name = "furry ";
 String makeNoise() { 
	 return "generic noise"; 
	 }
 }
 class Zebra extends Mammal {
 String name = "stripes ";
 

String makeNoise() { 
	 return "bray"; 
	 }
 }
 
 public class ZooKeeper {
	 void go() {
		 Mammal m = new Zebra();
		 System.out.println(m.name + m.makeNoise());
		 }
	 
	 public static void main(String[] args) { 
	 new ZooKeeper().go(); 
	 }
 
 
 
 }