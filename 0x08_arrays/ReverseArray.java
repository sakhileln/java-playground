import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numbers = readIntergers();
		int[] reverseNumbers =  reverse(numbers);

		System.out.println("Array: " + Arrays.toString(numbers));
		System.out.println("Reverse Array: " + Arrays.toString(reverseNumbers));
		System.out.println("Reverse 2 Array: " + Arrays.toString(reverse2(reverseNumbers)));
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

	private static int[] reverse(int[] numbers) {
		int[] values = new int[numbers.length];
		int j = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
			values[j] = numbers[i];
			j++;
		}
		return values;
		
	}

	private static int[] reverse2(int[] array) {
		int[] numbers = Arrays.copyOf(array,array.length);
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		System.out.println("*".repeat(5) + Arrays.toString(numbers));
		for (int i = 0; i < halfLength; i++){
			int temp = numbers[i];
			numbers[i] = numbers[maxIndex - i];
			numbers[maxIndex - i] = temp;
			System.out.println("-".repeat(5) + Arrays.toString(numbers));
		}

		return numbers;
		
	}
}