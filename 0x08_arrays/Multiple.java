import java.util.Arrays;

public class Multiple {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i * j) + 1;
			}
		}

		for (int[] outer : arr) {
			System.out.println(Arrays.toString(outer));
		}

		for (var outer : arr) {
			for (var inner : outer) {
				System.out.print(inner + " ");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(arr));
	}
}