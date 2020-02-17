package examples;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;



public class Optional_API {

	public static void main(String[] args) {


		Optional<Integer> op1 = Optional.empty();
		Optional<Integer> op2 = Optional.of(12);
		
		try {
			Optional.of(null);
		} catch (NullPointerException e) {
			System.out.println("Fehler!");
		}

		Optional<Integer> op3 = Optional.ofNullable(12);
		Optional<Integer> op4 = Optional.ofNullable(null);
		
		System.out.println(op1.isEmpty());
		System.out.println(op1.isPresent());
		System.out.println();
		
		try {
			op1.get();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		
		Integer value = op2.get();
		System.out.println(value);//12
		
		
		if(op2.isPresent()){
			System.out.println(op2.get());
		}
		
		Consumer<? super Integer> action = x -> System.out.println(x);
		op2.ifPresent(action );
		
		op2.ifPresent(x -> System.out.println("x: " + x));
		
		Optional<Integer> op6 = Optional.empty();
		System.out.println(op6.orElse(33));
		
		Optional<Integer> op7 = Optional.empty();
		Supplier<IllegalArgumentException> exceptionalSupplier = () -> new IllegalArgumentException("op7 war leer");
		try {
			Integer result7 = op7.orElseThrow(exceptionalSupplier);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		//op7.orElseThrow( () -> new Exception());
		System.out.println("end of main");
	}

}
