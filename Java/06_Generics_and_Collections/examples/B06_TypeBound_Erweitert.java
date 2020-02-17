package examples;

import java.util.Comparator;

/*
 * Mehrere Basistypen bei dem Type bound sind möglich
 */
class UseRunnableStringComparator <T extends Runnable & Comparator<String>> {
	
	void go(T value) {
		value.run();
		
		value.compare("aaa", "bbb");
	}
}


public class B06_TypeBound_Erweitert {

	static class RunnableStringCmpImpl implements Runnable, Comparator<String> {
		public void run() {
			System.out.println("in der run");
		};
		public int compare(String o1, String o2) {
			System.out.println("in der compare");
			return 0;
		};
	}
	
	public static void main(String[] args) {
		
		UseRunnableStringComparator<RunnableStringCmpImpl> launcher = new UseRunnableStringComparator<>();
		
		launcher.go( new RunnableStringCmpImpl() );

	}

}
