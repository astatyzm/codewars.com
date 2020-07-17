package KYU07;

import java.util.stream.IntStream;

public class KYU07_ReturnTheFirstMMultiplesOfN {
	public static int[] multiples(int m, int n) {
		int[] res = new int[m];
		for (int i = 0; i < res.length; i++) {
			res[i] = i * n + n;
			System.out.println(i + "\t" + res[i]);
		}
		System.out.print("len = " + res.length);

		IntStream.rangeClosed(1, m).map(x -> x * n).toArray();

		IntStream.range(1, m + 1).map(x -> x * n).toArray();

		return res;
	}

	public static void main(String[] args) {
		multiples(3, 5);
	}

}
