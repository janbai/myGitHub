package localization;

import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class B01_Properties {

	public static void main(String[] args) {


		Properties props = System.getProperties();
		
		Set<Object> allKeys = props.keySet();
		
		allKeys.forEach(x -> System.out.printf("%-30s = %s %n", x , props.get(x)));
		
		//props.list(System.out);
		
		
	}

	
		
	

}
