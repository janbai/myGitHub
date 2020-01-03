package Casting_4_27_44_51_55_66_96_107_142;
class AA {
	public AA() {
	System.out.print("A ");
	}
	}

	class BB extends AA {
	public BB() { // Line n1
	System.out.print("B ");
	}
	}

	class CC extends BB {
	public CC() { // Line n2
	System.out.print("C ");
	}
	}

public class Q027{
	
	

public static void main(String[] args) {

	CC c = new CC(); 			// A B C
	System.out.println();	
	AA b = new BB();			// A B 
	System.out.println();
	 AA a = new AA();  		// A
	 System.out.println();
	// c = (CC) a; 			// ClassCastException
	 System.out.println();
	 b = (BB) c;
	BB b1 =   new CC();	// A B C 
	System.out.println();
	System.out.println();
	//CC c1 = (CC) new AA(); 	// A ClassCastException
	System.out.println();
//	BB c2 = (CC) new BB(); 	// A B ClassCastException
	
//	System.out.println(args[0]); // ArrayIndexOutOfBoundsException
}
}