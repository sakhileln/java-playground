/**
 * Leetcode: 1. Two Sum
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice. You can return the answer in any order.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
	private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if (map.containsKey(complement)) {
        		return new int[] { map.get(complement), i};
        	}
        	map.put(nums[i], i);
        }

        return new int[] {};
    }
    public static void main(String[] args) {
    	int[] nums = {2,7,11,15};
    	int[] nums2 = {3,2,4};
    	int target = 9;
    	System.out.println(Arrays.toString(twoSum(nums2, 6)));
    }
}