package KYU07;

public class KYU07_AreTheNumbersInOrder {
	public static boolean isAscOrder(int[] arr) {

		boolean result = false;
		if (arr.length == 1) {
			result = true;
		} else {
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					System.out.print("ma byæ zle ");
					result = false;
					break;
				} else
					result = true;
			}
		}

		System.out.print(result);

		/*
		 * int[] copyArr = Arrays.copyOf(arr, arr.length); Arrays.sort(copyArr);
		 * 
		 * return Arrays.equals(copyArr, arr); }
		 */
		return result;
	}

	public static void main(String[] args) {
		// isAscOrder(new int[] {9,8,7,6,5,4,3,2,1});
		isAscOrder(new int[] { 1 });
	}
}
