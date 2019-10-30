package functional;
import java.util.function.Function;
import java.util.function.Supplier;
public class Funktion_Aufgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Function <Integer,Integer>	f1 = x->2*x;
	
	Integer result1 = f1.apply(12);
	System.out.println(result1);
	
	Function<Integer, String> f2 = x -> "<" + x + ">";
	
	String result2 = f2.apply(123);
	System.out.println(result2);

	}

}
