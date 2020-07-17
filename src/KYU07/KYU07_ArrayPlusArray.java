package KYU07;

import java.util.stream.IntStream;

public class KYU07_ArrayPlusArray {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int sum1 = IntStream.of(arr1).sum();
		int sum2 = IntStream.of(arr2).sum();

		System.out.print(IntStream.of(IntStream.of(arr1).sum(), IntStream.of(arr2).sum()).sum());

		return IntStream.of(IntStream.of(arr1).sum(), IntStream.of(arr2).sum()).sum();

	}

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3 };
		int[] arr2 = new int[] { 4, 5, 6 };
		arrayPlusArray(arr1, arr2);

	}
}
