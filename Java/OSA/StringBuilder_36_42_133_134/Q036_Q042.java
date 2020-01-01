package StringBuilder_36_42_133_134;


public class Q036_Q042 {
	
	public static void main(String[] args) {


		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
	// insert code here
	//  String str2 = str1;  			  	System.out.print(str1 == str2); // true
	//String str2 = new String(str1); 	System.out.print(str1 == str2); // false
	//String str2 = sb1.toString();		System.out.print(str1 == str2); // false
	//String str2 = "Duke";				System.out.print(str1 == str2); // false
		
	  System.out.println("1. " + maskCC_1("1234-5678-9101-1121"));
	  System.out.println("2. " + maskCC_2("1234-5678-9101-1121"));
	  System.out.println("3. " + maskCC_3("1234-5678-9101-1121"));
	  System.out.println("4. " + maskCC_4("1234-5678-9101-1121"));
	  System.out.println("5. " + maskCC_5("1234-5678-9101-1121"));
	  System.out.println("6. " + maskCC_6("1234-5678-9101-1121"));
	  System.out.println("7. " + maskCC_7("1234-5678-9101-1121"));
	}

	public static String maskCC_1(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
		sb.substring(15, 19); // return String
		return x + sb;
	}

	public static String maskCC_2(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		return x + creditCard.substring(15, 19);
	}
	
	public static String maskCC_3(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19); // return  StringBuilder
		return sb.toString();
	}
	
	public static String maskCC_4(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
		StringBuilder s = sb.insert(0, x); // return StringBuilder
		return s.toString();
	}
	public static String maskCC_5(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
		sb.replace(0, 15, x); // return StringBuilder
		return sb.toString();
	}
	
	public static StringBuilder maskCC_6(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
		sb.replace(0, 15, x); //return StringBuilder
		return sb;
	}
	public static String maskCC_7(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		StringBuilder sb = new StringBuilder(creditCard);
		StringBuilder sb2 = new StringBuilder(sb.substring(15, 19));
		StringBuilder s = sb2.insert(0, x); // return StringBuilder
		return s.toString();
	}
}
