package codePractice;

public class FirstAndLastIndexOfAnElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 5, 5, 7, 8, 5, 10 };
		int firstIndex = -1;
		int lastIndex = -1;
		int target = 5;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				if (firstIndex == -1) {
					firstIndex = i;
				}
				lastIndex = i;
			}
		}
		if (firstIndex != -1) {
			System.out.println("first and last position of " + target + " are " + firstIndex + "," + lastIndex);
		} else {
			System.out.println("Number" + target + "not found in the array");
		}
	}

}
