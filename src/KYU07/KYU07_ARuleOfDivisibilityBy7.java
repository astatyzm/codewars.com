package KYU07;

public class KYU07_ARuleOfDivisibilityBy7 {
	public static long[] seven(long m) {
		long stepNum = 0;
		long rest = 0;

		while (m > 99) {
			rest = m % 10;

			m = (m - rest) / 10 - (2 * rest);
			stepNum++;
			System.out.print("last dig " + m + " stepNum " + stepNum + "\n");
		}
		return new long[] { m, stepNum };

	}

	public static void main(String[] args) {
		seven(371);
	}
}
