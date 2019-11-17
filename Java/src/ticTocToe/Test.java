package ticTocToe;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boxBorder(congratulation);
		
		boxBorder(wellcome);
	}
	static private final String  congratulation 	= "Herzliche Glückwünsche ! Du bist ein Gewinner";
	
	
	
	static void boxBorder(String text) 
	{ 
		String str1 = "+";
		String str2 = "-";
		String left  = "|   ";
		String right = "   |";
		
		int a = -str1.length() + text.length() + left.length() + right.length() - str2.length();
		String line = "+" + new String(new char[a]).replace("\0", "-") + "+";
		System.out.printf("%s%n%s%s%s%n%s%n", line, left, congratulation, right, line); 
		
		
		}
	static private final String[] wellcome	= {"Willkommen im", "Tec Tac Toe","für zwei Spieler"};
	
	static void boxBorder(String[] arrayText) 
	{ 
		int	longestString = 0;
		String str1 = "+";
		String str2 = "-";
		String lef  = "|   ";
		String rig = "   |";
		
		for (int i = 0; i < arrayText.length-1; i++) 
		{
			longestString = (arrayText[i].length() > arrayText[i + 1].length()) ? arrayText[i].length(): arrayText[i + 1].length();
          System.out.println(longestString);
		}
		 System.out.println("longestString " + longestString);
		int a = -str1.length() + longestString + lef.length() + rig.length() - str2.length();
		
		System.out.println("a: " + a + "L " + lef.length() + "R " + rig.length());
		String line = "+" + new String(new char[a]).replace("\0", "-") + "+";
		System.out.printf("%s%n",line);
		
		for (int i = 0; i < arrayText.length; i++) {
			
			String sp = ((arrayText[i].length())%2 == 0)? " " : "" ;
			
			int spaceNo = (a - arrayText[i].length() - rig.length()-lef.length())/2 ;
			
			System.out.println("b :" + spaceNo);
			String space = (spaceNo>0) ? new String(new char[spaceNo])  : "";
			
			
			System.out.printf("%s%s%s%s%s%n",lef, space, arrayText[i] , space + sp , rig);
			
		}
		
		System.out.printf("%s%n",line);
		
		}
}
