
public class KleineAufgabe_Exceptions {
static String formatName(String name) {
	
	if (name.length() < 3 ) {
		
	throw new IllegalArgumentException(" der Name muss mindestens 3 Zeichen haben");
	}
		return name.toUpperCase();
}
	
	
	public static void main(String[] args) {
		
	String name = "Jerry";
	name = formatName(name);
	System.out.println("Name:" + name);
	
		name = null;
		try {
				name = formatName(name);
			}catch (Exception e) {
				System.out.println(e + " (name= Null)");
		}
		
		name="AB";
		try {
			name = formatName(name);
		}catch (Exception e) {
			System.out.println(e );
	}
		
		
		
		System.out.println("end of main");
		
	}

}
