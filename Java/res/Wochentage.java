package res;

import java.util.ListResourceBundle;

public class Wochentage extends ListResourceBundle {

	
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{ "mo", "Montag" },
			{ "di", "Dienstag" },
		};
	}
	
}
