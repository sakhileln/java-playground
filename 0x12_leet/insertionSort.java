import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

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
    
    int[] nums2 = {2,-2,4,6,7,8,-5,20,11,14,0};
    List<Integer> nums3 = new ArrayList<>();
    for (int n : nums2) { nums3.add(n); }
    Collections.sort(nums3);
    System.out.println(nums3);

    Collections.sort(nums3, Collections.reverseOrder());
    System.out.println(nums3);
  }
}
