package examples;

interface KannBehandeltWerden{
	void setGesund(boolean gesund);
	boolean isGesund();
}

class Lebewesen implements KannBehandeltWerden {
	private boolean gesund;
	
	public void setGesund(boolean gesund) {
		// TODO Auto-generated method stub
		
	}

	
	public boolean isGesund() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
class Mensch extends Lebewesen{
	
}
class Arzt extends Mensch {

}

abstract class Tier extends Lebewesen {
	
}
class Zebra extends Tier{
	
}

class Affe extends Tier{
	
}

class Zoo{
	private Collection<Tier> tier = new ArrayList<>();
	
}

public class Generics_Zoo {

	public static void main(String[] args) {


		

	}

}
