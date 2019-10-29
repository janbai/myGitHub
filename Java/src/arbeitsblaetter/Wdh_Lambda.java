package arbeitsblaetter;

public class Wdh_Lambda {

	interface GetString {
		String get();
		
	}
	
	
	interface UseString{
		void use(String s) ;
		
	}
	
	class UseStringImpl  implements UseString{
		public void use(String s) {
			new String("hallo");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetString g1 = () -> {return new String ("hello");};
		GetString g2 = () -> new String ("hello");
		GetString g3 = () -> {return ("hello");};
		GetString g4 = () -> "hello";
		
		UseString u1 = (String s) -> { new String ("Hallo");};
		UseString u2 = s -> { new String ("Hallo");};
		UseString u3 = s ->  new String ("Hallo");
	//	UseString u4 = s ->  "Hallo";
		
		class PrintTwice implements UseString {
			public void use (String s) {
				System.out.print(s + s);
			}
			
		}
		
		UseString u5 =new PrintTwice ();
		u5.use("di");
		
		UseString u6 = s ->  System.out.print(s);
		
		
	}

}
