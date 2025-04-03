import java.util.Arrays;

public class Another {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,5};
		int[][] moreNumbers = {
			{10,20,30,40},
			{3,5,7,9}
		};

		System.out.println(numbers);
		System.out.println(Arrays.toString(numbers));

		for (int [] elem: moreNumbers) {
			System.out.println(Arrays.toString(elem));
		}
		System.out.println("-".repeat(25));
		System.out.println(Arrays.deepToString(moreNumbers));
		System.out.println(Arrays.toString(moreNumbers));
	}
}