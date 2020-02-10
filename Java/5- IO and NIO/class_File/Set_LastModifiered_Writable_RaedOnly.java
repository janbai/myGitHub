package class_File;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Set_LastModifiered_Writable_RaedOnly {
	static final String fmt = "%-70s%s%n";
	static final String pathName = "C:\\Users\\CC-Student\\OneDrive\\myFiles";
	static final String fileName = "test.txt";
	public static void main(String[] args) {
		test_setLastModified();
		test_setReadOnly();
		test_setWritable();
		test_setReadable();
		test_setExecutable();
	}
	private static void test_setExecutable() {
		// TODO Auto-generated method stub
		
	}
	private static void test_setReadable() {
		// TODO Auto-generated method stub
		
	}
	private static void test_setWritable() {
		// TODO Auto-generated method stub
		
	}
	private static void test_setReadOnly() {
		System.out.println("********** Set read only:");
		File file =  new File(pathName , fileName );
		
		try 
		{
			System.out.printf(fmt ,"Set read only: " , file.setReadOnly()); 
		 } 
		catch (SecurityException e) { System.err.println(e.toString());}
		
		
	}
	private static void test_setLastModified()  {
		System.out.println();
		System.out.println("********** Set Last Modified:");
		File file =  new File(pathName , fileName );
		long currentDateTime = System.currentTimeMillis();
		 Date currentDate = new Date(currentDateTime);
	         
	    DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");    
		try 
		{
			
			file.createNewFile();
			System.out.printf(fmt ,"Set the last mofified: " + currentDate + " Milliseconds" , df.format(currentDate)); 
		       
			System.out.printf(fmt ,"Set the last mofified: " , file.setLastModified(currentDateTime)== true ? " succeeded" : " not succeeded" ); 
	    } 
		
		catch (IOException e) 		{ System.err.println(e.toString());} 
		catch (SecurityException e) { System.err.println(e.toString());}
		}
}
