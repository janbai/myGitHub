package Q2020_03_11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

class Temperature2 {
String location;
Double temp;
public Temperature2(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}
public class Q12 {

	public static void main(String[] args) {
		List<Temperature2> julyAvgs = new ArrayList<Temperature2>();
		julyAvgs.add(new Temperature2("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature2("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature2("Reno, NV", 80.5));
		julyAvgs.add(new Temperature2("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature2("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature2("Miami, FL", 85.7));
		
		OptionalDouble maxT = julyAvgs.stream().mapToDouble(t -> t.getTemp()).max();
	}

}
