package KYU06;

public class KYU06_BackwardsReadPrimes {

	public static boolean isPrime(long n) {
		boolean flag = false;
		if (n % 2 == 0)
			flag = false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			} else
				flag = true;
		}
		System.out.print(flag);
		return flag;

		/*
		 * liczbê n dzielê kolejno przez liczby (od i do n, 1,2,3...n) je¿eli wynik z
		 * dzielenia (przez ity numer) jest bez reszty to ustawiam false - liczba nie
		 * jest pierwsza np 10 % 2 = 5 wiêc reszta 0 else liczba jest liczb¹ pierwsz¹
		 */
	}

	public static String backwardsPrime(long start, long end) {
		StringBuilder strb = new StringBuilder();
		while (start <= end) {
			int rev = Integer.parseInt(new StringBuilder(Long.toString(start)).reverse().toString());
			if ((start > 11) && isPrime(start) && isPrime(rev) && (start != rev)) {
				strb.append(start + " ");
			}
			start++;
		}
		System.out.print(strb);
		return strb.toString().trim();
	}

	public static void main(String[] args) {
		isPrime(10);
		// backwardsPrime(2, 100);

		/*
		 * w podanym przedziale min, max (tylko liczby dodatnie) znajdz: - liczby
		 * pierwsze, które s¹ palindromami (czytane od Lewej do Prawej = od Prawej do
		 * Lewej) np 13 i 31 to palindromy. backwardsPrime(2, 100) =>
		 * "13 17 31 37 71 73 79 97" backwardsPrime(9900, 10000) =>
		 * "9923 9931 9941 9967"
		 */

	}
}
