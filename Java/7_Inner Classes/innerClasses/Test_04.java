package innerClasses;

public class Test_04 {
static int nummer = 1;
	public static void main(String[] args) {


		b1();
		b2();
		b3();
		

	}

	private static void b3() {
		int nummer = 3;
		System.out.println(new Object() {
			@Override
			public String toString() {
				return "Object " + nummer;
			}
		});
		
	//	nummer = 4;
		
	}

	private static void b2() {
		class Tier{
			int nummer = 2;
		}
		
		class Hund extends Tier{
			@Override
			public String toString() {
				return "Hund " + nummer;
				
			}
			
		}
		System.out.println(new Hund());
		
	}

	private static void b1() {
		class Katze{
			@Override
			public String toString() {
				return "Katze " + nummer;
			}
		}
		
		System.out.println(new Katze());
		nummer = 100;
		
	}

}
