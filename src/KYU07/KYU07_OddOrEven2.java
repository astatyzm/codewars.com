package KYU07;

import java.util.Arrays;

public class KYU07_OddOrEven2 {
	public static String oddOrEven(int[] array) {

		int sum = Arrays.stream(array).sum();
		// System.out.println("len = " + array.length);
		for (int i = 0; i < array.length; i++) {
			// System.out.println("i = " + array[i]);

		}

		System.out.print(sum);
		return (sum % 2 == 0) ? "even" : "odd";
		// return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
		// odd nie parzysty, even parzysty

	}

	public static void main(String[] args) {
		oddOrEven(new int[] { 2, 5, 34, 6 });
	}

}
