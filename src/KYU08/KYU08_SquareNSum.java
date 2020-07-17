package KYU08;

import java.util.Arrays;

public class KYU08_SquareNSum {
	public static int squareSum(int[] n) {
		int sum = 0;
		int tab[] = n;

		for (int i = 0; i < n.length; i++) {
			System.out.print("i = " + i + " ");
			sum = sum + tab[i] * tab[i];
			System.out.print(" tab[i] " + tab[i] + " sum = " + sum + "\n");

		}
		Arrays.stream(n).map(x -> x * x).sum();

		return sum;
	}

	public static void main(String[] args) {

		int[] n = { 1, 2, 2 };
		squareSum(n);

		/*
		 * Complete the square sum function so that it squares each number passed into
		 * it and then sums the results together.
		 * 
		 * For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
		 */

	}
}
