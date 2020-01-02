package doWhile_20_21_110_132_140;

public class Q110 {

	public static void main(String[] args) {
		int [] stack = {10,20,30};
		int size = 3;
		int idx = 0;
		findTopElement_1(stack,size,idx);	// 20
	//	findTopElement_2(stack,size,idx);	//ArrayIndexOutOfBoundsException index 3
		findTopElement_3(stack,size,idx);	// 30
	//	findTopElement_4(stack,size,idx);	//ArrayIndexOutOfBoundsException Index 4
	//	findTopElement_5(stack,size,idx);	//ArrayIndexOutOfBoundsException Index 3

	}
	static void findTopElement_1(int[] stack, int size, int idx){
		do {
			idx++;
			} while (idx >= size);
		
		System.out.println ("The Top element: " + stack[idx] );
}
	static void findTopElement_2(int[] stack, int size, int idx){
		while (idx < size) {
			idx++;
			}
		
		System.out.println ("The Top element: " + stack[idx] );
}
	static void findTopElement_3(int[] stack, int size, int idx){
		do {
			idx++;
			} while (idx < size - 1);
		
		System.out.println ("The Top element: " + stack[idx] );
}
	
	static void findTopElement_4(int[] stack, int size, int idx){
		do {
			idx++;
			} while (idx <= size);
		
		System.out.println ("The Top element: " + stack[idx] );
}
	
	static void findTopElement_5(int[] stack, int size, int idx){
		while (idx <= size - 1) {
			idx++;
			}
		
		System.out.println ("The Top element: " + stack[idx] );
}
}
