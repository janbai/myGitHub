package enums;

import java.util.EnumMap;
import java.util.EnumSet;

enum Level {
    HIGH (3),
    MEDIUM(2),
    LOW(1);
	
	private final int levelCode;

    private Level(int levelCode) {
        this.levelCode = levelCode;
    }
// you cannot create sertter 
	public int getLevelCode() {
		return levelCode;
	}
	
    
}
enum LevelAsLower {
    HIGH{
        @Override
        public String asLowerCase() { return HIGH.toString().toLowerCase();}
    },
    MEDIUM{
        @Override
        public String asLowerCase() { return MEDIUM.toString().toLowerCase();}
    },
    LOW{
        @Override
        public String asLowerCase() { return LOW.toString().toLowerCase();}
    };

    public abstract String asLowerCase();
}  


public class B04_Declaring_Enums {

	public static void main(String[] args) {
		Level level= Level.LOW;
		
		//Enums in if Statements
				if( level == Level.HIGH) { System.out.println("High in if Statements ");}
				else if( level == Level.MEDIUM) { System.out.println("Medium in if Statements");}
				else if( level == Level.LOW) {System.out.println("Low in if Statements");}
		level = Level.HIGH;
		
		//Enums in switch Statements
				switch (level) {
			    case HIGH   : System.out.println("High in switch Statements");; break;
			    case MEDIUM : System.out.println("Medium in switch Statements");; break;
			    case LOW    : System.out.println("Low in switch Statements");; break;
			}
				
		// Enum Iteration
				System.out.print("Enum Iteration: ");
				for (Level l : Level.values()) {
				    System.out.print(l +", ");
				}	
				System.out.println();
				
		//Enum toString()	
				String levelText = Level.HIGH.toString();
				System.out.println(levelText);
		
		// Enum Printing
				System.out.println(Level.HIGH);
		//Enum valueOf()		
				Level levelValue = Level.valueOf("MEDIUM");
				
				System.out.println(levelValue.toString());
				System.out.println(levelValue.getLevelCode());
		// Enum Abstract Methods
				LevelAsLower l2 = LevelAsLower.HIGH;
				System.out.println(l2.asLowerCase());
				
		//EnumSet
				EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
				enumSet.forEach(System.out::println);
		//EnumMap
				EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
				enumMap.put(Level.HIGH  , "High level");
				enumMap.put(Level.MEDIUM, "Medium level");
				enumMap.put(Level.LOW   , "Low level");

				String level3 = enumMap.get(Level.HIGH);
				System.out.println(level3);
				
	}

}
