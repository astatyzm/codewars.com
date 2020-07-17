package KYU08;

public class KYU08_FirstNonConsecutive {
	static Integer find(final int[] array) {
		Integer result = null;
		if (array.length >= 2) {
			for (int i = 1; i < array.length; i++) {
				int diff = array[i] - array[i - 1];
				if (diff != 1) {
					result = array[i];
					break;
				}
			}
		} else {
			System.out.print("Wrong array size");
		}
		System.out.print("Result = " + result + "\n");
		return result;

	}

	public static void main(String[] args) {
		int intArray[] = new int[] { 1, 2, 3, 4, 6, 7, 8 };
		// int intArray[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int intArray[] = new int[] {4, 6, 7, 8, 9, 11};
		// int intArray[] = new int[]{4, 5, 6, 7, 8, 9, 11};
		// int intArray[] = new int[] {-5, -4, -3, -1};
		find(intArray);
	}
}
