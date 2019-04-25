package examples;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFinderBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Create and initialise an array of any 8 ints call it 'myNumbers'
		int[] myNumbers = new int[] { 11, 33, 52, 2, 94, 16, 8, 47 };

		// copy original then sort and display original and sorted arrays
		int[] sortedNumbers = Arrays.copyOf(myNumbers, myNumbers.length);
		sortArray(sortedNumbers);

		String input;
		int count = 0;
		// Ask the user to enter a number
		do {
			if (count == 0 || count % 5 == 0) {
				PrintNumbers(myNumbers, sortedNumbers);
			}
			System.out.println("\nEnter the number you'd like to search for: ");
			input = scanner.next();

			int numberToFind ;
			System.out.printf("'%s'", input);
			if (tryParse(input)) {
				numberToFind = Integer.parseInt(input);
				// Invoke your NumberSearch method and check
				// the return value from it to see if the number was found
				// printing out an appropriate message in either situation

				int pos = NumberSearchBinary(sortedNumbers, numberToFind);
				if (pos > 0) {
					System.out.printf("Number %d found at position %d index pos [%d]", numberToFind, pos + 1, pos);
				} else {
					int newPos = Math.abs(pos);
					System.out.printf("Number %d returns %d position %d index [%d]", numberToFind, pos, newPos, newPos - 1);
				}
			} else if (input.equals("\n")) {
				System.exit(0);
			} else {
				System.out.println("Must enter a numeric value");
				return;
			}

			
			count++;
		} while (!input.equals("\n"));

	} // End of Main()

	private static void sortArray(int[] sortedNumbers) {
		Arrays.sort(sortedNumbers);

	}

	// search for an int in an int[] returning its position in the array if it is
	// there, else -1 if it is not
	public static int NumberSearchBinary(int[] numbers, int numToFind) {
		// this only works if Array is sorted
		return Arrays.binarySearch(numbers, numToFind);
	}

	// print all the numbers in the array
	public static void PrintNumbers(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println();
	}

	private static void PrintNumbers(int[] myNumbers, int[] sortedNumbers) {
		int length = myNumbers.length;
		if (length == sortedNumbers.length) {
			System.out.printf("\nPos\tValue\tSorted\t\n");
			for (int i = 0; i < length; i++) {
				System.out.printf("[%d] =\t%d\t%d\n", i, myNumbers[i], sortedNumbers[i]);
			}
		} else {
			System.out.println("Whoops arrays not same length???");
		}

	}

	private static Boolean tryParse(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
} // End of class
