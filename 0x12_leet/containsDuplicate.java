import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    if (count >= 2) {
                        return true;
                    }
                }
            }
            count = 0;
        }
        return false;
        
    }

    public static boolean containsDuplicate2(int[] nums) {
      Set<Integer> seen = new HashSet<>();
      for (int num : nums) {
        if (seen.contains(num)) {
          return true;
        }
        seen.add(num);
      }
      return false;
    }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4, 3};
    int[] nums2 = { 3, 4, 7, 8, 0, 4 };
    System.out.println(containsDuplicate(nums));
    System.out.println(containsDuplicate2(nums2));
  }
}
