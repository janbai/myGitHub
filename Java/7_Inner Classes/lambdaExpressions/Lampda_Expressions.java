package lambdaExpressions;

class MyWonderfullClass{
		void go() {
			Bar b = new Bar();
			/*
			 	b.doStuff(	
				    		new Foo(){
					    			public void foof() { 
			    				System.out.println("foofy");
			    				}
			    			}
			    		); 
			 */
		    
						
			b.doStuff(()->System.out.println("lambda expressions: foofy.."));
			Foo f = () -> System.out.println("lambda expresion: footy 2...");
			b.doStuff(f);
		  }
	}

	interface Foo {
		void foof();
	}

	class Bar{
		void doStuff(Foo f) {
			f.foof();
		}
	}


	public class Lampda_Expressions {

		public static void main(String[] args) {
			
			
			MyWonderfullClass wf = new MyWonderfullClass();
			wf.go();
			
			

		}

	}
