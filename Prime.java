/**
 * Prime numbers 1-100
 * 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71
 * 73 79 83 89 97
 */

public class Prime {
	public static void main(String[] args) {
		// System.out.println(isPrime(101));

		int count = 1;
		do {
			System.out.print(isPrime(count) ? count : " ");
			count++;
		} while (count < 100);
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < (long) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}