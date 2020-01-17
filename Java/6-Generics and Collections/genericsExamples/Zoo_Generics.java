package genericsExamples;

interface Reports{
	void setGesund(boolean gesund);
	boolean isGesund();
	void reportGesund();
	void sceduleFutter();
}

class Zoo{}
class Gesund <L extends Lebewesen> implements Reports{
	Lebewesen L;
	
	public void reportGesund() {
		if(L.isGesund()) {
			System.out.println(getClass().getSimpleName() +": alles ist gut, danke!");			
		}else {
			System.out.println(getClass().getSimpleName() +": muss behandelt werden......ruf den Arzt!");		
		}
	}

	@Override
	public void setGesund(boolean gesund) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isGesund() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sceduleFutter() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


class Futter <T extends Tier>{
	Tier T;
	
	public void sceduleFutter() {
		if(T.isFutter()) {
			System.out.println(getClass().getSimpleName() +": ic bin voll, danke!");			
		}else {
			System.out.println(getClass().getSimpleName() +": ich bin hungar......!");		
		}
	}
}
class Lebewesen <G extends Gesund>implements Reports{
private boolean gesund;
	
	public boolean isGesund() {	return gesund;}

	@Override
	public String toString() {
		
		return getClass().getSimpleName() + " " +  ( gesund ? ": gesund" : ": krank") ;
				
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}

	
	public void reportGesund() {
		
	}
	@Override
	public void sceduleFutter() {
		// TODO Auto-generated method stub
		
	}

		
	
}
class Mensch extends Lebewesen{
	
	
}

class Arzt<T extends Lebewesen> extends Mensch{
	void behandeln(T Lebewesen) {
		Lebewesen.setGesund(true);
		 System.out.println("Arzt: Guten besserung");
	}
}

class Pfleger<T extends Tier> {
	void behandeln(T Tier) {
		Tier.setFutter(true);
		 System.out.println("Pfleger: Guten Appetit");
		}
}


class Tier extends Lebewesen{
	private boolean futter;

	public boolean isFutter() {
		return futter;
	}

	public void setFutter(boolean futter) {
		this.futter = futter;
	}

	@Override
	public String toString() {
		return super.toString() + " " +  ( futter ? ": voll" : ": hungerig");
	}

	
	
	
}
class Affe extends Tier {}
class Zebra extends Tier {}



public class Zoo_Generics {

	public static void main(String[] args) {
		Affe affe = new Affe();
		System.out.println(affe);
	
		affe.reportGesund();
		
		Arzt<Affe> tierArzt = new Arzt<>();
		tierArzt.behandeln(affe);
		System.out.println(affe);
		
		Pfleger<Affe> affePfleger = new Pfleger<>();
		affePfleger.behandeln(affe);
		
	//	affe.reportGesund();
		
		Mensch arbeiter = new Mensch();
		Arzt<Mensch> menschArzt = new Arzt<>();
		System.out.println(arbeiter);
		menschArzt.behandeln(arbeiter);
		
	}

}
