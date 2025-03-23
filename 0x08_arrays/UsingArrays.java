import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
	public static void main(String[] args) {
		int[] newArray = getRandomArray(10);
		System.out.println(Arrays.toString(newArray));

		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));

		int[] secondArray = new int[10];
		System.out.println(Arrays.toString(secondArray));
		Arrays.fill(secondArray, 5);
		System.out.println(Arrays.toString(secondArray));
		System.out.println();

		int[] thirdArray = getRandomArray(15);
		int[] fourthArray = Arrays.copyOf(thirdArray, 7);
		System.out.println(Arrays.toString(fourthArray));

	}

	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] array = new int[len];

		for (int i = 0; i < len; i++) {
			array[i] = random.nextInt(-20, 20);
		}

		return array;
	}
}