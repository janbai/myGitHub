package Q2020_03_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Temperature6 {
String location;
Double temp;
public Temperature6(String location, Double temp) {
this.location = location; this.temp = temp;
}
public String getLocation() { return this.location; }
public Double getTemp() { return this.temp; }
public String toString() {
return "July average temp at " + location + " was " + temp;
}
}
public class Q16 {
public static void main(String[] args) {
	List<Temperature6> julyAvgs = new ArrayList<Temperature6>();
	julyAvgs.add(new Temperature6("Death Valley, CA", 107.4));
	julyAvgs.add(new Temperature6("Salt Lake City, UT", 85.3));
	julyAvgs.add(new Temperature6("Reno, NV", 80.5));
	julyAvgs.add(new Temperature6("Bishop, CA", 80.8));
	julyAvgs.add(new Temperature6("Phoenix, AZ", 106.0));
	julyAvgs.add(new Temperature6("Miami, FL", 85.7));
	
	Map<Boolean, List<String>> temp100 =
			julyAvgs.stream().collect(
			Collectors.partitioningBy(t -> t.getTemp() >= 100.0,
			Collectors.mapping(t -> t.getLocation(),
			Collectors.toList())));
			System.out.println(temp100);
}
}
