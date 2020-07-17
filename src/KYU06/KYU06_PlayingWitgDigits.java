package KYU06;

import java.util.stream.IntStream;

public class KYU06_PlayingWitgDigits {
	public static long digPow(int n, int p) {
		int res = 0;
		char[] tab = String.valueOf(n).toCharArray();
		int[] digits = new int[tab.length];

		for (int i = 0; i < tab.length; i++) {
			digits[i] = Character.getNumericValue(tab[i]); // zamiana chara na inta
			res += (int) Math.pow(digits[i], p + i);
			System.out.println(digits[i] + "\t" + res);
		}

		int[] dig = String.valueOf(n).chars().map(Character::getNumericValue).toArray();

		int sum = IntStream.range(0, dig.length).map(i -> (int) Math.pow(dig[i], i + p)).sum();

		System.out.println((res % n == 0) ? res / n : -1);
		return (res % n == 0) ? res / n : -1;
	}

	public static void main(String[] args) {

		digPow(46288, 3);
	}
}
