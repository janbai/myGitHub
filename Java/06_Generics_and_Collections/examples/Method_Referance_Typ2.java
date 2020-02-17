package examples;

import java.util.function.Function;
import java.util.function.Supplier;

class MyNumber{
	int value;

	public MyNumber(int value) {
	
		this.value = value;
	}

	public MyNumber() {
		
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}

public class Method_Referance_Typ2 {

	public static void main(String[] args) {
		

		Supplier<MyNumber> s1 = () -> new MyNumber();
		Supplier<MyNumber> s2 = MyNumber::new;
		
		 
	}
static void kleineAufgabe() {
	Function<Integer, MyNumber> var1= MyNumber :: new;
	Function<Integer, MyNumber> var2= MyNumber :: new;
}
}
