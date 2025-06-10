import java.util.Arrays;

public class insertionSort {
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
  }
}
