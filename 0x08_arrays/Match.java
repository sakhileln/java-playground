import java.util.Arrays;

public class Match {
	public static void main(String[] args) {
		
		String[] sArray = {"Ze", "Zethe", "Sakhile", "Jane"};
		
		Arrays.sort(sArray);
		System.out.println(Arrays.toString(sArray));

		if (Arrays.binarySearch(sArray, "Sakhile") > 0) {
			System.out.println("Sakhile found in array.");
		} 

		int[] a1 = {1, 2, 3};
		int[] a2 = {1, 2, 3};
		if (Arrays.equals(a1, a2)) {
			System.out.println("Arrays are the same.");
		} else {
			System.out.println("Arrays are NOT the same.");
		}
	}
}
