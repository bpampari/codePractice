package stringfun;

public class NewStringAdd {

	public static void main(String[] args) {
		String s = new String("5");
		System.out.println(1 + 10 + s + 1 + 10); // Output 115110

		/*
		 * -------------------
		 */
		String java = "Java";
		java.concat("Program");
		System.out.println(java); // Java

		/*
		 * -------------------
		 */
		String hello = "Hello";
		hello += "World";
		System.out.println(hello.length()); // 10

		/*
		 * -------------------
		 */

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i); // 1,3,5,7,9
		}

		int i = 0;
		for (i = 0; i < 10; i++) {
			continue;
		}
		System.out.println(i); // 10

		int[] x = { 120, 200, 016 }; // 016 is octa code
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j] + " ");
		}
	}

}
