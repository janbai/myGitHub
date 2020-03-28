package pkg1_Encapsulation;
//Dynamic polymorphism in Java is achieved by method overriding
class Vehicle{
    public void move(){
    System.out.println("Vehicles can move!!");
    }
}

class MotorBike extends Vehicle{
    public void move(){
    System.out.println("MotorBike can move and accelerate too!!");
    }
}


public class B08_Dynamic_Polymorphism {

	 public static void main(String[] args){
		    Vehicle vh = new MotorBike();
		    vh.move();    		// prints MotorBike can move and accelerate too!!
		    vh=new Vehicle();
		    vh.move();    		// prints Vehicles can move!!
		    }
	}
