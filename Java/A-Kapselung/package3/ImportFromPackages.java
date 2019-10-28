package package3;

import package1.Class1;
import package2.Class2;

import static package1.Class1.P1;
import static package2.Class2.getMaxValue;


class Auto{
	static void print(){
		System.out.println("Auto1 läuft..............");
	}
}


public class ImportFromPackages {
	static void print(){
		System.out.println("Auto2 läuft.............."); // 1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(); 		//Auto2 läuft..............
		Auto.print();	//Auto1 läuft..............
	
		System.out.println( "end of main of: " + ImportFromPackages.class.getName() );
		
		System.out.println(getMaxValue());
		System.out.println(P1);
		Class1.print1();
		Class2.print2();
	

	}

}
