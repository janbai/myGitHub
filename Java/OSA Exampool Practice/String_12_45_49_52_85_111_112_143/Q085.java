package String_12_45_49_52_85_111_112_143;

public class Q085 {

	public static void main(String[] args) {


		String s = " Java Duke ";
		int len = s.trim().length();
		System.out.println(len);
		
		s.charAt(1);
		System.out.println(s.charAt(1));// second letter
		s.concat("now");
		System.out.println(s);
		System.out.println(s.concat("now")); // add now in the end
		
		s= null;
		s.concat("something"); // null.concat(String) => NullPointerException
	}

}
