package codePractice;

import java.util.*;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false*/

public class ArrayContainsDuplicate {
	public static void main(String[] args) {
		ArrayContainsDuplicate arrayContainsDuplicate = new ArrayContainsDuplicate();
		int arr[] = { 1, 2, 3, 4, 1 };
		System.out.println(arrayContainsDuplicate.containsDuplicate(arr));
	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> newSet = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!newSet.add(nums[i])) {
				return true;
			}
		}
		return false;
	}
}
