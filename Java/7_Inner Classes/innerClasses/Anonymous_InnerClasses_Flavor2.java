package innerClasses;

class MyWonderfullClass{
	void go() {
		Bar b = new Bar();
		
	    b.doStuff(	
	    		new Foo(){
	    			public void foof() { 
	    				System.out.println("foofy");
	    				}
	    			}
	    		); 
	  }
}

interface Foo {
	void foof();
}

class Bar{
	void doStuff(Foo f) {
		f.foof();
	}
}


public class Anonymous_InnerClasses_Flavor2 {

	public static void main(String[] args) {
		
		
		MyWonderfullClass wf = new MyWonderfullClass();
		wf.go();
		
		

	}

}
