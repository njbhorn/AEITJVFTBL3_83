package demo;

import java.util.Random;

public class NameGuess {

	public static void main(String[] args) {
		String name = "Amy"; // name to match with
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
		System.out.printf("%s found after %d attempts\n", name, attempts);

	}

}
