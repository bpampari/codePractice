package codePractice;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

public class ArraySum {

	public static void main(String[] args) {

		int num[] = { 5, 2, 7, 9 };
		int target = 9;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println(i + " , " + j);
				}
			}
		}

	}

}
