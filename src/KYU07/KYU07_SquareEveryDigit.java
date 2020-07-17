package KYU07;

public class KYU07_SquareEveryDigit {
	public static int squareDigits(int n) {
		// *************** solution 1 ****************************************
		StringBuilder strb = new StringBuilder();
		char tab[] = String.valueOf(n).toCharArray();
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
			int res = (int) Math.pow(Character.getNumericValue(tab[i]), 2);
			System.out.println(res);
			strb.append(res);
		}

		System.out.println("end " + Integer.valueOf(strb.toString()));
		// return Integer.valueOf(strb.toString());

		// *************** solution 2 ****************************************

		String result = "";
		while (n != 0) {
			int digit = n % 10;
			System.out.println("digit = " + digit);
			result = digit * digit + result;
			System.out.println("result = " + result);
			n /= 10;
		}

		return Integer.parseInt(result);

	}

	public static void main(String[] args) {
		squareDigits(9119);
	}
}
