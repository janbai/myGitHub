package Exceptions_72_73_81_93;

public class Q093 {

	public static void main(String[] args) {
		String names [] = {"Thomas", "Peter", "Joseph"};
		String pwd [] = new String [3];
		int idx = 0;
		try {
			for (String n: names) {
				pwd [idx] = n.substring (2, 6);
				idx++;
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getClass());
			System.err.println(e.getCause());
			System.err.println(e.getMessage());
					
			System.out.println("Invalid Name");
		}
		
		for (String p : pwd) {
		System.out.println(p);
		}

	}

}
