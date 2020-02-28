package datetime;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class B03_Instant_API_einfach {

	public static void main(String[] args) {

		/*
		 * The epoch-seconds are measured from the standard Java epoch of 1970-01-01T00:00:00Z
		 */
		Instant i1 = Instant.now();
		System.out.println(i1); 


		Instant i2 = Instant.parse("2020-02-28T07:50:23.333232200Z");
		
		System.out.println("i2: " + i2); // 2020-02-28T07:50:23.333232200Z
		
		System.out.println( i2.truncatedTo(ChronoUnit.SECONDS) );  // 2020-02-28T07:50:23Z
		
		// Immutable!
		System.out.println( i2 ); // 2020-02-28T07:50:23.333232200Z
		
	}

}
