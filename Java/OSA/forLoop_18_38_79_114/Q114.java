package forLoop_18_38_79_114;

public class Q114 {

	public static void main(String[] args) {


		int data [] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		
		for (int e: data) {
		if (e != key) {
			count++; 	// 3 Found
		continue;
		//  count++;  	//Compilation fails. Unreachable code at line (count++;)
		
		}
		}
		System.out.print (count + " Found");

	}

}
