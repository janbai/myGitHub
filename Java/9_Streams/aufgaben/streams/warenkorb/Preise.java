package aufgaben.streams.warenkorb;

import java.util.HashMap;
import java.util.Map;

public class Preise {

	public static Map<String, Integer> STANDARD_PREISE = new HashMap<>();
	
	static {
		STANDARD_PREISE.put("Brot", 129);
		STANDARD_PREISE.put("Wurst", 230);
		STANDARD_PREISE.put("Milch", 99);
	}

}
