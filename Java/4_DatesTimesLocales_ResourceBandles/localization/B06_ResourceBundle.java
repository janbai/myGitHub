package localization;

import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

public class B06_ResourceBundle {

	public static void main(String[] args) {

		
		String baseName = "res.Lables";
		ResourceBundle rb = ResourceBundle.getBundle(baseName);
		
		
		String greeting = rb.getString("text.greeting");
		System.out.println(greeting);
		
		System.out.println(greeting);
		
		
		
		
	}

}
