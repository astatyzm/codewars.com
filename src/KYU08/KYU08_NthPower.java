package KYU08;

public class KYU08_NthPower {
	public static int nthPower(int[] array, int n) {
		int result = 0;
		if (n < array.length) {
			result = (int) Math.pow(array[n], n);
		} else {
			result = -1;
		}
		return result;
	}

	public static int nthPower2(int[] array, int n) {
		if (n < 0 || n >= array.length)
			return -1;
		return (int) Math.pow(array[n], n);
	}

	public static void main(String[] args) {
		nthPower(new int[] { 3, 1, 2, 2 }, 3);
	}

}
