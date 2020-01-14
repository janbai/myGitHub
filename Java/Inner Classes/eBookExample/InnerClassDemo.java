package eBookExample;

public class InnerClassDemo {

	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		System.out.println(outer.str);
		MyOuter.MyInner inner = outer.new MyInner();
		inner.showInner();
		outer.doStuff();
		
	}

}
