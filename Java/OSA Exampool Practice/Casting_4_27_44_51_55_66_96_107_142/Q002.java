package Casting_4_27_44_51_55_66_96_107_142;

import java.util.ArrayList;

interface Transportation {}
class Vehicle implements Transportation {}
class Motorcycle extends Vehicle implements Transportation{}

public class Q002 {

	public static void main(String[] args) {
		ArrayList<Vehicle> myList = new ArrayList<>();
		myList.add(new Motorcycle());

	}

}
