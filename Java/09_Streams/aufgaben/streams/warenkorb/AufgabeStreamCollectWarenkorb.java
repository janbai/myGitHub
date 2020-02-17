package aufgaben.streams.warenkorb;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class AufgabeStreamCollectWarenkorb {

	public static void main(String[] args) {
		a1();
		a2();
	}
	
	static List<Produkt> buildWarenkorb(List<Bestellung> bestellungen) {
		Supplier<List<Produkt>> supplier = ArrayList::new;
		BiConsumer<List<Produkt>, List<Produkt>> combiner = List::addAll;
		
		BiConsumer<List<Produkt>, Bestellung> accumulator = (list, bestellung) -> {
			for(int i=0; i< bestellung.getAnzahl(); i++) {
				String name = bestellung.getProduktName();
				int preis = Preise.STANDARD_PREISE.get(name);
				list.add(new Produkt(name, preis));
			}
		}; 
		
		return bestellungen.stream()
				.map(Bestellung::getProduktName)
				.map(name -> new Produkt(name, Preise.STANDARD_PREISE.get(name)))
				.collect(ArrayList::new, List::add, List::addAll);
	}
	
	public static void a2() {
		
		System.out.println("*** A2");
		
		List<Bestellung> bestellungen = new ArrayList<>();
		bestellungen.add(new Bestellung("Brot", 3));
		bestellungen.add(new Bestellung("Wurst", 1));
		bestellungen.add(new Bestellung("Milch", 2));
		
		List<Produkt> warenkorb = buildWarenkorb(bestellungen);
		// warenkorb hat 6 Produkte (3 X Brot, 1 X Wurst, 2 X Milch)
		
		System.out.println("* Produkte: ");
		warenkorb.forEach(System.out::println);
	}
	
		
	public static void a1() {

		System.out.println("*** A1");
		
		List<Produkt> warenkorb = new ArrayList<>();
		warenkorb.add(new Produkt("Brot", 129));
		warenkorb.add(new Produkt("Wurst", 230));
		warenkorb.add(new Produkt("Milch", 99));
		warenkorb.add(new Produkt("Milch", 99));

		
		int preisInCent = warenkorb.stream()
									.reduce(0, (lastSum, nextProduct) -> lastSum + nextProduct.getPreis(), Integer::sum);
		System.out.println("Preis: " + preisInCent);
		
		preisInCent = warenkorb.stream()
								.map(Produkt::getPreis)
								.reduce(0, Integer::sum);
		
		System.out.println("Preis nochmal: " + preisInCent);
	}

}
