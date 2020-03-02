package lambdaExpressions;

public class B02_Lambdas {
static void activate(Runnable r) {
	r.run();
}
	public static void main(String[] args) {

		activate(()-> {});
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Anonymous class: r1");
			}
		};
		
		Runnable r2 = ()-> System.out.println("Lambda: r2");
		
		activate(r1);
		activate(r2);
		
		
		activate(new Runnable() {
			public void run() {
				System.out.println("Anonymous class: r3");
			}
		});
		activate( ()-> System.out.println("Lambda: r4"));

		
	}

}
