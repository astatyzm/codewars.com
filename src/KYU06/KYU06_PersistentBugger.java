package KYU06;

public class KYU06_PersistentBugger {
	public static int persistence(long n) {
		int counter = 0;

		while (n >= 10) {
			n = getMultiplyOfDigits(n);
			counter++;
		}
		return counter;
	}

	public static int getMultiplyOfDigits(long n) {

		int result = (int) (n % 10);
		System.out.println(result);
		while ((n /= 10) > 0) {
			System.out.println(n);
			result *= n % 10;
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// persistence(39);
		getMultiplyOfDigits(54);
	}

}
