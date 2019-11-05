package arbeitsblaetter;

import java.util.Arrays;

enum Element {
	WASSER(),
	FEUER(12),
	LUFT (77){
		@Override
		public String toString() {
			return "Luft ist luftig ";
		}
	},
	ERDE(16);
	
public static Element [] valuesAbsteigend() {
	Element [] vals = values();
	Arrays.sort(vals, (e1,e2) -> e2.ordinal()-e1.ordinal());
	return vals;
	
}
	private int x;
	Element () {}
	private Element (int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	@Override
	public String toString() {
		return name().toLowerCase() + ". x= " + x;
	}
	
}
class MyValue {
static final MyValue VI = new MyValue() {
	@Override
	public String toString() {
		return "v1 ";
	}
	
};

	@Override
	public String toString() {
		return "MyValue ";
	}
	
	
	
}
public class Enum {

	public static void main(String[] args) {


		for (Element e : Element.values()) {
			System.out.println(e.ordinal() +". " +  e);
		}
		
		System.out.println(new MyValue());
		System.out.println(MyValue.VI);

		
		
		
	}

}
