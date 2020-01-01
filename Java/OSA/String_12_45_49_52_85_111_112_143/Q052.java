package String_12_45_49_52_85_111_112_143;

public class Q052 {

	public static void main(String[] args) {


		String[] strs = new String[2];
		strs[0] = "";
		strs[1] = "";
		int idx = 0;
		
		for (String s : strs) {
		strs[idx] = strs[idx].concat(" element " + idx); 
		idx++;
		}
		
		for (idx = 0; idx < strs.length; idx++) {
		System.out.print(strs[idx] + ":"); // element 0: element 1
		}

		
		strs= null;
		for (String s : strs) {
			strs[idx].concat(" element " + idx); //NullPointerException
			idx++;
			}
			
			for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
			}
		
	}

}
