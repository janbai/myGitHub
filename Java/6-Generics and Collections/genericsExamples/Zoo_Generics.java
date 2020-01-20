package genericsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;



class Zoo{
	
private Collection<Tier> tiere = new ArrayList<>();




	@Override
public String toString() {
	return "Zoo|";
}

	public void add(Tier t) {
		tiere.add(t);
	}
	
	public Collection<Tier> getTiere() {
		return tiere;
	}
	
	public void zooReport() {

		Iterable<Tier> ite = tiere;
		
		ite.forEach(System.out::println);
	}
}
class Praxis <L extends Lebewesen>  {
;
	 public void reportGesund(Lebewesen L) {
		if(L.isGesund()) {
			System.out.println(L.getClass().getSimpleName() +": alles ist gut, danke!");			
		}else {
			System.out.println(L.getClass().getSimpleName() +": muss behandelt werden......ruf den Arzt!");		
		}
	}
}


class Futter <T extends Tier>{
	
	
	public void sceduleFutter(Tier T) {
		if(T.isFutter()) {
			System.out.println(T.getClass().getSimpleName() +": ich bin voll, danke!");			
		}else {
			System.out.println(T.getClass().getSimpleName() +": ich bin hungar......!");		
		}
	}
}
abstract class Lebewesen extends Zoo  {
	
private boolean gesund;
	
	public boolean isGesund() {	return gesund;}
	

	public void getReportGesund() {
		System.out.println("in den Lebewesen");
	
	}

	@Override
	public String toString() {
		
		return super.toString() + getClass().getSimpleName() + " " +  ( gesund ? ": gesund" : ": krank") ;
				
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
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
	private static int i=0;
	public static void main(String[] args) {
		Affe affe = new Affe();
		Zebra zebra = new Zebra();
		Zoo zooBerlin = new Zoo();
		zooBerlin.add(affe);
		zooBerlin.add(zebra);
		
		zooBerlin.zooReport();
		
		
		Praxis<Affe> affePraxis = new Praxis<>();
		affePraxis.reportGesund(affe);
		
		Arzt<Affe> affeArzt = new Arzt<>();
		affeArzt.behandeln(affe);
		
		zooBerlin.zooReport();
		
		affePraxis.reportGesund(affe);
	//	affeArzt.behandeln(zebra);
		Futter<Affe> affeFutter = new Futter<>();
		affeFutter.sceduleFutter(affe);
		
		
		Pfleger<Affe> affePfleger = new Pfleger<>();
		affePfleger.behandeln(affe);
		System.out.println(affe);
		affeFutter.sceduleFutter(affe);
		
		Mensch arbeiter = new Mensch();
		Arzt<Mensch> menschArzt = new Arzt<>();
		System.out.println(arbeiter);
		menschArzt.behandeln(arbeiter);
	
				
	}

}
