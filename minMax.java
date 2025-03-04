import java.util.Scanner;

public class minMax {
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		while (true) {
			System.out.print("Enter number: ");
			boolean isNumber = scannerObj.hasNextInt();

			if (isNumber) {
				int number = scannerObj.nextInt();
				if (number > max) {
					max = number;
				}
				if (number < min) {
					min = number;
				}
			} else {
				break;
			}

			scannerObj.nextLine();
		}

		System.out.println("Min: " + min + " Max: " + max);

		scannerObj.close();
	}
}