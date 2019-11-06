package arbeitsblaetter;

import java.text.ParseException;

class AutoException extends Exception {}
class MotorSchadenException extends AutoException {}

class Auto {
	void fahren () throws AutoException, ParseException {}
	
}

class VW extends Auto {
	void fahren() throws MotorSchadenException {throw new MotorSchadenException();}
}

class Opel extends Auto {
	void fahren() throws ParseException{}
}

public class Exceptions_05 {

	public static void main(String[] args) {


		Auto a1 = null;
		try {
			a1.fahren();
		} catch (AutoException e) {
		e.printStackTrace();
		}
		
		
	}

}
