package calculator;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

public class Calculator_main_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Welcome to Java Calculator v0.1 \n");
        Scanner Scan = new Scanner(System.in);


        System.out.println("\n Please enter two numbers");
        int xe;
        int xo;
        System.out.print("\n First number: ");
        xe = Scan.nextInt();
        System.out.print("\n Second number: ");
        xo = Scan.nextInt();

        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        String Operation = Scan.next();
        String EO = "You have selected ";

        
        
        if (Pattern.compile("[a-z]").matcher(inputExpression).find()) {
            return ErrorType.ALPHABETIC_SYMBOL;
        } else if (!inputExpression.matches("[-+*/()]") || !inputExpression.matches("[0-9]")) {
            return ErrorType.UNKNOWN_SYMBOL;
        }
                switch (Operation) {

        case "*": System.out.println(EO + "* \n Your Result: "+( xe * xo )); break;
        case "/": System.out.println(EO + "/ \n Your Result: "+ ( xe / xo )); break;
        case "+": System.out.println(EO + "+ \n Your Result: "+ ( xe + xo ));break;
        case "-": System.out.println(EO + "- \n Your Result: "+( xe - xo )); break;
        default: System.out.println("\n Please select a valid character"); }

        //Close
        Scan.close();
        System.out.println(" Closing Application ");
	}

}
