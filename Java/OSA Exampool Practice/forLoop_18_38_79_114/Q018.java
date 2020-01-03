package forLoop_18_38_79_114;



public class Q018 {

	public static void main(String[] args) {

		String shirts[][] = new String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		
		print_1(shirts);// medium:
		print_2(shirts);//small:
	
		//	print_3(shirts);//compiler failer for (String[] sizes : shirts)
		
		
		print_4(shirts);
		
		
	}

	static void print_1(String shirts[][]) {
		System.out.println("Option 1 -----------------");
		for (int index = 1; index < 2; index++) {
			for (int idx = 1; idx < 2; idx++) {
			System.out.print(shirts[index][idx] + ":");
			}
			}
		System.out.println();
	}
	
	static void print_2(String shirts[][]) {
		System.out.println("Option 2 -----------------");
		for (int index = 0; index < 2; index++) {
			for (int idx = 0; idx < index; idx++) {
			System.out.print(shirts[index][idx] + ":");
			}
			}
		System.out.println();
	}
	/*
	static void print_3(String shirts[][]) {
		System.out.println("Option 3 -----------------");
		for (String sizes : shirts) {
			for (String s : sizes) {
			System.out.print(s + ":");
			}
			}
		System.out.println();
	}
	*/
	
	static void print_4(String shirts[][]) {
		System.out.println("Option 4 -----------------");
		for (int index = 0; index < 2;) {
			for (int idx = 0; idx < 2;) {
			System.out.print(shirts[index][idx] + ":");
			idx++;
			}
			index++;
			}
		System.out.println();
	}
	
	
}
