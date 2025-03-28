import java.util.Scanner;
import java.util.Arrays;

public class Minimum {
	public static void main(String[] args) {
		
		int[] numbers = readIntergers();
		int min =  findMin(numbers);

		System.out.println("Array: " + Arrays.toString(numbers));
		System.out.println("Array minimum value: " + min);
	}

	private static int[] readIntergers() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter comma separated numbers: ");
		String line = sc.nextLine();

		String[] tokens = line.split(",");
		int[] numbers = new int[tokens.length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(tokens[i].trim());
		}

		return numbers;
	}

	private static int findMin(int[] numbers) {
		
		int minimum = numbers[0];
		for (int val : numbers) {
			if (val < minimum) {
				minimum = val;
			}
		}
		return minimum;
	}
}
