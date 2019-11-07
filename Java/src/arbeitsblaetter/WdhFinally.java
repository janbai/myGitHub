package arbeitsblaetter;

public class WdhFinally {

static void m1() {
	System.out.print("a ");
	
	try {
		try {
			System.out.print(5/0);
		} catch (Error e) {
			System.out.print("e2 ");
		}finally {
			System.out.print("f2 ");
		}
		System.exit(0);
		
	} catch (Throwable e) {
		System.out.print("e1 ");
	}finally {
		System.out.print("f1 ");
	}
	System.out.print("b ");
}


static int m2() {
	try {
		return 5/0;
	} finally  {
//	return -1;
	}
}
	
public static void main(String[] args) {


	//	m1();
		System.out.println(m2());
		
		
		
	}//end of main

}
