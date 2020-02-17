package examples;

import java.util.function.UnaryOperator;

public class Method_Referance_Typ3 {

	public static void main(String[] args) {

		String var = "Java";

		UnaryOperator<String> op = new UnaryOperator<String>() {
			public String apply(String s) {
				return var.concat(s);
			}
		};

		UnaryOperator<String> op1 = s -> var.concat(s);
		UnaryOperator<String> op2 = var :: concat;
		
		
		String result = op2.apply("!");
		System.out.println(result);
		
		
	}

}
