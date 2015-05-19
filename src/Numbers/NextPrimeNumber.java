package Numbers;

import java.util.Scanner;

/**
 * @author Jess
 * Finds the next prime number, starting at 2, until the user decides to
 * stop asking for another.
 */
public class NextPrimeNumber {

	public static void main(String[] args) {

		boolean keepGoing = true;

		int num = 2;

		while (keepGoing) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Would you like another prime number? (Y or N) ");

			if (scanner.next().equals("Y")) {

				boolean isPrime = false;

				while (!isPrime) {
					if (recursivePrime(num, num - 1) == 1) {
						System.out.println();
						System.out.println(num);
						num++;
						isPrime = true;
					} else {
						num++;
					}
				}

			}

			else {
				System.out.println();
				System.out.println("Thanks for checking out my program! Have a good day.");
				keepGoing = false;
			}
		}
	}
	
	/**
	 * Recursively determines whether the given number x is a prime number or not.
	 * @param x
	 * @param i
	 * @return 1 if prime, 0 if not prime
	 */

	private static int recursivePrime(int x, int i) {
		if (i == 1)
			return 1;

		else if (x % i == 0)
			return 0;

		else
			return recursivePrime(x, i - 1);
	}

}
