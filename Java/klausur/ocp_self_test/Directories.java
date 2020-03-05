package ocp_self_test;



import java.io.*;
public class Directories {
static String [] dirs = {"dir1", "dir2"};


	public static void main(String[] args) {
		
		
		
		for (String d : dirs) {
			String path = File.separator + d;
		
		
			File file = new File(path, args[0]);
			System.out.print(file.exists() + " ");

	}
	}
}
