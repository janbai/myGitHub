package pkg1_Encapsulation;
public class B01_Encapsulation {}

/*
 * Encapsulation:
 -  able to update a newer version of the class without changing any of their own code
 - flexibility and maintainability 
 - hide implementation details behind a public programming interface ( set an accessible methods for the code)
 
 Desgin Encapsulation:
 1-Keep instance variables hidden (private)
 2- Make public accessor methods (getter and getter)
 */

 class Box {   
	 // hide the instance variable; only an instance of Box can access it
	 private int size;   
	 
	 // Provide public getters and setters   
	
	 public int getSize() {
		 return size;
	 } 
	 
	 public void setSize(int newSize) {
		 size = newSize;   
	 } 
	 
 }
	 
