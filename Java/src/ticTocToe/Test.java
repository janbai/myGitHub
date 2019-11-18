package ticTocToe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//boxBorder(congratulation);
		String[] headerText = {"wellcome","im","Tec Tac Toe","für Einen Spieler"};
		boxBorder(headerText,1);
	}
	static private final String  congratulation 	= "Herzliche Glückwünsche ! Du bist ein Gewinner";
	
	
	
	static void boxBorder1(String text) 
	{ 
		String str1 = "+";
		String str2 = "-";
		String left  = "**********|   ";
		String right = "   |";
		
		int a = -str1.length() + text.length() + left.length() + right.length() - str2.length();
		String line = "+" + new String(new char[a]).replace("\0", "-") + "+";
		System.out.printf("%s%n%s%s%s%n%s%n", line, left, congratulation, right, line); 
		
		
		}
	static private final String[] wellcome	= {"Willkommen im", "Tec Tac Toe","für zwei Spieler"};
	
	static void boxBorder(String[] text, int alignment) 
	{ 
		
			
			String str1 = "+";
			String str2 = "-";
			String left  = "|   ";
			String right = "   |";
			int longestString = 0;
			for (int i = 0; i < text.length-1; i++) 
			{
				longestString = (text[i].length()>text[i+1].length()) ? text[i].length() : text[i+1].length();
			}
			int a = -2 * str1.length() + longestString + left.length() + right.length();
			String line = "+" + new String(new char[a]).replace("\0", str2) + "+";
			String frmt1 = "%" + alignment + "s%n";
			System.out.printf(frmt1, line); 
			
			for (int i = 0; i < text.length; i++) {
			
				String sp = ((text[i].length())%2 == 0)? " " : "" ;
				
				int spaceNo = (longestString - text[i].length())/2 ;
				String space = (spaceNo>0) ? new String(new char[spaceNo])  : "";
				String frmt2 = "%" + alignment + "s%s%s%n";
				System.out.printf(frmt2, left, space + text[i] + space + sp , right); 
			}
			
			System.out.printf(frmt1, line); 
		
		
		
	}
	
	
	
	
	
}
