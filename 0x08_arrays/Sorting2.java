import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		Integer[] randArray = getRandomArray(10);

		System.out.println(Arrays.toString(randArray));
		
		Arrays.sort(randArray, Collections.reverseOrder());
		System.out.println(Arrays.toString(randArray));
	}

	public static Integer[] getRandomArray(Integer len) {
		Integer[] newArray = new Integer[len];
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			newArray[i] = random.nextInt(-25, 25);
		}

		return newArray;
	}
}