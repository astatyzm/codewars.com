package KYU07;

public class KYU07_DisemvowelTrolls {
	public static String disemvowel(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		disemvowel("This is a new website");
	}

}
