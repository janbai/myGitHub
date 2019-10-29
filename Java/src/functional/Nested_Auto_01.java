package functional;





public class Nested_Auto_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Rennwagen rw = new Rennwagen("Mercedes");
			
		    Rennwagen .Fahrer f = new Rennwagen.Fahrer("M.", "Schuhmacher");
		    rw.setFahrer(f);
		
		    Rennwagen.Motor m = rw.getMotor();
		
		    System.out.println(rw);		//Zeile A
		    System.out.println(m);		//Zeile B	
		
		
		
		
		
	}

}
