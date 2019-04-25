package Examples;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoDateTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ) ;
		
		int year = getYear("Please enter a year", sc ) ;
		
		 while ( year != 0 ) {
			 LocalDate ld = LocalDate.of(year , 1, 1) ;
			 System.out.printf("Is %d a Leap Year : %b\n",year, ld.isLeapYear() );
			 year = getYear("Please enter a year", sc ) ;
		 }
		 
		 System.out.println("Finished...");
	}
	
	private static int getYear (String prompt, Scanner s) {
		System.out.println(prompt);
		return s.nextInt() ;
	}

}
