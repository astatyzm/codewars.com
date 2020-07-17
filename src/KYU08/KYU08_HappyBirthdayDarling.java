package KYU08;

public class KYU08_HappyBirthdayDarling {
	public static String womensAge(int n) {
		System.out.println(n + "?" + " That's just " + (20 + n % 2) + ", in base " + n / 2 + "!");
		return n + "?" + " That's just " + (20 + n % 2) + ", in base " + n / 2 + "!";
	}

	public static void main(String[] args) {
		womensAge(39);

	}

}
