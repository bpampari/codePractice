package stringfun;

public class ExtractDigitAndSumFromString {

	public static void main(String[] args) {
		String str = "1Test23";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				String ch = str.charAt(i) + "";
				sum = sum + Integer.parseInt(ch);
			}
		}

		System.out.println("Sum of Individual digits in a string: " + sum); // 6 is the output here

		// Same program, continuous digits should be considered a single number,
		// 1abc2x30yz67 - output should be 100
		String str2 = "1abc2x30yz67";
		String tempStr = "0";
		int newSum = 0;

		for (int i = 0; i < str2.length(); i++) {
			if (Character.isDigit(str2.charAt(i))) {
				tempStr = tempStr + str2.charAt(i);
			} else {
				newSum = newSum + Integer.parseInt(tempStr);
				tempStr = "0";
			}
		}
		
		System.out.println(newSum+Integer.parseInt(tempStr));

	}

}
