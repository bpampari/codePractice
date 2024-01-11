package codePractice;

/*Given an unsorted integer array nums, return the smallest missing positive integer.

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.*/

public class FirstMissingPositiveInteger {
	public static void main(String[] args) {
		int[] nums = {3,4,-1,1};
		int missingNumber = 1;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]==missingNumber) {
				missingNumber++;
			}
		}
		System.out.println("smallest missing positive integer value is: "+ missingNumber);
		
	}

}
