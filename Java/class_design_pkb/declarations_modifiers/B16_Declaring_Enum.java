package declarations_modifiers;



enum CoffeeSize { BIG, HUGE, OVERWHELMING } // this cannot be
//private or protected
class Coffee {
CoffeeSize size;
}

class Coffee2 {
enum CoffeeSize {BIG, HUGE, OVERWHELMING }; // <--semicolon is optional here
CoffeeSize size;
}
public class B16_Declaring_Enum {

	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG; // enum outside class
		
		Coffee2 drink2 = new Coffee2();
		drink2.size = Coffee2.CoffeeSize.BIG; // enclosing class name required
		
	//	enum CoffeeSize { BIG, HUGE, OVERWHELMING } // WRONG! Cannot declare enums in methods
	}
}
//conceptual example of how you can think about enums
class CoffeeSize1 {
public static final CoffeeSize1 BIG =
new CoffeeSize1("BIG", 0);
public static final CoffeeSize1 HUGE =
new CoffeeSize1("HUGE", 1);
public static final CoffeeSize1 OVERWHELMING =
new CoffeeSize1("OVERWHELMING", 2);
CoffeeSize1(String enumName, int index) {
//stuff here
}
}
