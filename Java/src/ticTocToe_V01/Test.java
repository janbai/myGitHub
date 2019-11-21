package ticTocToe_V01;

public class Test {

	private static int longestString2;



	public static void main(String[] args) {
	
		
		
		boxBorder(welcome,10,4);
	}
	
	
	
static public final String[] welcome	= {"Willkommen im", "Tec Tac Toe","für zwei Spieler", "Datum: 18.11.2019"};
	
static void boxBorder(String[] text, int alignment, int tab) 
{
	int longestString = 0;
	for (int i = 0; i < text.length-1; i++) 
	{
		longestString = (text[i].length()>text[i+1].length()) ? text[i].length() : text[i+1].length();// find the longest string in array
	}
	
	int linLen = longestString + alignment;
	String line = "+" + new String(new char[linLen]).replace("\0", "-") + "+";
	String tabNo=""	;
	
	if(tab>0) { for (int i = 0; i < tab; i++) {	tabNo +="\t";}} //tab Nr.
		
	System.out.print(tabNo);
	
	System.out.printf("%s%n", line); //--------------------------------------Rahmenlinie oben
	
	for (int i = 0; i < text.length; i++) {
		System.out.print(tabNo);
		int strLen = text[i].length();
		
		int alignment_left = (linLen - strLen)/2;
		int alignment_right = (linLen - strLen)/2 + (linLen +2 - strLen)%2;
		
		String l = new String(new char[alignment_left]);
		String r = new String(new char[alignment_right]);
		System.out.printf("%s%s%s%n","|", l +text[i] +r ,"|");
	}
	System.out.print(tabNo);

	System.out.printf("%s%n", line); //--------------------------------------Rahmenlinie unter
}
	
}
