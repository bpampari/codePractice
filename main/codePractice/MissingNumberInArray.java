package codePractice;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = 0, arSum = 0;
		int missingValue = 0;
		for (int i = 1; i <= arr.length + 1; i++) {
			sum = sum + i;
		}

		for (int i = 0; i < arr.length; i++) {
			arSum = arSum + arr[i];
		}
		System.out.println(sum - arSum);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] > 1) {
				missingValue = arr[i] + 1;
			}
		}
		System.out.println(missingValue);
	}

}
