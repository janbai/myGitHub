package Exceptions_8_45_72_73_81_93;

import java.io.IOException;

class X {
 public void printFileContent() throws IOException {
 /* code goes here */
 throw new IOException();
 }
 }

public class Q008 {

	public static void main(String[] args) throws IOException {
		X xobj = new X();
		xobj.printFileContent();

	}

}
