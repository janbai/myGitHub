package declarations_modifiers;

public class B06_Declaring_Class_Members_public {}
/*
 * Class members can use all four:
■ public
■ protected
■ default
■ private
 * 
*/
// 1- using the dot operator (.) to invoke a method or retrieve a variable
class Zoo {
public String coolMethod() {
return "Wow baby";
}
}
class Moo {
public void useAZoo() {
Zoo z = new Zoo();
// If the preceding line compiles Moo has access to the Zoo class
// But... does it have access to the coolMethod()?
System.out.println("A Zoo says, " + z.coolMethod());

// The preceding line works because Moo can access the public method
}
}

//2- if a subclass inherits a member, the subclass has the member

class Zoo2 {
public String coolMethod() {
return "Wow baby";
}

}
class Moo2 extends Zoo2 {
public void useMyCoolMethod() {
// Does an instance of Moo inherit the coolMethod()?
System.out.println("Moo2 says, " + this.coolMethod());
System.out.println(coolMethod());// without this.
// The preceding line works because Moo can inherit the public method
// Can an instance of Moo invoke coolMethod() on an instance of Zoo?
Zoo2 z = new Zoo2();
System.out.println("Zoo2 says, " + z.coolMethod());
// coolMethod() is public, so Moo can invoke it on a Zoo reference
}
}


class SportsCar {
	void goFast( ) {	}
	void doStuff( ){ goFast( );}
	
}

class Convertible extends SportsCar{
	void doThings(){
		SportsCar sc = new SportsCar();
		sc.goFast();
		
	}
	void doMore() {
		goFast();
		this.goFast();
	}
}

class Driver {
	void doDriverStuff() {
		SportsCar sc = new SportsCar();
		sc.goFast();
		
		Convertible con = new Convertible ();
		con.goFast();
		
		SportsCar con1 = new Convertible();
	}
}