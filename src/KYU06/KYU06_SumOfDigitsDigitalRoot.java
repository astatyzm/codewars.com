package KYU06;

public class KYU06_SumOfDigitsDigitalRoot {

	public static int digital_root(int n) {
		int dig;
		int sum = 0;
		String number = String.valueOf(n);

		for (int i = 0; i < number.length(); i++) {
			dig = Character.digit(number.charAt(i), 10);
			System.out.print(dig + "\n");
			sum = sum + dig;
			System.out.print("suma = " + sum + "\n");
		}
		if (sum > 9) {
			System.out.print("suma = " + sum + "\n");
			return digital_root(sum);
		}

		else {
			System.out.print("suma = " + sum + "\n");
			return sum;
		}
	}

	public static void main(String[] args) {
		digital_root(456);

		/*
		 * Inta poci¹æ na iloœc znaków suma wszystkich dopóki nie jest to liczba
		 * jednocyfrowa (mo¿e while od liczba < 9 i -- ??
		 */

	}
}
