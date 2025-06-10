import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class insertionSort2 {
  private static int[] sort(int[] numbers) {
    for (int i = 1; i < numbers.length; i++) {
      int j = i - 1;
      while ((j >= 0) && (numbers[j+1] < numbers[j])) {
        int temp = numbers[j + 1];
        numbers[j + 1] = numbers[j];
        numbers[j] = temp;
        j--;
      }
    }
    return numbers;
  }

  public static void main(String[] args) {
    int[] nums = {4,2,1,3,9};
    System.out.println(Arrays.toString(sort(nums)));

    int[] nums2 = {2, -2, 4, 6, 7, 8, -5, 20, 11, 14, 0};
    /* Stream version to convert to List<Integer> and sort descending */
    List<Integer> sortedDesc = Arrays.stream(nums2)
                                    .boxed() /* Convert int to Integer */
                                    .sorted((a, b) -> b - a) /* Lambda descending */
                                    .collect(Collectors.toList());

    System.out.println(sortedDesc);
    
  }
}
