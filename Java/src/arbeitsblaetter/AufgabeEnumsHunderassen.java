package arbeitsblaetter;
enum Hunderasse{
	DACKEL (0.5),
	 COLLIE (),
	 DOGGE(1.5);
	
	private Hunderasse() {}
	Hunderasse(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}
	
}
private double maxGroesse = 1;
private double getMaxGroesse () {
	return maxGroesse;
}

@Override
public String toString() {
	String name = name().charAt(0)+ name().su
}
class Hunderasse {
    Hund hund;
    
    public Hunderasse(Hund hund) {
        this.hund = hund;
    }
    
    
    public void tellItLikeItIs() {
        switch (hund) {
            case DACKEL:
                System.out.println("Dackel, max. Größe: 0.5");
                break;
                    
            case COLLIE:
                System.out.println("Collie, max. Größe: 1.0");
                break;
                         
            case DOGGE: 
                System.out.println("Dogge, max. Größe: 1.5");
                break;
            
       
    }
    }

}
    
public class AufgabeEnumsHunderassen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hunderasse hund = new Hunderasse(Hund.COLLIE);
	        hund.tellItLikeItIs();
	}

}
