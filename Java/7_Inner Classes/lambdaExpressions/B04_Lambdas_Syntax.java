package lambdaExpressions;


interface IA {void m();}
interface IB {void m(int x);}
interface IC {int m();}


public class B04_Lambdas_Syntax {

	public static void main(String[] args) {
		IA x1 = ()-> {};
		IA x2 = ()-> {System.out.println("a");System.out.println("b");};
		x2.m();
		
		IA x3 = ()->
			System.out.println("c");// <- hier ist die Lambda zu Ende
			System.out.println("d");
		x3.m();
		
		IB x4 = (int i)->{
			System.out.print(i + " + 3 = " );
			System.out.println(i + 3);
		};
		x4.m(2);
		
		x4 = i-> System.out.println(i + " + 3 = " + (i + 3));
		x4.m(2);
		
		// IB x5 = int y -> {  }; // Compilerfehler: 'int' muss auch weg
				IB x5 = y -> {};
				IB x6 = (y) -> {};
				IB x7 = (int y) -> {};
				
				/*
				 * Wenn es nur eine Anweisung in dem Methodenrumpf gibt, kann man die geschweiften Klammer weg lassen.
				 */
				IB x8 = y -> System.out.println(y); 
				x8.m(10);
				IC x9 = () -> { return 12; };
				System.out.println(x9.m());
				// IC x10 = () -> return 12; // Compilerfehler: return muss auch weg
				IC x10 = () -> 12;
				
				
	}// end of main

}
