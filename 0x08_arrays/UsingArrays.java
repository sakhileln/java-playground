import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
	public static void main(String[] args) {
		int[] newArray = getRandomArray(10);
		System.out.println((newArray));

		Arrays.sort(newArray);
		System.out.println(Arrays.toString(newArray));
	}

	public static int[] getRandomArray(int len) {
		Random random = new Random();
		int[] array = new int[len];

		for (int i = 0; i < len; i++) {
			array[i] = random.nextInt(-15, 10);
		}

		return array;
	}
}