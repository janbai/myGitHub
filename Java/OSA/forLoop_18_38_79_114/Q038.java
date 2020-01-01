package forLoop_18_38_79_114;

public class Q038 {

	public static void main(String[] args) {
		
		//discount_1(); // <=80 : 0, (81 - 89) :0.2, >=90 : 0.5
		//discount_2(); // <=80 : 0  >80 : 0.2
		//discount_3(); // <=80 : 0 (81 - 89) :0.2, >=90 : 0.5
		//discount_4(); // <90: 0,  >=90 : 0.5
		//discount_5(); 	// <=80 : 0,  >80 : 0.2
		
	}

	static void discount_1() {
		double discount = 0;
		for (int qty = 78; qty < 92; qty++) {
			if (qty >= 90) { discount = 0.5; }
			if (qty > 80 && qty < 90) {discount = 0.2; }
			System.out.println(qty + " : " + discount);
		}
		
	}
	
	static void discount_2() {
		double discount = 0;
		for (int qty = 78; qty < 92; qty++) {
			discount = (qty >= 90) ? 0.5 : 0;
			discount = (qty > 80) ? 0.2 : 0;
			System.out.println(qty + " : " + discount);
		}
	}
	
	static void discount_3() {
		double discount = 0;
		for (int qty = 78; qty < 92; qty++) {
			discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
			System.out.println(qty + " : " + discount);
		}
	}
	
	static void discount_4() {
		double discount = 0;
		for (int qty = 78; qty < 92; qty++) {
			if (qty > 80 && qty < 90) {discount = 0.2;}
			else {discount = 0;}
				
			if (qty >= 90) {discount = 0.5;}
			else {discount = 0;}
			
			System.out.println(qty + " : " + discount);
		}
	}
	
	static void discount_5() {
		double discount = 0;
		for (int qty = 78; qty < 92; qty++) {
			discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;
			System.out.println(qty + " : " + discount);
		}
	}
	
	
}
