package KYU07;

public class KYU07_Vowels {
	public static int getCount(String str) {
		int vowelsCount = 0;
		char[] tab = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if ((tab[i] == 'a') || (tab[i] == 'e') || (tab[i] == 'i') || (tab[i] == 'o') || (tab[i] == 'u')) {
				vowelsCount++;
			}
		}

		System.out.print("Vowel count = " + vowelsCount);
		return vowelsCount;
	}

	public static void main(String[] args) {
		getCount("abracadabra");

	}

}
