package LocalDate_003_115_125;

import java.time.LocalDate;

public class Q125 {

	public static void main(String[] args) {


		LocalDate date = LocalDate.of(2012, 01, 32);// DateTimeException
						//Invalid value for DayOfMonth (valid values 1 - 28/31): 32
		date.plusDays(10);
		System.out.println(date);

	}

}
