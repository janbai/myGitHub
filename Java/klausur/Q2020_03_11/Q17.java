package Q2020_03_11;

import java.util.ArrayList;
import java.util.List;

class Temperature7 {
String location;
Double temp;
public Temperature7(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}

public class Q17 {

	public static void main(String[] args) {
		List<Temperature7> julyAvgs = new ArrayList<Temperature7>();
		julyAvgs.add(new Temperature7("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature7("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature7("Reno, NV", 80.5));
		julyAvgs.add(new Temperature7("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature7("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature7("Miami, FL", 85.7));

		julyAvgs.stream()
		.map(t -> t.getLocation())
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		
		julyAvgs.stream()
		.sorted((t1, t2) -> t1.getLocation().compareTo(t2.getLocation()))
		.forEach(System.out::println);
		System.out.println();
		
		julyAvgs.stream()
		.map(t -> t.getLocation())
		.sorted((l1, l2) -> l1.compareTo(l2))
		.forEach(System.out::println);
		
	}

}
