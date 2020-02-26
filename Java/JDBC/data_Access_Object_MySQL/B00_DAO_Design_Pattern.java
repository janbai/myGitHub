package data_Access_Object_MySQL;

import java.util.List;

class Tier {
	private int id;
	private String name;
	private int alter;
	
	public Tier(int id, String name, int alter) {
		this.id = id;
		this.name = name;
		this.alter = alter;
	}
	
	@Override
	public String toString() {
		return name + " id: " + id + ", alter: " + alter;
	}
}

class Tiers {
	public static TierDAO getDefaultDAO() {
		return new MySqlTierDAO();
	}
}

/*
 * DAO (Data Access Object):
 * 
 * 	Verstecken der Einzelheiten der Verwaltung der Daten vom Rest der Anwendung
 * 
 */

interface TierDAO {
	void create(Tier t);
	void delete(int id);
	void update(Tier t);
	Tier findByID(int id);
	List<Tier> getAllTiere();
}

// Der Rest der Anwendung: keine Details zu der TierDAO-Realisierung sind bekannt
public class B00_DAO_Design_Pattern {

	public static void main(String[] args) {

		TierDAO dao = Tiers.getDefaultDAO();
		
		Tier t = new Tier(4, "Rex", 2);
		dao.create( t );
		
		dao.delete( 2 );

		dao.update( new Tier(1, "Tomas", 9) );
		
		System.out.println( dao.findByID(1) );

		List<Tier> alleTiere = dao.getAllTiere();
		
		System.out.println("*** alle Tiere: ");
		alleTiere.forEach(System.out::println);
	}

}
