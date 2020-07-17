package KYU07;

public class KYU07_HalvingSum {
	public static int halvingSum(int n) {

		int res = n;
		int sum = n;
		while (res > 1) {
			res = res / 2;
			sum += res;
			System.out.println("res = " + res + " sum = " + sum);
		}

		return sum;

	}

	public static void main(String[] args) {
		halvingSum(25);
	}

}
