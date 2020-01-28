package intermediate_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;



public class intermediate_destrict {
	static class Blume{
		private double price;
	
		public Blume( double price) {
			this.price = price;
		}
		public Blume() {
		
		}
		@Override
		public String toString() {
			return "Blume: " + price ;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = (int) (prime * result + price);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Blume other = (Blume) obj;
			if (price != other.price)
				return false;
			return true;
		}
		public double getPrice() {
			return price;
		}
	
		public void setPrice(int price) {
			this.price = price;
		}
		public double getDiscount() {
			return getPrice() * 0.9;
		}
		
	}
	public static void main(String[] args) {
		
		Double[] listPrice = {1.00, 3.20, 8.10, 2.50, 3.20, 8.10, 4.60, 1.00, 2.30};
		Double discount = 0.1;
		
		Stream.of(listPrice)
		.map(Arrays::asList)
		.flatMap(List::stream)
		.map(Blume::new)
		//.map(Blume::getDiscount)
		.distinct()
		.forEach(System.out::println);
		
		
	}

}
