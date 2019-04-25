package examples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateTime {

	public static void main(String[] args) {
		int year = 2000 ;
		
		LocalDate ld = LocalDate.now();
		LocalDate myDate = LocalDate.of(year, 1, 1) ;
		
		System.out.println(ld);
		
		System.out.println(myDate.isLeapYear());

		System.out.printf("Days old : %d", ChronoUnit.DAYS.between(myDate, LocalDate.now()));
	}

}
