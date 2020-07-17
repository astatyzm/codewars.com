package KYU07;

public class KYU07_RowWeights {
	public static int[] rowWeights(final int[] weights) {
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < weights.length; i++) {
			if (i % 2 == 0) {
				sum1 += weights[i];
			} else {
				sum2 += weights[i];
			}
		}
		int[] res = { sum1, sum2 };

		System.out.print(" sum = " + sum1 + "\t");
		System.out.print(" sum = " + sum2 + "\t");
		System.out.print(" res = " + res + "\t");

		return new int[] { sum1, sum2 };
	}

	public static void main(String[] args) {
		int[] weights = new int[] { 80, 0, 7, 20, 5 };
		rowWeights(weights);
	}
}
