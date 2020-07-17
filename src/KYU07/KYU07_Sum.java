package KYU07;

public class KYU07_Sum {

	public static int sum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
			System.out.println(i + "\t" + sum);
		}
		return sum;
	}

	public static int GetSum(int a, int b) {
		int out = 0;
		if (a == b) {
			return a;
		} else {
			if (a < b) {
				return sum(a, b);
			} else
				return sum(b, a);

		}

		// albo
		// return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
	}

	public static void main(String[] args) {
		GetSum(0, 1);

	}

}
