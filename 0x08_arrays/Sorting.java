import java.util.Arrays;
import java.util.Random;

public class Sorting {
	public static void main(String[] args) {
		
		int[] randArray = getRandomArray(10);

		System.out.println(Arrays.toString(randArray));
		Arrays.sort(randArray);
		int[] revArray = reverseArray(randArray);
		System.out.println(Arrays.toString(randArray));
		System.out.println(Arrays.toString(revArray));
	}

	public static int[] getRandomArray(int len) {
		
		int[] newArray = new int[len];
		Random random = new Random();
		for (int i = 0; i < len; i++) {
			newArray[i] = random.nextInt(-25, 25);
		}

		return newArray;
	}

	public static int[] reverseArray(int[] arr) {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArr.length - 1; i++) {
				if (sortedArr[i] < sortedArr[i + 1]) {
					temp = sortedArr[i];
					sortedArr[i] = sortedArr[i + 1];
					sortedArr[i + 1] = temp;
					flag = true;
				}
			}
		}

		return sortedArr;
	}
}
