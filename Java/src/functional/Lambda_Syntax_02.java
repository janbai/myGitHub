package functional;

public class Lambda_Syntax_02 {

	interface Combiner {
		int combine(int a, int b);
	}
	
	static class Adder implements Combiner{

		@Override
		public int combine(int a, int b) {
			return a + b;
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Combiner c1 = new Adder();
		System.out.println(c1.combine(2, 3));
		 
		
		Combiner c2=(int a, int b)-> {
			return a + b;
		};
		
		System.out.println(c2.combine(2, 3));
	
		Combiner c3 = (a,b) ->{return a+b ;};
		
		Combiner c4 = (a,b) -> a+b;
		
		System.out.println(c3.combine(2, 3));
	
}
	
	
	
	
}
