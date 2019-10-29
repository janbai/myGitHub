package arbeitsblaetter;

public class Lambda_Syntax {

	interface FormatInt {
		String format (int x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class LocalFormat implements FormatInt {
			public String format (int x) {
				return "<" + x + ">";
			}
		}
		
		FormatInt f1 = new LocalFormat();
		System.out.println("mit f1: " + f1.format(22));
		
		FormatInt f2 = (int x) -> {return "<" + x + ">";};
		System.out.println("mit f2: " + f2.format(22));
		
		FormatInt f3 = (x) -> {
			return "<" + x + ">";
			};
		
			System.out.println("mit f3: " + f3.format(22));
		
		
			FormatInt f4 = x -> {
				return "<" + x + ">";
				};
			
				System.out.println("mit f4: " + f4.format(22));
				
				
				FormatInt f5 = x ->  "<" + x + ">";
					
				
					System.out.println("mit f5: " + f5.format(22));
					
					useFormatter(f5);
					useFormatter(x ->  "<" + x + ">");
			
	}//end of main
	static void useFormatter(FormatInt fmt) {
		System.out.println(fmt.format(22));
	}
	
	
	
}