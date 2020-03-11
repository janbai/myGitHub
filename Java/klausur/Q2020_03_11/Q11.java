package Q2020_03_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Temperature {
String location;
Double temp;
public Temperature(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}

public class Q11 {

	public static void main(String[] args) {
		List<Temperature3> julyAvgs = new ArrayList<Temperature3>();
		julyAvgs.add(new Temperature3("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature3("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature3("Reno, NV", 80.5));
		julyAvgs.add(new Temperature3("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature3("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature3("Miami, FL", 85.7));
		
		Comparator<Temperature3>
		tCompare = ((t1, t2) -> t1.getTemp().compareTo(t2.getTemp()));
		Optional<Temperature3> max = julyAvgs.stream().max(tCompare);

	}

}
