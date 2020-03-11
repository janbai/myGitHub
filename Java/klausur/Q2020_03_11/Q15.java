package Q2020_03_11;

import java.util.ArrayList;
import java.util.List;

class Temperature5 {
String location;
Double temp;
public Temperature5(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }

public String toString() {
return "July average temp at " + location + " was " + temp;
}
}
public class Q15 {

	public static void main(String[] args) {
		List<Temperature5> julyAvgs = new ArrayList<Temperature5>();
		julyAvgs.add(new Temperature5("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature5("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature5("Reno, NV", 80.5));
		julyAvgs.add(new Temperature5("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature5("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature5("Miami, FL", 85.7));

		julyAvgs.stream()
		.mapToLong(t -> Math.round(t.getTemp()))
		
		.sorted()
		.distinct()
		.forEach(t -> System.out.print(t + " "));
	}

}
