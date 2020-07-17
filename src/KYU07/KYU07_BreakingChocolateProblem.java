package KYU07;

public class KYU07_BreakingChocolateProblem {
	public static int breakChocolate(int n, int m) {
		// Java ternary operator
		// return (n == 0 || m == 0) ? 0:(n * m - 1);

		if (n == 0 || m == 0) {
			return 0;
		} else
			return n * m - 1;

	}

	public static void main(String[] args) {
		breakChocolate(3, 1);
	}
}
