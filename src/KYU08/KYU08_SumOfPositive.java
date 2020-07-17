package KYU08;

import java.util.stream.IntStream;

public class KYU08_SumOfPositive {
	public static int sum(int[] arr) {
		return IntStream.of(arr).filter(i -> i > 0).sum();
	}

}
