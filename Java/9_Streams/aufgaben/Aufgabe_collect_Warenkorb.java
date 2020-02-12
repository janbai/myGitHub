package aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Aufgabe_collect_Warenkorb {
	private static List<Produkt> buildWarenkorb(List<Bestellung> bestellungen) {
		return null;
		
		/*BiConsumer<List<Produkt>,List<Produkt>> combiner = List::addAll;
		BiConsumer<List<Produkt>, Bestellung> accumulator = null;
		Supplier<List<Produkt>> supplier = ArrayList::new;
		return bestellungen.stream()
				.map(Bestellung::getProduktName)
				
				.collect(ArrayList::new, List::add, List::addAll);
				*/
	}

	public static void main(String[] args) {


		List<Produkt> warenkorb = new ArrayList<>();
		warenkorb.add(new Produkt("Brot", 129));
		warenkorb.add(new Produkt("Wurst", 230));
		warenkorb.add(new Produkt("Milch", 99));
		warenkorb.add(new Produkt("Milch", 99));

		
		int preisIntCent = warenkorb.stream()
								.map(Produkt::getPreis)
								.reduce(0 , Integer::sum);
		
		System.out.println("***A1 **** ..Price: " + preisIntCent);
		
		
		List<Bestellung> bestellungen = new ArrayList<>();
		bestellungen.add(new Bestellung("Brot", 3));
		bestellungen.add(new Bestellung("Wurst", 1));
		bestellungen.add(new Bestellung("Milch", 2));

		 warenkorb = buildWarenkorb(bestellungen);
	}


}
