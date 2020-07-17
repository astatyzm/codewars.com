package KYU07;

import java.util.stream.IntStream;

public class KYU07_Largest5DigitNumberInASeries {
	public static int solve(final String digits) {
		// znajowanie max liczby 5 cyfrowej z podanego stringa
		int strem = IntStream.range(0, digits.length() - 4).mapToObj(i -> digits.substring(i, i + 5))
				.mapToInt(Integer::parseInt).max().orElse(0);

		int max = Integer.valueOf(digits.substring(0, 4));
		if (digits.length() < 5) {
			System.out.println(digits);
			return Integer.parseInt(digits);
		} else {
			for (int i = 0; i < digits.length() - 4; i++) {

				System.out.println("max = " + max);
				if (max < Integer.valueOf(digits.substring(i, i + 5))) {
					max = Integer.valueOf(digits.substring(i, i + 5));
					System.out.println("jestem tu a max = " + max);
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		solve("283910");
	}
}
