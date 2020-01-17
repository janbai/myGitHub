package genericsExamples;

interface KannGetanWerden{
	void setGesund(boolean gesund);
	boolean isGesund();
}

class Zoo{}


interface Gesund  {
	
	void reportGesund();
	 void setGesund(boolean gesund);
}

class Lebewesen implements Gesund{
	private boolean gesund;
	private boolean futter;
	public boolean isGesund() {	return gesund;}

	public void setGesund(boolean gesund) {this.gesund = gesund;}
	
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + (gesund ? ": (gesund" : ": (krank") + ", " + (futter ? "hungrig!)" : "nicht hungrig!)");
	}


	public void reportGesund() {
		if(isGesund()) {
			System.out.println(getClass().getSimpleName() +": alles ist gut, danke!");			
		}else {
			System.out.println(getClass().getSimpleName() +": muss behandelt werden......ruf den Arzt!");		
		}
	}
}
class Mensch extends Lebewesen{}

class Arzt<T extends Lebewesen> extends Mensch{
	void behandeln(T Lebewesen) {
		Lebewesen.setGesund(true);
	 System.out.println("Arzt: Guten besserung");
	}
}

class Tier extends Lebewesen{}
class Affe extends Tier {}
class Zebra extends Tier {}



public class Zoo_Generics {

	public static void main(String[] args) {
		Affe affe = new Affe();
		System.out.println(affe);
		affe.reportGesund();
		
		Arzt<Affe> tierArzt = new Arzt<>();
		tierArzt.behandeln(affe);
		affe.reportGesund();
		
		Mensch arbeiter = new Mensch();
		Arzt<Mensch> menschArzt = new Arzt<>();
		System.out.println(arbeiter);
		menschArzt.behandeln(arbeiter);
		
	}

}
