package innerClasses;
class MyOuter{
	
	public void makeInner() {
		MyInner inner = new MyInner();
		inner.seeMyOuter();
	}
	
	private int x = 7;
	class MyInner{
		
		public void seeMyOuter() {
			System.out.println("Outer x is : " + x );
			System.out.println("Inner Class Ref is: " + this);
			System.out.println("Outer Class Ref is: " + MyOuter.this);
			//System.out.println("Outer Class Ref is: " + super());
		}
	}
	
	
	class MyInner_1 extends MyInner{
		public void seeMyInner() {
			
			System.out.println("Inner_1 this: " + this);
			System.out.println("Inner_1 super: "+ super.getClass());
			
		}

		
	}
}
public class Regular_Inner_Classes {

	public static void main(String[] args) {
		
		MyOuter outer = new MyOuter();
		outer.makeInner();
		
		MyOuter.MyInner inner =new MyOuter().new MyInner();
		inner.seeMyOuter();
		
		MyOuter.MyInner_1 inner1 =new MyOuter().new MyInner_1();
		
		inner1.seeMyInner();
	}

}
