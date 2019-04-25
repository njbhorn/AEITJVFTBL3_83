package examples;

import java.util.Random;
import java.util.Scanner;

public class NameGuessPromptName {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ) ;
		String name = "" ;
		do {
			name = getName("Please enter a name to guess : ", sc) ;
			guessName(name) ;
		} while ( name.equals("")) ;
	}

	private static void guessName(String name) {
		if ( name.contentEquals("")) return ;
		long startTime = System.nanoTime() ;
		String guess = ""; // starts empty
		int attempts = 0;
		Random r = new Random();
		while (!guess.equals(name.toLowerCase())) { // try again
			guess = "";
			while (guess.length() < name.length()) {
				char ascii = (char) (r.nextInt(26) + 97); // random a-z
				guess += ascii; // add char to the guess
			}
			attempts++; // increment attempts
		}
		long endTime = System.nanoTime();
		long elapsedTime = endTime - startTime ;
		System.out.printf("'%s' found after %,d attempts\n in %d milliseconds!\n", name, attempts, elapsedTime / 1000000);
	}

	private static String getName(String prompt, Scanner sc) {
		System.out.println(prompt) ;
		return sc.nextLine() ;
	}

}
