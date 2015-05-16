package Numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Jess This class can accept an integer between 1 and 100 and return PI
 *         up to that many decimal places.
 */

public class PiToNthDigit {

	final static BigDecimal PI = new BigDecimal(
			"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out
				.print("To how many decimal places do you want to print PI? (Max 100):");
		Scanner scanner = new Scanner(System.in);
		boolean isntDigit = true;
		int digit = 0;
		while (isntDigit) {

			try {
				digit = scanner.nextInt();
				isntDigit = false;
			} catch (Exception e) {
				System.out.println();
				System.out.print("Must enter a digit between 1 and 100: ");
				scanner = new Scanner(System.in);
			}
			
			if (digit < 1 && isntDigit == false) {
				isntDigit = true;
				System.out.println();
				System.out.print("Must enter a digit between 1 and 100: ");
				scanner = new Scanner(System.in);
			}
		}

		String format = "#.";

		for (int i = 1; i <= digit; i++) {
			format = format + "0";
		}

		DecimalFormat formatter = new DecimalFormat(format);

		System.out.println();
		System.out.println("PI to " + digit + " places is: " + formatter.format(PI));
	}

}
