package codePractice;

//Input: nums = [1,3,5,6], target = 5
//Output: 2
public class ArrayInsertionOrder {
	public static void main(String[] args) {
		ArrayInsertionOrder asr = new ArrayInsertionOrder();
		int nums[] = { 1, 3, 5, 6 };
		System.out.println(asr.searchInsert(nums, 7));
	}

	public int searchInsert(int[] nums, int target) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				index = i;
			} else if (nums[i] < target) {
				index = i + 1;
			}
		}
		return index;

	}
}
