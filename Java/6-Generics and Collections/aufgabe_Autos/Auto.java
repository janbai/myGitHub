package aufgabe_Autos;

import java.util.Objects;

public abstract class Auto <T extends Auto<?>> implements Comparable<T> {
	
	protected String modell;
	protected int baujahr;

	public Auto(String modell, int baujahr) {
		this.modell = modell;
		this.baujahr = baujahr;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ". Modell: " + modell + ", Baujahr " + baujahr;
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("in equals");
		if(obj==null) {
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		@SuppressWarnings("unchecked")
		Auto<T> a2 = (Auto<T>) obj;
		return Objects.equals(modell, a2.modell) && baujahr==a2.baujahr;
	}
	
	@Override
	public int hashCode() {
//		System.out.println("in hashCode");
		return Objects.hashCode(modell) + baujahr;
	}	
	
	
	@Override
	public int compareTo(T a2) {
//		System.out.println("in compareTo");
		int erg = modell.compareTo(a2.modell);
		
		if(erg==0) {
			erg = baujahr - a2.baujahr;
		}
		
		return erg;
	}
}
