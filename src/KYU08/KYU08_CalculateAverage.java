package KYU08;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KYU08_CalculateAverage {
	public static double find_average(int[] array) {
		System.out.println((double) IntStream.of(array).sum() / array.length);
		Arrays.stream(array).average().orElse(0);
		IntStream.of(array).average().getAsDouble();

		return 0;

	}

	public static void main(String[] args) {
		find_average(new int[] { 1, 2, 3 });
	}

}
