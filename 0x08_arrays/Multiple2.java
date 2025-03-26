import java.util.Arrays;

public class Multiple2 {
	public static void main(String[] args) {
		Object[] anyArray = new Object[3];
		System.out.println(Arrays.toString(anyArray));

		anyArray[0] = new String[] {"a", "b", "c"};
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[1] = new String[][] {
			{"1", "2"},
			{"3", "4", "5"},
			{"6", "7", "8", "9"}
		};
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[2] = new int[2][2][2];
		System.out.println(Arrays.deepToString(anyArray));


		for (Object element : anyArray) {
			System.out.println("Element type: " + element.getClass().getSimpleName());
			System.out.println("Element toString(): " + element);
			System.out.println(Arrays.deepToString((Object[]) element));
		}
	}
}