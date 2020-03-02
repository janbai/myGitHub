package innerClasses;

import java.util.ArrayList;
import java.util.List;

class Baum{
	int alter;
	Baum(){}
	public Baum(int alter) {
		this.alter = alter;
	}
	public int getAlter() {
		return alter;
	}
	
	
	
}


public class Test_03 {

	public static void main(String[] args) {
		Baum b1 = new Baum(){};
		Baum b2 = new Baum(1200) {};
		System.out.println(b2.getAlter());
		System.out.println(b2.getClass().getName());
		System.out.println(b2 instanceof Baum);
		
		Baum b3 = new Baum(7) {
			@Override
			public int getAlter() {
				return super.getAlter()*1000;
			}
		};
		System.out.println(b3.getAlter());
		
		List<Integer> list = new ArrayList<>() {
			{
				add(1);
				add(2);
				add(3);
			}
			
		};
		
		System.out.println(list.toString());

	}

}
