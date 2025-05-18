/**
 * Problem: Leetcode 219. Contains Duplicate II
 * 
 * Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j in the array such that nums[i] == nums[j]
 * and abs(i - j) <= k.
 *  
 */

import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIdx = map.get(nums[i]);
                if ((i - prevIdx) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		System.out.println(containsNearbyDuplicate(nums, 2));
	}
}