package aufgaben;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kreis  {

	private Integer radius;
	
	public Kreis(Integer breite) {
		this.radius = breite;
		
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Kreis R= " + radius ;
	}

public Double getArea() {
	return this.radius*Math.PI;
	
}

	public static void main(String[] args) {
		
		Integer[] radien = {2, 4, 1, 5};
		
	//Comparator<Kreis> cmp = Comparator.comparing(Kreis::getRadius);
		Supplier<TreeSet<Kreis>> supplier = () -> {
			return new TreeSet<>(Comparator.comparingInt(Kreis::getRadius));
		};
		TreeSet<Kreis> result = Arrays.stream(radien)
				.map(Kreis::new)
				.collect(supplier, TreeSet::add, TreeSet::addAll  );
		
		System.out.println("result: " + result);
		System.out.println("-------------------");
		
		
		
	}

}
