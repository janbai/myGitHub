package calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner Scan = new Scanner(System.in);


        System.out.println("\n Please enter two numbers");
      
       
        
		String strArray = Arrays.toString(args);
        strArray = strArray.replace("[", "").replace("]", "").replaceAll("[, ]", "");
        String[] splits = strArray.split("");

        int operand1 = Integer.parseInt(splits[1]);
        int operand2 = Integer.parseInt(splits[2]);
        char theOperator = splits[3].charAt(0);
        operand1= Scan.nextInt();
        operand2= Scan.nextInt();
        System.out.print(splits[1] + " " + splits[3] + " " + splits[2] + " = ");

        switch(theOperator) {
            case ('+'):
                System.out.println(operand1 + operand2); break;
            case ('-'):
                System.out.println(operand1 - operand2); break;
            case ('*'):
                System.out.println(operand1 * operand2); break;
            case ('/'):
                System.out.println(operand1 / operand2); break;
            default:
                System.out.println("Invalid Operator selected");
        }
	
	
	}

}
