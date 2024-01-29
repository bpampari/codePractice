package codePractice;

public class FactorsOfANumber {
	public static void main(String[] args) {
		int n = 10;
		// optimal way is to check till the square root of the given number
		// because the other factors are already covered when we check the condition
		// till the square root of the number
		// ex: for 16, 2*8, so if we check till 4 which is sqrt of 16, 2 and 8 are
		// covered
		for (int i = 1; i <= Math.sqrt(n); i++) {
			// If n is divisible by i, print i
			if (n % i == 0) {
				System.out.println(i);

				// to get the other factor, check values other than i.
				if (n / i != i) {
					System.out.println(n / i);
				}
			}

		}
	}

}
