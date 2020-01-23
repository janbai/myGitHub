package practice;

import java.util.stream.Stream;

public class Sorted_Stream {
static class Rechteck{
private Integer breite, hoehe;
	
	
	public Rechteck(Integer breite, Integer hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	
	public Integer getBreite() {
		return breite;
	}


	public void setBreite(Integer breite) {
		this.breite = breite;
	}

	public Integer getHoehe() {
		return hoehe;
	}

	public void setHoehe(Integer hoehe) {
		this.hoehe = hoehe;
	}

	@Override
	public String toString() {
		return "Rechteck " + breite + " X " + hoehe;
	}


	
	
}
	public static void main(String[] args) {


		Stream.of(5, -7, 3, -2)
		.sorted().forEach(System.out::println);


	}

}
