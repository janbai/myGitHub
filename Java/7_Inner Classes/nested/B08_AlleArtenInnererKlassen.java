package nested;


class Zoo {
	
	// Innere (inner, nested) Klasse
	class Hund {
		public String toString() { return "Hund aus dem Zoo: " + Zoo.this;	}
	}
	
	// Innere statische Klasse
	static class Katze {
	}
	
	
	// neues Objekt mit einer anonymen Klasse
	Object att = new Object() {
		public String toString() { return "Objekt aus dem Zoo: " + Zoo.this; }
	};
	
	
	// neues Objekt mit einer anonymen Klasse (static)
	static Object staticAtt = new Object() {
	}; 
	
	
	static void staticMethod() {
	
		// Lokale Klasse (static)
		class Affe {
		}
		
		// neues Objekt mit einer anonymen Klasse (static)
		new Object() {
			
		};
		
	}
	
	
	void method() {
		
		// Lokale Klasse
		class Zebra {
			public String toString() { return "Zebra aus dem Zoo: " + Zoo.this;	}
		}
		
		// neues Objekt mit einer anonymen Klasse 
		new Object() {
			public String toString() { return "Objekt aus dem Zoo: " + Zoo.this; }
		};
	}
	
} // end of Zoo



public class B08_AlleArtenInnererKlassen {

	public static void main(String[] args) {

		new Zoo().new Hund();
		
		new Zoo.Katze();
		
		Object x = new Zoo().att;
		System.out.println(x);
		
		Object y = Zoo.staticAtt;
		
	}

}
