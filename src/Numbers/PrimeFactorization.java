package Numbers;

import java.util.Scanner;

/**
 * 
 * @author Jess This program takes a digit as input from the user, and then
 *         prints out all of that numbers prime factors.
 */

public class PrimeFactorization {

	public static void main(String[] args) {

		System.out.print("Enter a digit to find all of its prime factors: ");
		Scanner scanner = new Scanner(System.in);

		boolean isntDigit = true;
		int digit = 0;
		int index = 0;

		// This while statement will check to make sure that the input is an
		// integer. It will ask for input again if the user
		// inputs something that is not an integer at all.

		while (isntDigit) {

			try {
				digit = scanner.nextInt();
				isntDigit = false;
			} catch (Exception e) {
				System.out.println();
				System.out.print("Must enter a digit: ");
				scanner = new Scanner(System.in);
			}
		}

		System.out.println();

		for (index = digit; index > 0; index--) {
			if (digit % index == 0) {
				System.out.print(index + " ");
			}
		}

	}

}
