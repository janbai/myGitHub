package eBookExample;
public class Test_01{
	


public static void main(String args[]) {
	MyOuter.MyInner inner = new MyOuter().new MyInner();
	inner.seeOuter();
	
	//MyOuter2 mo2 = new MyOuter2();
//	mo2.doStuff();
	
	
}
}