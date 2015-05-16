package Numbers;

import java.util.Scanner;

/**
 * @author Jess
 * This program takes an input from the user that can be any digit, and prints the 
 * fibonacci sequence to the Nth number.
 *
 */
public class FibonacciSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int index = 0;

		System.out.print("Enter a digit to print it's fibonacci sequence: ");
		Scanner scanner = new Scanner(System.in);
		boolean isntDigit = true;
		int digit = 0;

		// This while statement will check to make sure that the input is an
		// integer between 1 and 100. It will ask for input again if the user
		// inputs something that is not an integer at all.

		while (isntDigit) {

			try {
				digit = scanner.nextInt();
				isntDigit = false;
			} catch (Exception e) {
				System.out.println();
				System.out.print("Must enter a digit between 1 and 100: ");
				scanner = new Scanner(System.in);
			}
		}
		
		while (index < digit) {
			System.out.println(fibonacci(index));
			index++;
		}
	}

	public static long fibonacci(int i) {
		if (i == 0)
			return 0;
		if (i <= 2)
			return 1;

		long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
		return fibTerm;
	}
}
