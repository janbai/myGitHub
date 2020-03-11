package Q2020_03_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Temperature3 {
String location;
Double temp;
public Temperature3(String location, Double temp) {
this.location = location; 
this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}
public class Q13 {

	public static void main(String[] args) {
		List<Temperature2> julyAvgs = new ArrayList<Temperature2>();
		julyAvgs.add(new Temperature2("Death Valley, CA", 107.4));
		julyAvgs.add(new Temperature2("Salt Lake City, UT", 85.3));
		julyAvgs.add(new Temperature2("Reno, NV", 80.5));
		julyAvgs.add(new Temperature2("Bishop, CA", 80.8));
		julyAvgs.add(new Temperature2("Phoenix, AZ", 106.0));
		julyAvgs.add(new Temperature2("Miami, FL", 85.7));
		
		
		Comparator<Temperature2> tCompare =
				((t1, t2) -> t1.getTemp().compareTo(t2.getTemp()));
				Optional<Temperature2> min = julyAvgs.stream().min(tCompare);
				min.ifPresent(m -> System.out.println("Min: " + m));
				Optional<Temperature2> coolerSpot =
				julyAvgs.stream().filter(t -> t.getTemp() < 100.0).findAny();
				
				if (coolerSpot.isPresent()) {
				System.out.println("A cooler spot for July: " + coolerSpot.get());
				} else {
				System.out.println("No place cool in July!");
				}
	}

}
