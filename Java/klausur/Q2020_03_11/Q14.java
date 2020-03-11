package Q2020_03_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Temperature4 {
String location;
Double temp;
public Temperature4(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }

public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}
public class Q14 {

	public static void main(String[] args) {
		List<Temperature4> julyAvgs = new ArrayList<Temperature4>();
		julyAvgs.add(new Temperature4("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature4("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature4("Reno, NV", 80.5));
		julyAvgs.add(new Temperature4("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature4("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature4("Miami, FL", 85.7));
		
		Comparator<Temperature4> tCompare =
				((t1, t2) -> t1.getTemp().compareTo(t2.getTemp()));
				List<Temperature4> sortedTemps =
				julyAvgs.stream()
				.sorted(tCompare).collect(Collectors.toList());
				sortedTemps.forEach(System.out::println);
				
	}

}
