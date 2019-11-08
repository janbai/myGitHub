

public class ReadAppProperties {

	public static void main(String[] args) {


		String userName = new com.sun.security.auth.module.NTSystem().getName();
		System.out.println("Gesucht war die Property " + userName);
		
		String propName= System.getProperty("user.name") ;	
		System.out.println("Gefunden:" + propName);
		
		
		
		
	}

}
